import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: LinkedList
 * @date 2021/11/7 13:05
 */
public class LinkedList {
    public static void main(String[] args) throws InterruptedException {
        LinkedList list = new LinkedList();
        int threadNum = 6;
        CountDownLatch latch = new CountDownLatch(threadNum);
        List<Thread> threads = new ArrayList<>();
        threads.add(new AddElementThread(latch, list, 0, 1));
        threads.add(new AddElementThread(latch, list, 0, 0));
        threads.add(new GetFirstThread(latch, list));
        threads.add(new GetLastThread(latch, list));
        threads.add(new RemoveElementThread(latch, list, 0, 0));
        threads.add(new GetSizeThread(latch, list));
        for (int i = 0; i < threadNum; i++) {
            threads.get(i).start();
            Thread.sleep(10);
        }
        latch.await();
        System.out.println();

        list = new LinkedList();
        threadNum = 12;
        latch = new CountDownLatch(threadNum);
        threads = new ArrayList<>();
        threads.add(new AddElementThread(latch, list, 0, 0));
        threads.add(new GetFirstThread(latch, list));
        threads.add(new GetLastThread(latch, list));
        threads.add(new GetSizeThread(latch, list));
        threads.add(new AddElementThread(latch, list, 1, 1));
        threads.add(new GetFirstThread(latch, list));
        threads.add(new GetLastThread(latch, list));
        threads.add(new GetSizeThread(latch, list));
        threads.add(new RemoveElementThread(latch, list, 0, 0));
        threads.add(new GetFirstThread(latch, list));
        threads.add(new GetLastThread(latch, list));
        threads.add(new GetSizeThread(latch, list));
        for (int i = 0; i < threadNum; i++) {
            threads.get(i).start();
            Thread.sleep(10);
        }
        latch.await();
        System.out.println();
    }

    static class Node {
        public Integer val;
        public Node next;

        public Node() {
        }

        public Node(Integer val) {
            this.val = val;
        }

        public Node(Integer val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private final Node head;
    private int size;
    private final ReentrantReadWriteLock lock;

    public LinkedList() {
        this.head = new Node();
        this.size = 0;
        this.lock = new ReentrantReadWriteLock();
    }

    public void addAtPosition(int index, int element) {
        int count = -1;
        Node cur = head;
        Node node = new Node(element);
        if (index <= size) {
            lock.writeLock().lock();
            while (count++ < index - 1) {
                cur = cur.next;
            }
            Node next = cur.next;
            cur.next = node;
            node.next = next;
            size++;
            lock.writeLock().unlock();
        }
    }

    public void removeAtPosition(int index, int element) {
        int count = -1;
        Node cur = head;
        if (index < size) {
            lock.writeLock().lock();
            while (count++ < index - 1) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            size--;
            lock.writeLock().unlock();
        }
    }

    public int getFirst() {
        int res = 0;
        lock.readLock().lock();
        if (head.next != null) {
            res = head.next.val;
        }
        lock.readLock().unlock();
        return res;
    }

    public int getLast() {
        int res = 0;
        int count = 0;
        Node cur = head;
        lock.readLock().lock();
        while (count++ < size) {
            cur = cur.next;
            res = cur.val;
        }
        lock.readLock().unlock();
        return res;
    }

    public int size() {
        int res = 0;
        lock.readLock().lock();
        res = size;
        lock.readLock().unlock();
        return res;
    }

    static class AddElementThread extends Thread {
        CountDownLatch latch;
        LinkedList list;
        int index;
        int element;
        public AddElementThread(CountDownLatch latch, LinkedList list, int index, int element) {
            this.latch = latch;
            this.list = list;
            this.index = index;
            this.element = element;
        }
        @Override
        public void run() {
            list.addAtPosition(index, element);
            System.out.println("Finished adding " + element + " At Index " + index);
            latch.countDown();
        }
    }

    static class RemoveElementThread extends Thread {
        CountDownLatch latch;
        LinkedList list;
        int index;
        int element;
        public RemoveElementThread(CountDownLatch latch, LinkedList list, int index, int element) {
            this.latch = latch;
            this.list = list;
            this.index = index;
            this.element = element;
        }
        @Override
        public void run() {
            list.removeAtPosition(index, element);
            System.out.println("Finished removing Element At Index " + index);
            latch.countDown();
        }
    }

    static class GetFirstThread extends Thread {
        CountDownLatch latch;
        LinkedList list;
        public GetFirstThread(CountDownLatch latch, LinkedList list) {
            this.latch = latch;
            this.list = list;
        }
        @Override
        public void run() {
            System.out.println("Current first element is " + list.getFirst());
            latch.countDown();
        }
    }

    static class GetLastThread extends Thread {
        CountDownLatch latch;
        LinkedList list;
        public GetLastThread(CountDownLatch latch, LinkedList list) {
            this.latch = latch;
            this.list = list;
        }
        @Override
        public void run() {
            System.out.println("Current last element is " + list.getLast());
            latch.countDown();
        }
    }

    static class GetSizeThread extends Thread {
        CountDownLatch latch;
        LinkedList list;
        public GetSizeThread(CountDownLatch latch, LinkedList list) {
            this.latch = latch;
            this.list = list;
        }
        @Override
        public void run() {
            System.out.println("Current size is " + list.size());
            latch.countDown();
        }
    }
}