package calc;


public class Main
{
    public static String calc(String input) throws Exception
    {
        InputCheck.stringsSplit(input);
        return Integer.toString(ArithmeticOperetions.calculate
                (
                InputCheck.firstInt,
                InputCheck.secondInt,
                InputCheck.operator
                )
        );
    }
}

