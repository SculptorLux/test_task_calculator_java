package calc;


public class Main
{
    public static String calc(String input) throws Exception
    {
        InputCheck.stringsSplit(input);
        return ArithmeticOperations.calculate
                (
                InputCheck.firstInt,
                InputCheck.secondInt,
                InputCheck.operator
                );
    }
}

