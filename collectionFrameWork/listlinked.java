import java.util.*;

class SinglyLinkedList {
    int size;
    Node head;
    Node tail;
    int count;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
        this.count = 0;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            this.head = node;
            this.tail = node;
            this.head.pos = 1;
            this.count = this.count + 1;
        } else {
            tail.setNext(node);
            this.tail = node;
            this.head.pos = this.count + 1;
        }
        this.size = size + 1;
    }

    public void addIn(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.setNext(head);
            this.head = newNode;
        } else {
            int curr = 0;
            Node currNode = this.head;
            Node prev = null;
            while (curr != pos) {
                prev = currNode;
                currNode = currNode.next;
                curr++;
            }
            prev.setNext(newNode);
            newNode.setNext(currNode);
            this.size = size + 1;
        }
    }

    public int getSize() {
        return this.size;
    }

    public void display() {
        if (head == null) {
            System.out.print("");
        } else {
            Node currNode = this.head;
            while (currNode != null) {
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
        }
        System.out.println("Size :" + this.size);
    }

    // public Node xoa(int data) {
    // Node current = head;
    // while (current != null) {
    // if (current.next.data == data) {
    // Node a = current.next.next;
    // current.next.Remove(current.next);
    // current.next = a;
    // }
    // }

    // }

}

class Node {
    int data;
    Node next;
    int pos;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node node) {
        this.next = node;
    }
}

public class listlinked {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList sll = new SinglyLinkedList();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sll.add(sc.nextInt());
        }
        System.out.println("addin");
        sll.addIn(sc.nextInt(), sc.nextInt());
        sll.display();

        sc.close();

    }
}
