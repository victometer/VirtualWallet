import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Computer;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    Wallet wallet;
    CreditCard creditCard1;
    DebitCard debitCard1;
    GiftCard giftCard1;


    @Before
    public void before() {
        wallet = new Wallet();
        creditCard1 = new CreditCard(500,54678546,"05-Jun-2026",224);
        debitCard1 = new DebitCard(500,54678546,457654,647438839, "12-Jun-25",224);
        giftCard1 = new GiftCard(50.0);
        ICharge cards = creditCard1; // what's this for?
    }

//    @Test
//    public void canSelectACard(){
//        wallet.setSelectedCard(creditCard1.getSecurityNo());
//        assertEquals(224, wallet.getSelectedCard());
//    }

    @Test
    public void canAddACard(){
        wallet.addPaymentCard(giftCard1);
        assertEquals(1, wallet.cardCount());
    }

//    How to select a card by securityNo if an ICharge type is required?
//    What do you mean by LogTransactions? Should it be conditional with regard to the balance? Also because all 3 cards mention this, do you expect it inside the abstract class? How would that work as a conditional?

}
