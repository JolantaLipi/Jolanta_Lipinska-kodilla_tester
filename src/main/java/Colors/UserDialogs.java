package Colors;

import java.util.Scanner;

public class UserDialogs {

    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your color (one character): ");
            String color = scanner.nextLine();
            if (color.length() == 1) {
                return color;
            } else {
                System.out.println("Wrong color! Try again.");
            }
        }
    }
}
