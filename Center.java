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

public class Center {
    private final Map<String, Bank> banks = new HashMap<>();

    public void addBank(String bankId, Bank bank) {
        banks.put(bankId, bank);
    }

    public int getAmount(String cardnum) {
        Bank bank = searchBank(cardnum);
        return (bank != null) ? bank.getBalance(cardnum) : 0;
    }

    public void transaction(String cardnum, int amount) {
        Bank bank = searchBank(cardnum);
        if (bank != null) {
            bank.transaction(cardnum, amount);
        }
    }

    private Bank searchBank(String cardnum) {
        String bankId = cardnum.substring(0, 1);
        return banks.get(bankId);
    }
}