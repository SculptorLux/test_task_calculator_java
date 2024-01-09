package calc;

public class InputCheck {
    //Обраотка ввода и проверок
    //Метод для проверки, является ли входная строка римским числом

    public static int firstInt;
    public static int secondInt;
    public static char operator;


    public String[] stringsSplit(String string)
    {
        String[] strings = string.split("[+-/*]");
        return strings;
    }
}
