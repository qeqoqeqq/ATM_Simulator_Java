
package atm;


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
