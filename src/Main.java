import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    public static String stringInputLine = scanner.nextLine();
    public static int firstInt;
    public static int secondInt;
    public static char operator;

    public static void main(String[] args)
    {
        calc(stringInputLine);
    }

    public static String calc(String input)
    {
        // Ловлю знак операции
        ArrayList<Character> opperationChars = new ArrayList<>();

        for (int i = 0; i < opperationChars.size() - 1; i++) {
            if (i == '+') {
                operator = '+';
            } else if (i == '-')
            {
                operator = '-';
            } else if (i == '*')
            {
                operator = '*';
            } else if (i == '/')
            {
                operator = '/';
            }
        }

        //Ловлю первое и второе числа
        ArrayList<String> splitStrings = new ArrayList<>(Arrays.asList(input.split("[+*/-]")));
        firstInt = Integer.parseInt(splitStrings.get(0));
        secondInt = Integer.parseInt(splitStrings.get(1));
        //Выполняю операцию и возвращаю результат

        String result = Integer.toString(arabicNumbersCalculator(firstInt, secondInt, operator));
        System.out.println(result);
        return result;
    }


    public static int arabicNumbersCalculator(int first, int second, char op)
    {
        int resultOfCalc = 0;

        switch (op)
        {
            case '+':
                resultOfCalc =  first + second;
            case '-':
                resultOfCalc = first - second;
            case '*':
                resultOfCalc = first * second;
            case '/':
                resultOfCalc = first / second;
        }
        return resultOfCalc;
    }
}
