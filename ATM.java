/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author famil
 */
public class ATM {
    private final String location;
    private final Center center;

    public ATM(String location, Center center) {
        this.location = location;
        this.center = center;
    }

    public void process(Customer c) {
        Card card = c.insertCard();
        if (card.checkPIN(c.enterPIN())) {
            int amount = c.requestedAmount();
            if (center.getAmount(card.getCardnum()) >= amount) {
                center.transaction(card.getCardnum(), -amount);
                System.out.println("Dispensed: " + amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Incorrect PIN.");
        }
    }
}

