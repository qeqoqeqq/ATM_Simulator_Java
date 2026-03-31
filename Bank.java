/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author famil
 */
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private final Map<String, Account> accounts;
    private final Map<String, Card> cards;

    public Bank() {
        this.accounts = new HashMap<>();
        this.cards = new HashMap<>();
    }

    public void createAccount(String accnum, int balance) {
        accounts.put(accnum, new Account(accnum, balance));
    }

    public int getBalance(String cardnum) {
        Account acc = searchAccount(cardnum);
        return (acc != null) ? acc.getBalance() : 0;
    }

    public void transaction(String cardnum, int amount) {
        Account acc = searchAccount(cardnum);
        if (acc != null) {
            acc.modify(amount);
        }
    }

    private Account searchAccount(String cardnum) {
        return accounts.get(cardnum);
    }

    public void insertCard(String cardnum, String pin) {
        // Assuming the card number maps directly to the account number
        if (accounts.containsKey(cardnum)) {
            cards.put(cardnum, new Card(cardnum, pin));
        }
    }

    public Card getCard(String cardnum) {
        return cards.get(cardnum);
    }
}
