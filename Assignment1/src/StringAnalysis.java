import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        // Initializing counters
        int vowels = 0, consonants = 0, digits = 0, specialCharacters = 0;
        
        // Converting the input string to lowercase for easy comparison
        input = input.toLowerCase();
        
        // Iterating through each character of the string
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!Character.isWhitespace(ch)) {
                specialCharacters++;
            }
        }
        
        // Printing the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialCharacters);
    }
}
