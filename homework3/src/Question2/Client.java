package Question2;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question2.Client
 * @date 2021/10/19 19:11
 */
public class Client {
    public static void main(String[] args) {
        Context contextAdd = new Context(new AddOperation());
        System.out.println(contextAdd.execute(5, 15)); // Expects 20

        Context contextSubtract = new Context(new SubtractOperation());
        System.out.println(contextSubtract.execute(50, 40)); // Expects 10

        Context contextMultiply = new Context(new MultiplyOperation());
        System.out.println(contextMultiply.execute(4, 25)); // Expects 100
    }
}
