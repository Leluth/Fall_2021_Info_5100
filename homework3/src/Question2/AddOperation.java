package Question2;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question2.AddOperation
 * @date 2021/10/19 19:08
 */
public class AddOperation implements MathOperation{
    @Override
    public int performOperation(int num1, int num2) {
        return num1 + num2;
    }
}
