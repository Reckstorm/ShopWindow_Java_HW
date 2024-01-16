import Phones.SensorPhone;
import Phones.ShopWindow;

public class Main {
    public static void main(String[] args) {
        ShopWindow Shop = new ShopWindow();

        System.out.println(Shop.takePhone(Shop.getShelfOne(), 1));
        System.out.println(Shop.addPhone(Shop.getShelfOne(), 2,
                new SensorPhone("Vixel", "Moogle", 300, 200, "Worst of all")));
        System.out.println(Shop.addPhone(Shop.getShelfOne(), 1,
                new SensorPhone("Vixel", "Moogle", 300, 200, "Worst of all")));
    }
}