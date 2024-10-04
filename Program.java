import java.util.Scanner;

public class Program {
    public static String procVowel(String param) {
        StringBuilder vowels = new StringBuilder();
        for (char c : param.toLowerCase().toCharArray()) {
            if (isVowel(c)) {
                vowels.append(c);
            }
        }
        return vowels.toString();
    }

    public static String procConsonant(String param) {
        StringBuilder consonants = new StringBuilder();
        for (char c : param.toLowerCase().toCharArray()) {
            if (!isVowel(c) && Character.isLetter(c)) {
                consonants.append(c);
            }
        }
        return consonants.toString();
    }

    // Static method
    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input one line of words (S) : ");
            String input = scanner.nextLine();

            String charVowel = procVowel(input);
            String charConsonant = procConsonant(input);

            System.out.println("Vowel Characters : ");
            System.out.println(charVowel);
            System.out.println("Consonant Characters : ");
            System.out.println(charConsonant);
        }
    }
}