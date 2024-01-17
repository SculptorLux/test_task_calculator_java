package calc;


class InputCheck {
    public static String firstInt;
    public static String secondInt;
    public static char operator;


    public static void stringsSplit(String string) throws Exception
    {
        String[] strings = string.split("[+-/*]");
        if (strings.length < 2)
        {
            throw new Exception("т.к. строка не является математической операцией");
        } else if (strings.length > 2)
        {
            throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
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
