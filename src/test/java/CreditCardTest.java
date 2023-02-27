import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    ICharge card1;
    CreditCard creditCard1;


    @Before
    public void before(){
        card1 = new CreditCard(549,54678546,"05Jun",234);
        creditCard1 = new CreditCard(500,54678546,"05Jun",234);


    }

    @Test
    public void hasLogTransaction(){
        assertEquals(true, card1.logTransactions());
    }
    @Test
    public void canAddPercentage(){
        assertEquals(110, creditCard1.addPercentage(100));
    }
    @Test
    public void canCharge(){
        creditCard1.charge(100);
        assertEquals(400, creditCard1.getAvailableCredit());
    }

    @Test
    public void canReduceCredit(){
        creditCard1.reduceCredit(20);
        assertEquals(478, creditCard1.getAvailableCredit());
    }



}

