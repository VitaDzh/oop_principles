package abstraction.abstract_classes;

public class Nokia extends Phone{


    public Nokia() {
    }

    public Nokia(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    public static final String OS = "android";

    @Override
    public void call() {
        System.out.println("Nokia calls");
    }

    @Override
    public void ring() {
        System.out.println("Nokia rings");

    }


    @Override
    public boolean isConvertible() {
        return false;
    }

    @Override
    public void text() {
        System.out.println("Nokia texts");



    }
}
