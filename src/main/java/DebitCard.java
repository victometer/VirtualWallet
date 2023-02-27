public class DebitCard extends Card implements ICharge{

    private int accountNo;
    private int sortCode;
    private double balance;


    public DebitCard(double balance, int accountNo, int sortCode, long cardNo, String expiryDate, int securityNo){
        super(cardNo, expiryDate, securityNo);
        this.balance = balance;
        this.accountNo = accountNo;
        this.sortCode = sortCode;

    }

    public int getAccountNo() {
        return accountNo;
    }

    public int getSortCode() {
        return sortCode;
    }

    public double getBalance() {
        return balance;
    }

    public void charge(double purchaseAmount, double percentage){
        balance -= purchaseAmount*percentage + purchaseAmount;
    }

}
