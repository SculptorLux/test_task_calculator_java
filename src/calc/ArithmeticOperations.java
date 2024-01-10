package calc;

public class ArithmeticOperations {
    public static int integerConvert(String operand)
    {
        return Integer.parseInt(operand);
    }


    public static int calculate(String first_operand, String second_operand, char operator) throws Exception
    {
        int num1 = integerConvert(first_operand);
        int num2 = integerConvert(second_operand);

        if (num1 > 10 || num1 < 1 || num2 > 10 || num2 < 1)
        {
            throw new Exception("Входные операнды от 1 до 10 включительно");
        }

        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> throw new Exception("Неверный оператор");
        };
    }
}
