package calc;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String inputScanner = scanner.nextLine();
        String result = Main.calc(inputScanner);
        System.out.println(result);
        scanner.close();
    }
}
