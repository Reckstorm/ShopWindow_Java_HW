package Phones;

public class ShopWindow {
    private BasePhone[] shelfOne;
    private BasePhone[] shelfTwo;

    public ShopWindow(){
        shelfOne = new BasePhone[6];
        shelfTwo = new BasePhone[6];
        fillArrays(shelfOne, true);
        fillArrays(shelfTwo, false);
    }
    //region Getters & Setters
    public BasePhone[] getShelfOne() {
        return shelfOne;
    }

    public BasePhone[] getShelfTwo() {
        return shelfTwo;
    }

    private void setShelfOne(BasePhone[] shelfOne) {
        this.shelfOne = shelfOne;
    }

    private void setShelfTwo(BasePhone[] shelfTwo) {
        this.shelfTwo = shelfTwo;
    }
    //endregion

    private void fillArrays(BasePhone[] phones, boolean type){
        if (type){
            for (int i = 0; i < 6; i++){
                phones[i] = new ButtonsPhone("3310", "Nokia", 100, 50, 40);
            }
        }
        else {
            for (int i = 0; i < 6; i++){
                phones[i] = new SensorPhone("Pixel", "Google", 500, 100, "Best of all");
            }
        }
    }

    public String takePhone(BasePhone[] shelf, int place){
        if ((place < 6 && place > 0) && shelf[place] != null) {
            String res = shelf[place].getInfo();
            shelf[place] = null;
            return res;
        }
        return "There is no phone at this place";
    }

    public String addPhone(BasePhone[] shelf, int place, BasePhone phone){
        if ((place < 6 && place > 0) && shelf[place] == null) {
            shelf[place] = phone;
            return String.format("Phone: %s, has been placed to the shelf", phone.getModel());
        }
        return "There is no space at the specified slot";
    }
}
