package abstraction.abstract_classes;

public class Samsung extends Phone{

    public Samsung() {
    }

    public Samsung(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    public static final String OS = "android";


    @Override
    public void call() {
        System.out.println("Sumsung calls");
    }

    @Override
    public void ring() {
        System.out.println("Samsung rings");
    }

    @Override
    public void text() {
        System.out.println("Samsung texts");
    }

    @Override
    public boolean isConvertible() {
        return false;
    }
}
