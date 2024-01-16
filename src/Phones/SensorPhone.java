package Phones;

public class SensorPhone extends BasePhone {
    private String sensorType;
    public SensorPhone(String model, String brand, float price, float size, String sensorType){
        super(model, brand, price, size);
        this.sensorType = sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getSensorType() {
        return sensorType;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "\tSensor type: " + String.valueOf(this.sensorType);
    }
}
