package DecoratorPattern;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: BasicCar
 * @date 2021/11/21 10:30
 */
public class BasicCar implements Car{
    public BasicCar(){}

    @Override
    public void assemble() {
        System.out.print("Basic Car. ");
    }
}
