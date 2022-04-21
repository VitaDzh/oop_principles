package abstraction.abstract_classes;

public interface Bluetooth {

    void connectBluetooth();

    //Static method
     static int getYear(){ // by default methods are public
        return 2022;
    }

    //Default method (non-static that has body)
    //This one will be use only with a child class
     default boolean isConnected(){ //by default methods are public, default means it is non-static method
         return true;
    }


}
