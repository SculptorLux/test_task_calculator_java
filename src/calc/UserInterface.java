package calc;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = Main.calc(input);
        System.out.println(result);
        scanner.close();
    }
}
