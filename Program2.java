import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the number of families: ");
            int numFamilies = scanner.nextInt();

            System.out.print("Input the number of members in the family (separated by a space): ");
            int[] familySizes = new int[numFamilies];
            for (int i = 0; i < numFamilies; i++) {
                familySizes[i] = scanner.nextInt();
            }

            int minBuses = calculateMinBuses(familySizes, numFamilies);

            if (minBuses != -1) {
                System.out.println("Minimum bus required is: " + minBuses);
            } else {
                System.out.println("Input must be equal with count of family");
            }

            scanner.close();
        }
    }

    private static int calculateMinBuses(int[] familySizes, int numFamilies) {
        int totalMembers = 0;
        int maxFamilySize = 0;

        for (int size : familySizes) {
            totalMembers += size;
            maxFamilySize = Math.max(maxFamilySize, size);
        }

        if (familySizes.length != numFamilies) {
            return -1; // Input must be equal with count of family
        }

        int minBuses = (totalMembers) / 4;
        if ((totalMembers) % 4 != 0) {
            minBuses++;
        }

        return minBuses;
    }
}