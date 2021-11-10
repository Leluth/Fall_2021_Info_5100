import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: TrafficLight
 * @date 2021/11/7 20:02
 */
public class TrafficLight {
    // main function
    public static void main(String[] args) throws InterruptedException {
        int[] cars = new int[]{1,3,5,2,4};
        int[] directions = new int[]{2,1,2,4,3};
        int[] arrivalTimes = new int[]{10,20,30,40,50};
        test(cars, directions, arrivalTimes);

        cars = new int[]{1,2,3,4,5};
        directions = new int[]{2,4,3,3,1};
        arrivalTimes = new int[]{10,20,30,40,40};
        test(cars, directions, arrivalTimes);
    }

    private final ReentrantLock lock;
    private boolean isLightAGreen;
    public TrafficLight() {
        lock = new ReentrantLock(true);
        isLightAGreen = true;
    }
    public void carArrived(
            int carId,           // ID of the car
            int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
            int direction,       // Direction of the car
            Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
            Runnable crossCar    // Use crossCar.run() to make car cross the intersection
    ) throws InterruptedException {
        lock.lock();
        try {
            if (!isLightAGreen && roadId == 1 || isLightAGreen && roadId == 2) {
                isLightAGreen = !isLightAGreen;
                turnGreen.run();
            }
            crossCar.run();
        } finally {
            lock.unlock();
        }
    }

    // test carArrived function in multy-thread environment
    private static void test(int[] cars, int[] directions, int[] arrivalTimes) throws InterruptedException {
        TrafficLight trafficLight = new TrafficLight();
        CountDownLatch latch = new CountDownLatch(cars.length);
        for (int i = 0; i < cars.length; i++) {
            int carId = cars[i];
            int direction = directions[i];
            int roadId = (direction + 1) / 2;
            Runnable turnGreen = () -> {
                // "Traffic Light On Road B Is Green"
                StringBuilder sb = new StringBuilder();
                sb.append("Traffic Light On Road ");
                sb.append(roadId == 1 ? "A" : "B");
                sb.append(" Is Green");
                System.out.println(sb);
            };
            Runnable crossCar = () -> {
                StringBuilder sb = new StringBuilder();
                sb.append("Car ");
                sb.append(carId);
                sb.append(" Has Passed Road ");
                sb.append(roadId == 1 ? "A" : "B");
                sb.append(" In Direction ");
                sb.append(direction);
                System.out.println(sb);
            };
            if (i == 0) {
                Thread.sleep(arrivalTimes[0]);
            } else {
                Thread.sleep(arrivalTimes[i] - arrivalTimes[i - 1]);
            }
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        trafficLight.carArrived(carId, roadId, direction, turnGreen, crossCar);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        latch.countDown();
                    }
                }
            }).start();
        }
        latch.await();
        System.out.println();
    }
}
