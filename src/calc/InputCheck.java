package calc;


public class InputCheck {
    public static String firstInt;
    public static String secondInt;
    public static char operator;


    public static void stringsSplit(String string) throws Exception
    {
        String[] strings = string.split("[+-/*]");
        if (strings.length != 2)
        {
            throw new Exception("Неверный ввод - максимум 2 операнда");
        }

        firstInt = strings[0].trim();
        secondInt = strings[1].trim();

        char[] charArray = string.toCharArray();

        for (char symbol : charArray) {
            if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
                operator = symbol;
                break;
            }
        }
    }
}
