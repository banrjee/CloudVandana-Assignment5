import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//import java.util.*;

public class RomanToInteger {
    public static int romanToInteger(String roman) {
        Map<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = romanNumbers.get(roman.charAt(i));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman number: ");
        String romanNumber = scanner.nextLine();
        int result = romanToInteger(romanNumber);
        System.out.println("The integer equivalent of " + romanNumber + " is " + result);
    }
}
