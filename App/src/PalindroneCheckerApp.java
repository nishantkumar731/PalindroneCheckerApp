import java.util.*;

public class PalindroneCheckerApp {

    // Algorithm 1: Two Pointer Method
    public static boolean twoPointerPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Algorithm 2: Stack Method
    public static boolean stackPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Algorithm 3: Deque Method
    public static boolean dequePalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Two Pointer Timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointerPalindrome(input);
        long end1 = System.nanoTime();

        // Stack Timing
        long start2 = System.nanoTime();
        boolean result2 = stackPalindrome(input);
        long end2 = System.nanoTime();

        // Deque Timing
        long start3 = System.nanoTime();
        boolean result3 = dequePalindrome(input);
        long end3 = System.nanoTime();

        System.out.println("\nPalindrome Results:");
        System.out.println("Two Pointer Method: " + result1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method: " + result2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Deque Method: " + result3 + " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}