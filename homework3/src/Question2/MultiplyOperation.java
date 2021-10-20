package Question2;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question2.MultiplyOperation
 * @date 2021/10/19 19:10
 */
public class MultiplyOperation implements MathOperation{
    @Override
    public int performOperation(int num1, int num2) {
        return num1 * num2;
    }
}