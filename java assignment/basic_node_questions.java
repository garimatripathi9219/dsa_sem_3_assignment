
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
    int count = 0;

    // Push operation
    void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        count++;

        System.out.println(data + " inserted");
    }

    // Pop operation
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int removed = top.data;
        top = top.next;

        count--;

        System.out.println(removed + " removed");
        return removed;
    }

    // Peek operation
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    // Check whether stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Return size of stack
    int size() {
        return count;
    }

    // Display stack elements
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}

public class basic_node_questions{
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.print("Display: ");
        st.display();

        System.out.println("Peek: " + st.peek());

        st.pop();

        System.out.print("Display: ");
        st.display();

        System.out.println("Size: " + st.size());

        System.out.println("Is Empty: " + st.isEmpty());

        st.pop();
        st.pop();

        System.out.println("Is Empty: " + st.isEmpty());

        st.pop();
    }
}
