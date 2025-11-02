class LinkedList {
    Node head;  

    // Insert at Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // arrow of new node → old head
        head = newNode;      // new node becomes head
    }

    // Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) { // if list empty
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) { // walk till last
            temp = temp.next;
        }
        temp.next = newNode; // last node’s arrow → new node
    }

    //Insert at Specific Position (1-based index)
    public void insertAtPosition(int data, int position) {
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at Beginning
    public void deleteAtBeginning() {
        if (head == null) return;
        head = head.next; // skip the first node
    }

    // Delete at End
    public void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) { // only one node
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) { // reach 2nd last node
            temp = temp.next;
        }
        temp.next = null; // cut the last node
    }

    // Delete at Specific Position
    public void deleteAtPosition(int position) {
        if (head == null) return;
        if (position == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next; // skip the node
    }

    //Search for an Element
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    // Display List
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class listLinked {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display(); // 10 → 20 → 30 → null

        list.insertAtBeginning(5);
        list.display(); // 5 → 10 → 20 → 30 → null

        list.insertAtPosition(15, 3);
        list.display(); // 5 → 10 → 15 → 20 → 30 → null

        list.deleteAtBeginning();
        list.display(); // 10 → 15 → 20 → 30 → null

        list.deleteAtEnd();
        list.display(); // 10 → 15 → 20 → null

        list.deleteAtPosition(2);
        list.display(); // 10 → 20 → null

        System.out.println("Search 20: " + list.search(20)); // true
        System.out.println("Search 50: " + list.search(50)); // false
    }
}
