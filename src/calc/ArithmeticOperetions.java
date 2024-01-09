package calc;

public class ArithmeticOperetions {
    public static int integerConvert(String operand)
    {
        return Integer.parseInt(operand);
    }


    public static int calculate(String first_operand, String second_operand, char operator) throws Exception
    {
        int num1 = integerConvert(first_operand);
        int num2 = integerConvert(second_operand);


        switch (operator)
            {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    if (num2 == 0)
                    {
                        throw new Exception("Нельзя делить на ноль");
                    }
                    return num1 / num2;
                default:
                    throw new Exception("Неверный оператор");
            }
    }
}
