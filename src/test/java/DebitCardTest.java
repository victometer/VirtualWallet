import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard deditCard1;
    DebitCard deditCard2;


    @Before
    public void before(){
        deditCard1 = new DebitCard(1000,34678546,120989,647478339, "12-Jun-25",234);
        deditCard2 = new DebitCard(500,54678546,457654,647438839, "12-Jun-25",224);

    }

    @Test
    public void canAddPercentage(){
        deditCard1.charge(10, 0.0);
        assertEquals(990, deditCard1.getBalance(), 0.0);
    }

    @Test
    public void canLogTransactions(){
        assertEquals("Here's your record:", deditCard1.logTransactions());
    }
}
