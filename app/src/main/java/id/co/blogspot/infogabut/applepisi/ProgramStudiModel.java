package id.co.blogspot.infogabut.applepisi;

/**
 * Created by Raka on 8/13/2018.
 */

public class ProgramStudiModel {

    String cardName;
    int imageResourceId;
    int isfav;
    int isturned;

    public ProgramStudiModel(String cardName, int imageResourceId) {
        this.cardName = cardName;
        this.imageResourceId = imageResourceId;
    }

    public int getIsturned() {
        return isturned;
    }

    public void setIsturned(int isturned) {
        this.isturned = isturned;
    }

    public int getIsfav() {
        return isfav;
    }

    public void setIsfav(int isfav) {
        this.isfav = isfav;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}