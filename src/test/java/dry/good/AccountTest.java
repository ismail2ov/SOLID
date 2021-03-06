package dry.good;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    private dry.bad.Account account;

    @Before
    public void setUp() throws Exception {
        account = new dry.bad.Account();

    }

    @Test
    public void testPositiveBalance() throws Exception {
        account.debit(50);
        account.credit(20);

        assertEquals(30, account.getBalance(), 0);
    }

    @Test
    public void getLastTransactionDate() throws Exception {
        account.debit(50);

        assertNotNull(account.getLastTransactionDate());
    }
}