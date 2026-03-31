/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author famil
 */
public class Customer {
    private Card card;

    public Customer(Card card) {
        this.card = card;
    }

    public void withdraw(ATM atm) {
        atm.process(this);
    }

    public Card insertCard() {
        return card;
    }

    public String enterPIN() {
        return "1234";
    }

    public int requestedAmount() {
        return 100;
    }
}