package DecoratorPattern;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: DecoratorPatternTest
 * @date 2021/11/21 10:42
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println();

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
