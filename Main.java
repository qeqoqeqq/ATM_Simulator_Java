/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author famil
 */
public class Main {
    public static void main(String[] args) {
        Center center = new Center();
        Bank bank1 = new Bank();
        bank1.createAccount("123456", 200);
        center.addBank("1", bank1);

        ATM atm = new ATM("Downtown", center);

        Card card = new Card("123456", "1234");
        Customer customer = new Customer(card);

        customer.withdraw(atm);
    }
}
