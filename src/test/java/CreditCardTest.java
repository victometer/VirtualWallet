import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    CreditCard creditCard1;
    CreditCard creditCard2;

    @Before
    public void before(){
        creditCard2 = new CreditCard(1000,34678546,"05-Jul-2025",234);
        creditCard1 = new CreditCard(500,54678546,"05-Jun-2026",224);

    }
    @Test
    public void canAddPercentageAndDeductFromCredit(){
        creditCard1.charge(10, 0.1);
        assertEquals(489, creditCard1.getAvailableCredit());
    }
    @Test
    public void canLogTransactions(){
        assertEquals("Here's your record:", creditCard1.logTransactions());
    }




}

