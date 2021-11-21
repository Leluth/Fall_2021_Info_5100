package DecoratorPattern;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: SportsCar
 * @date 2021/11/21 10:40
 */
public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of SportsCar. ");
    }
}
