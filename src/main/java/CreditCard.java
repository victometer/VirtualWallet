public class CreditCard extends Card implements ICharge {

    private int availableCredit;

    public CreditCard(int availableCredit, int cardNo, String expiryDate, int securityNo){
        super(cardNo, expiryDate, securityNo);
        this.availableCredit = availableCredit;

    }

    public int getAvailableCredit() {
        return availableCredit;
    }

    public void charge(double amount, double percentage){
        availableCredit -= amount*percentage + amount;
    }


}
