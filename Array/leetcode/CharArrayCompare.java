import java.util.Scanner;

public class CharArrayCompare {

    // Method to get characters without using toCharArray()
    public static char[] getCharsManually(String str) {

        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] a, char[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method
        char[] manualArray = getCharsManually(text);

        // Built-in method
        char[] builtInArray = text.toCharArray();

        // Compare both arrays
        boolean result = compareCharArrays(manualArray, builtInArray);

        // Display characters
        System.out.print("\nCharacters using user-defined method: ");
        for (char c : manualArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        // Display comparison result
        System.out.println("\n\nAre both arrays equal? " + result);

        sc.close();
    }
}
