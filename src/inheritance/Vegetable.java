package inheritance;

public class Vegetable extends Food {
    public String color;


    @Override
    public String toString() {
        return "\nVegetable{" +
                "taste='" + taste + '\'' +
                ", name='" + name + '\'' +
                ", isSpicy=" + isSpicy +
                ", isOrganic=" + isOrganic() +
                ", color='" + color + '\'' +
                '}';
    }
}
