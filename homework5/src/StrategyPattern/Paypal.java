package StrategyPattern;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Paypal
 * @date 2021/11/21 11:05
 */
public class Paypal implements PaymentStrategy {
    private final String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void pay(int price) {
        System.out.println("Paypal : $" + price);
    }
}
