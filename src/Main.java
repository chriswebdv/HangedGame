import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Soda Machine ");
        System.out.println("Choose a drink ");
        System.out.println("1 - Coffee ");
        System.out.println("2 - Mate ");
        System.out.println("3 - Soda ");
        System.out.println("4 - Wine");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Coffee is great! ");
                break;
            case 2:
                System.out.println("Mate is great! ");
                break;
            case 3:
                System.out.println("Soda is great! ");
                break;
            case 4:
                System.out.println("Wine is great! ");
                break;
            default:
                System.out.println("Wrong choice!");
                break;
        }
        if (option <= 4) {
            System.out.println("Enjoy your beverage! ");
        }
        scanner.close();

    }
}
