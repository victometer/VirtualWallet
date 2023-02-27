public class GiftCard implements ICharge{

    private double balance;

    public GiftCard(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void charge(double amount, double percentage){
        balance -= amount*percentage + amount;
    }

    public void reduceBalance(double purchaseAmount){
        balance -= purchaseAmount;
    }

}
