package inheritance.recap;

public class Computer {

    public Computer(String key, String cpuName, String motherBoard, double memory) {
        this.key = key;
        this.cpuName = cpuName;
        this.motherBoard = motherBoard;
        this.memory = memory;
    }

    public Computer(String key, String cpuName, String motherBoard, boolean hasScreen, boolean hasKeyboard, double memory) {
        this(key, cpuName, motherBoard, memory);
        this.hasScreen = hasScreen;
        this.hasKeyboard = hasKeyboard;

    }

    private final String key;
    public String cpuName;
    public String motherBoard;
    public boolean hasScreen;
    public boolean hasKeyboard;
    public double memory;

    public String getKey(){
        return key;
    }


    public static void boot(){
        System.out.println("Computer is getting started");
    }

    public static void shutDown(){
        System.out.println("Computer is shutting down");
    }

    public static void runProgram(String programName){
        System.out.println("Computer is running " + programName + "!");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "key='" + key + '\'' +
                ", cpuName='" + cpuName + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", hasScreen=" + hasScreen +
                ", hasKeyboard=" + hasKeyboard +
                ", memory=" + memory +
                '}';
    }
}
