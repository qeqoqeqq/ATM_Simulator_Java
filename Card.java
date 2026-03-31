/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author famil
 */
public class Card {
    private final String cardnum;
    private final String PIN;

    public Card(String cardnum, String PIN) {
        this.cardnum = cardnum;
        this.PIN = PIN;
    }

    public boolean checkPIN(String p) {
        return PIN.equals(p);
    }

    public String getCardnum() {
        return cardnum;
    }    
    
}
