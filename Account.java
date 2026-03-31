/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author famil
 */
public class Account {
    private final String accnum;
    private int balance;

    public Account(String accnum, int balance) {
        this.accnum = accnum;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void modify(int amount) {
        balance += amount;
    }
}