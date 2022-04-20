package inheritance.recap;

public class Test {
    public static void main(String[] args) {

        Computer computer = new Computer("123847o", "Intel", "Asus", 12.8);
        computer.hasScreen = false;
        computer.hasKeyboard = false;

        System.out.println(computer);

        Computer.boot();
        Computer.runProgram("Slack");
        Computer.runProgram("Skype");


    }
}
