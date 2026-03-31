
package atm;


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
