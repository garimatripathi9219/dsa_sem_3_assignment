
class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    char pop() {
        if (top == null) {
            return '\0';
        }

        char value = top.data;
        top = top.next;
        return value;
    }

    boolean isEmpty() {
        return top == null;
    }
}

public class main {
    public static void main(String[] args) {

        String str = "HELLO";

        Stack st = new Stack();

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        String reverse = "";

        while (!st.isEmpty()) {
            reverse = reverse + st.pop();
        }

        System.out.println("Reversed String: " + reverse);
    }
}
