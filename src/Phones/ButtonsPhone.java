package Phones;

public class ButtonsPhone extends BasePhone {
    private int buttonsCount;
    public ButtonsPhone(String model, String brand, float price, float size, int buttonsCount){
        super(model, brand, price, size);
        this.buttonsCount = buttonsCount;
    }

    public void setButtonsCount(int buttonsCount) {
        this.buttonsCount = buttonsCount;
    }

    public int getButtonsCount() {
        return buttonsCount;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "\tButtons count: " + String.valueOf(this.buttonsCount);
    }
}
