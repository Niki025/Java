import java.util.Stack;

class Main {
    public static void insertAtBottom(Stack<Integer> s, int item) {
        if (s.empty()) {
            s.push(item);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, item);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int item = s.pop();
        reverseStack(s);

        insertAtBottom(s, item);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            s.push(i);
        }

        System.out.println("Original stack is " + s);
        reverseStack(s);
        System.out.println("Reversed stack is " + s);
    }
}