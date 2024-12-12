package Colors;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String color = UserDialogs.getUserColor();
        switch (color.toUpperCase()) {
            case "R":
                System.out.println("Red color");
                break;
            case "G":
                System.out.println("Green color");
                break;
            case "B":
                System.out.println("Blue color");break;
                default:System.out.println("Wrong color");
        }
    }
}
