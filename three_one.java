class Node {
    int data;
    Node next;

    Node(int num) {
        data = num;
    }
}

class LinkedList {
    Node root;

    void push(int num) {
        Node newNode = new Node(num);
        newNode.next = root;
        root = newNode;
    }

    void reverse() {
        Node prev = null;
        Node cur = root;
        Node next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        root = prev;
    }

    void printList() {
        Node temp = root;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class three_one {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(324);
        list.push(-124);
        list.push(22456);
        list.push(42);
        list.push(51);

        System.out.println("Original Linked List:");
        list.printList();

        list.reverse();

        System.out.println("\nReversed Linked List:");
        list.printList();
    }
}