public class CreditCard extends Card implements ICharge {

    private int availableCredit;

    public CreditCard(int availableCredit, int cardNo, String expiryDate, int securityNo){
        super(cardNo, expiryDate, securityNo);
        this.availableCredit = availableCredit;

    }

    public int getAvailableCredit() {
        return availableCredit;
    }

    public boolean logTransactions(){
        return true;

    }

    public int addPercentage(int transaction){
        return transaction + transaction * 10/100;
    }

    public void charge(double purchaseAmount){
        availableCredit -= purchaseAmount;
    }

    public double reduceCredit(int transaction){
        return this.availableCredit -= addPercentage(transaction);
    }

}
