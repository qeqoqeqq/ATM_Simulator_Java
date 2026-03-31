
package atm;

public class Main {
    public static void main(String[] args) {
        
        Center clearingCenter = new Center();
        Bank elteBank = new Bank("ELTE_BANK");
        clearingCenter.registerBank(elteBank);

        Account myAccount = new Account("ACC_1001", 1500.00);
        Card myCard = new Card("4000-1234-5678-9010", "1234", "ACC_1001");
        
        elteBank.addAccount(myAccount);
        elteBank.addCard(myCard);

        Customer customer = new Customer("Alex", myCard);
        
        ATM atm = new ATM(clearingCenter, 5000.00);

        System.out.println("Starting ATM Simulation for " + customer.getName() + "...");
        
        atm.requestWithdrawal("ELTE_BANK", customer.getCard(), "1234", 500.00);

        atm.requestWithdrawal("ELTE_BANK", customer.getCard(), "9999", 100.00);

        atm.requestWithdrawal("ELTE_BANK", customer.getCard(), "1234", 2000.00);
    }
}
