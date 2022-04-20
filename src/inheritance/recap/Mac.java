package inheritance.recap;

public class Mac extends Computer{

    public Mac(String key, String cpuName, String motherBoard, boolean hasScreen, boolean hasKeyboard, double memory) {
        super(key, cpuName, motherBoard, hasScreen, hasKeyboard, memory);
    }

    public Mac(String key, String cpuName, String motherBoard, double memory) {
        super(key, cpuName, motherBoard, memory);
    }

    //variables
    public String versionOS;
    public static final boolean  hasIcloud = true;
    public static final boolean hasIcon = true;
    public boolean hasGarbageMagicMouse;

    //Methods
    public static void getsSlowerWithEveryUpdate(){
        System.out.println("Mac is getting slower");
    }








}
