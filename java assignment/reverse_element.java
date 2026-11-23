
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) {
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class reverse_element {
    public static void main(String[] args) {

        Stack st1 = new Stack();
        Stack st2 = new Stack();

        st1.push(10);
        st1.push(20);
        st1.push(30);

        System.out.print("Original Stack: ");
        st1.display();

        while (!st1.isEmpty()) {
            int value = st1.pop();
            st2.push(value);
        }

        System.out.print("Reversed Stack: ");
        st2.display();
    }
}
