package calc;

class ArithmeticOperations {

    public static String calculate(String first_operand, String second_operand, char operator) throws Exception
    {
        if ((!RomanConverter.isRoman(first_operand) && RomanConverter.isRoman(second_operand))||
                (RomanConverter.isRoman(first_operand) && !RomanConverter.isRoman(second_operand)))
        {
            throw new Exception("т.к. используются одновременно разные системы счисления");
        }
        else if (RomanConverter.isRoman(first_operand) && RomanConverter.isRoman(second_operand))
        {
            int num1 = RomanConverter.romanToInt(first_operand);
            int num2 = RomanConverter.romanToInt(second_operand);

            if (num2 > num1)
            {
                throw new Exception("т.к. в римской системе нет отрицательных чисел");
            }

            if (num1 > 10 || num1 < 1 || num2 > 10 || num2 < 1) {
                throw new Exception("Входные операнды от 1 до 10 включительно");
            }

            return switch (operator) {
                case '+' -> RomanConverter.intToRoman(num1 + num2);
                case '-' -> RomanConverter.intToRoman(num1 - num2);
                case '*' -> RomanConverter.intToRoman(num1 * num2);
                case '/' -> RomanConverter.intToRoman(num1 / num2);
                default -> throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            };
        }
        else
        {
            int num1 = Integer.parseInt(first_operand);
            int num2 = Integer.parseInt(second_operand);

            if (num1 > 10 || num1 < 1 || num2 > 10 || num2 < 1)
            {
                throw new Exception("Входные операнды от 1 до 10 включительно");
            }

            return switch (operator)
            {
            case '+' -> Integer.toString(num1 + num2);
            case '-' -> Integer.toString(num1 - num2);
            case '*' -> Integer.toString(num1 * num2);
            case '/' -> Integer.toString(num1 / num2);
            default -> throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            };
        }
    }
}
