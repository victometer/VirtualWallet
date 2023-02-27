import java.util.ArrayList;

public class Wallet{

    private ArrayList<ICharge> paymentCards;
    private ICharge selectedCard;

    public Wallet(){
        this.selectedCard = null;
        this.paymentCards = new ArrayList<>();
    }

    public ICharge getSelectedCard() {
        return selectedCard;
    }

    public void setSelectedCard(ICharge selectedCard) {
        this.selectedCard = selectedCard;
    }

//    public void pay(ICharge selectedCard, int purchaseAmount){
//        selectedCard.charge(purchaseAmount);
//
//    }
    public int cardCount(){
        return paymentCards.size();
    }
    public void addPaymentCard(ICharge card){
        paymentCards.add(card);

    }

}

