package DecoratorPattern;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: CarDecorator
 * @date 2021/11/21 10:33
 */
public class CarDecorator implements Car {
    private final Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void assemble() {
        decoratedCar.assemble();
    }
}
