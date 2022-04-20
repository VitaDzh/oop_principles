package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {

    public static void main(String[] args) {

        /*
        Create an object of Samsung called as s1
        info it will have is as below

        Samsung
        Black
        64
        700
         */
        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        IPhone i1 = new IPhone("Apple", "Silver", 128, 1000);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        /*

         */
        int howManyConvertible = 0;
        double max = Double.MIN_VALUE;
        Phone mostExpensive = null; // it is similar to an empty String container
        for (Phone phone : phones) {
            System.out.println(phone);
            if(phone.isConvertible()) howManyConvertible++;
            if(phone.price > max) mostExpensive = phone;
        }
        System.out.println(howManyConvertible);
        System.out.println("The most expensive phone is = " + mostExpensive.getClass().getSimpleName());
        System.out.println("The color of the most expensive phone is = " + mostExpensive.color);
        System.out.println(IPhone.OS); // invoking static instance var
        System.out.println(Samsung.OS);
        System.out.println(IPhone.OS);

        for (Phone phone : phones) {
            phone.call();
            phone.ring();
            phone.text();
        }




    }
}
