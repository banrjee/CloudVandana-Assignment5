import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String input) {
        // Remove spaces and convert the input to lowercase
        input = input.replaceAll(" ", "").toLowerCase();

        // Create a set to store the unique characters
        Set<Character> uniqueChars = new HashSet<>();

        // Iterate through the input string and add characters to the set
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }

        // Check if the set contains all 26 English alphabet letters
        return uniqueChars.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence or phrase: ");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
