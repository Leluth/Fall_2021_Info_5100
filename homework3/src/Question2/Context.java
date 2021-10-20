package Question2;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question2.Context
 * @date 2021/10/19 19:10
 */
public class Context {
    MathOperation operation;
    public Context(MathOperation operation) {
        this.operation = operation;
    }
    public int execute(int num1, int num2) {
        return operation.performOperation(num1, num2);
    }
}
