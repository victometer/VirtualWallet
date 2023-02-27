public class DebitCard extends Card implements ICharge{

    private int accountNo;
    private int sortCode;
    private int balance;


    public DebitCard(int balance, int accountNo, int sortCode, int cardNo, String expiryDate, int securityNo){
        super(cardNo, expiryDate, securityNo);
        this.balance = balance;
        this.accountNo = accountNo;
        this.sortCode = sortCode;

    }

    public boolean logTransactions(){
        return true;

    }

    public void charge(double purchaseAmount){
        balance -= purchaseAmount;
    }

    public double addPercentage(int transaction){
        return transaction * 1;
    }

}
