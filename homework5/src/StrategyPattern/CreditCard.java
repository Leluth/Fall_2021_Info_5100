package StrategyPattern;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: CreditCard
 * @date 2021/11/21 11:02
 */
public class CreditCard implements PaymentStrategy {
    private final String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int price) {
        System.out.println("CreditCard : $" + price);
    }
}
