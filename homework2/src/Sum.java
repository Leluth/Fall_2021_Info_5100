/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Sum
 * @date 2021/10/3 10:49
 */
public class Sum {
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.add(2, 3));
        System.out.println(sum.add(4, 9, 12));
        System.out.println(sum.add(4, 5.0));
        System.out.println(sum.add(15.5, 5));
        System.out.println(sum.add(1.0, 6.4));
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int add(int a, int b, int c) {
        return a + b + c;
    }

    private double add(int a, double b) {
        return a + b;
    }

    private double add(double a, int b) {
        return a + b;
    }

    private double add(double a, double b) {
        return a + b;
    }
}
