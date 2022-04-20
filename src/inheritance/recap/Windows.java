package inheritance.recap;

public class Windows extends Computer{

    public Windows(String key, String cpuName, String motherBoard, double memory) {
        super(key, cpuName, motherBoard, memory);
    }

    public Windows(String key, String cpuName, String motherBoard, boolean hasScreen, boolean hasKeyboard, double memory) {
        super(key, cpuName, motherBoard, hasScreen, hasKeyboard, memory);
    }

    //variables



}
