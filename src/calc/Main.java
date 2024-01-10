package calc;


public class Main
{
    //Реализуем главный метод calc
    public static String calc(String input) throws Exception
    {
        InputCheck.stringsSplit(input);
        return Integer.toString(ArithmeticOperations.calculate
                (
                InputCheck.firstInt,
                InputCheck.secondInt,
                InputCheck.operator
                )
        );
    }
}

