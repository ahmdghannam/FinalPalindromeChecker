import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        inputFetching();
    }

    private static void inputFetching() {
        System.out.println("please enter the Text You want to check ! ");
        System.out.print("value: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        System.out.println(
                isPhrasePalindrome(input) ? "The phrase is a palindrome." : "The phrase is not a palindrome."
        );
    }

    private static boolean isPhrasePalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            char rightChar = Character.toLowerCase(text.charAt(start));
            char leftChar = Character.toLowerCase(text.charAt(end));
            if (isNotAlphanumeric(rightChar)) {
                start++;
                continue;
            }
            if (isNotAlphanumeric(leftChar)) {
                end--;
                continue;
            }
            if (rightChar != leftChar) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean isNotAlphanumeric(char c) {
        return !Character.isLetterOrDigit(c);
    }

}