package DecoratorPattern;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: LuxuryCar
 * @date 2021/11/21 10:36
 */
public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of LuxuryCar. ");
    }
}
