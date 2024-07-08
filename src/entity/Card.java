package entity;

public class Card {
    private String cardName;
    private String cardId;

    public Card(String cardName, String cardId) {
        this.cardName = cardName;
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
