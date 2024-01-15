package calc;


import java.util.TreeMap;

class RomanConverter
{

    public static TreeMap<Character, Integer> romanMap = new TreeMap<>();
    public static TreeMap<Integer, String> arabianMap = new TreeMap<>();

    public RomanConverter()
    {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);


        arabianMap.put(1000, "M");
        arabianMap.put(900, "CM");
        arabianMap.put(500, "D");
        arabianMap.put(400, "CD");
        arabianMap.put(100, "C");
        arabianMap.put(90, "XC");
        arabianMap.put(50, "L");
        arabianMap.put(40, "XL");
        arabianMap.put(10, "X");
        arabianMap.put(9, "IX");
        arabianMap.put(5, "V");
        arabianMap.put(4, "IV");
        arabianMap.put(1, "I");
    }

    public static String intToRoman(int number)
    {
        String roman = "";
        int arabianKey;
        do {
            arabianKey = arabianMap.floorKey(number);
            roman += arabianMap.get(arabianKey);
            number -= arabianKey;
        } while (number != 0);
        return roman;

    }
    public static int romanToInt(String s)
    {
        int end = s.length()-1;
        char[] arr = s.toCharArray();
        int arabian;
        int result = romanMap.get(arr[end]);
        for (int i = end-1; i >=0; i--) {
            arabian = romanMap.get(arr[i]);

            if (arabian < romanMap.get(arr[i + 1])) {
                result -= arabian;
            } else {
                result += arabian;
            }
        }
        return result;
    }
    public static boolean isRoman(String num)
    {
        return romanMap.containsKey(num.charAt(0));
    }
}
