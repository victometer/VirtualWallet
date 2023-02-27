public abstract class Card implements ICharge{
    private long cardNo;
    private String expiryDate;
    private int securityNo;

    public Card(long cardNo, String expiryDate, int securityNo){
        this.cardNo = cardNo;
        this.expiryDate = expiryDate;
        this.securityNo = securityNo;

    }

    public long getCardNo() {
        return cardNo;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNo() {
        return securityNo;
    }

    public String logTransactions(){
        return "Here's your record:";
    }
}
