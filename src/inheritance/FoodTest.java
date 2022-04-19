package inheritance;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {
                /*
        Create a food1 object and define below info for it
        taste = delicious
        name = sushi
        isSpicy = true
        isOrganic = true

        First, print the name of the food
        Then, print if the food is organic
        Finally, print the object itself
         */
        System.out.println("-------------------TASK 1--------------------");
        Food food1 = new Food();
        food1.name = "sushi";
        food1.taste = "delicious";
        food1.isSpicy = true;
        food1.setOrganic(true);

        System.out.println(food1.name);
        System.out.println(food1.isOrganic());
        System.out.println(food1);

        /*
        Create a vegetable1 object and define below info for it
        taste = good
        name = parsley
        isSpicy = false
        isOrganic = true
        color = green

        First, print the name of the vegetable and color of the vegetable
        Then, print if the vegetable is organic
        Finally, print the object itself
         */
        System.out.println("-------------TASK 2---------------");
        Vegetable veg1 = new Vegetable();
        veg1.taste = "good";
        veg1.name = "parsley";
        veg1.color = "green";
        veg1.setOrganic(true);
        veg1.isSpicy = false;

        System.out.println("Name of veg is " + veg1.name + "\nColor of veg is " + veg1.color);
        System.out.println(veg1.isOrganic());
        System.out.println(veg1);


        /*
        Create another veg2 Object and define only the name and print object
         */
        System.out.println("-----------TASK 3-------------");
        Vegetable veg2 = new Vegetable();
        veg2.name = "broccoli";

        System.out.println(veg2);

        ArrayList<Food> allFood = new ArrayList<>();
        allFood.add(food1);
        allFood.add(veg1);
        allFood.add(veg2);

        System.out.println(allFood);

        System.out.println("-----------TASK 3-----------");
        /*
        Count and print how many elements in the list has a name that has more than 5 characters
         */
        int count = 0;
        for (Food food : allFood) {
            if(food.name.length() > 5) count++;
        }
        System.out.println(count);

        System.out.println("\n--------------Count Task BONUS solution------------");

        System.out.println(allFood.stream().filter(food -> food.name.length() > 5).count());








    }
}

