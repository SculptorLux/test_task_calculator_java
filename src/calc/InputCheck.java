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
            throw new Exception("Неверный ввод");
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

        if (operator == 0) {
            throw new Exception("Неправильный знак выражения");
        }
    }
}
