import java.util.Scanner;




    class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public class PalindroneCheckerApp {

        // Function to check palindrome using linked list
        public static boolean isPalindrome(Node head) {

            if (head == null || head.next == null) {
                return true;
            }

            Node slow = head;
            Node fast = head;

            // Find middle of the linked list
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse second half
            Node prev = null;
            Node curr = slow;

            while (curr != null) {
                Node nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            // Compare first half and reversed second half
            Node firstHalf = head;
            Node secondHalf = prev;

            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {
                    return false;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true;
        }

        // Function to convert string to linked list
        public static Node createLinkedList(String str) {

            Node head = null;
            Node tail = null;

            for (char ch : str.toCharArray()) {
                Node newNode = new Node(ch);

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }

            return head;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            input = input.replaceAll("\\s+", "").toLowerCase();

            Node head = createLinkedList(input);

            if (isPalindrome(head)) {
                System.out.println("The given string is a Palindrome.");
            } else {
                System.out.println("The given string is NOT a Palindrome.");
            }

            sc.close();
        }
    }