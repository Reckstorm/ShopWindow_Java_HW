package Phones;

public class BasePhone {
    private String model;
    private String brand;
    private float price;
    private float size;

    public BasePhone(String model, String brand, float price, float size){
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public float getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getInfo(){
        return String.format("Brand: %s\t, Model: %s\t, Price: %s\t, Size: %s\t",
                this.brand, this.model, String.valueOf(this.price), String.valueOf(this.size));
    }
}
