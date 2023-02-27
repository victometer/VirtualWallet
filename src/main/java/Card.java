public abstract class Card {
    private int cardNo;
    private String expiryDate;
    private int securityNo;

    public Card(int cardNo, String expiryDate, int securityNo){
        this.cardNo = cardNo;
        this.expiryDate = expiryDate;
        this.securityNo = securityNo;

    }

}
