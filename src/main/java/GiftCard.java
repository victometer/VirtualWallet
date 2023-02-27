public class GiftCard implements ICharge{

    private double balance;

    public GiftCard(double balance){
        this.balance = balance;
    }

    public boolean logTransactions(){
        return false;
    }

    public void charge(double purchaseAmount){
        balance -= purchaseAmount;
    }

}
