import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AtmTest {

    @Test
    public void testSuccessfulWithdrawal() {
        Account account = new Account("TEST_ACC", 1000.0);
        boolean result = account.withdraw(500.0);
        
        assertTrue(result, "Withdrawal should be successful");
        assertEquals(500.0, account.getBalance(), "Balance should be 500.0 after withdrawal");
    }

    @Test
    public void testInsufficientFunds() {
        Account account = new Account("TEST_ACC", 100.0);
        boolean result = account.withdraw(500.0);
        
        assertFalse(result, "Withdrawal should fail due to insufficient funds");
        assertEquals(100.0, account.getBalance(), "Balance should remain unchanged");
    }

    @Test
    public void testInvalidPin() {
        Card card = new Card("1234", "1111", "ACC1");
        assertFalse(card.verifyPin("9999"), "PIN verification should fail for wrong PIN");
        assertTrue(card.verifyPin("1111"), "PIN verification should succeed for correct PIN");
    }
}
