package edu.northeastern.yanxuan;

public class CreditCardStrategy implements PaymentStrategy {
    String cardNumber;

    public CreditCardStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int money) {
        System.out.println("CreditCard : $" + money);
    }
}
