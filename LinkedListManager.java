import java.util.Scanner;

class LinkedListManager {

    // Node class is defined inside the LinkedListManager class.
    static class Node {
        int data;
        Node next;

        // Constructor to initialize a new node with data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    Node head = null;

    // Function to add a node at the end
    public void addNodeAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Node added at the end: " + data);
    }

    // Function to add a node at the beginning
    public void addNodeAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Node added at the beginning: " + data);
    }

    // Function to add a node at a specific position
    public void addNodeAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            addNodeAtBeginning(data);
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println("Node added at position " + position + ": " + data);
        }
    }

    // Function to delete a node by value
    public void deleteNodeByValue(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If the node to be deleted is the head node
        if (head.data == data) {
            head = head.next;
            System.out.println("Node with value " + data + " deleted.");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Node with value " + data + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Node with value " + data + " deleted.");
        }
    }

    // Function to search for a node by value
    public void searchNode(int data) {
        Node temp = head;
        int position = 0;

        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Node with value " + data + " found at position " + position);
                return;
            }
            temp = temp.next;
            position++;
        }

        System.out.println("Node with value " + data + " not found.");
    }

    // Function to display the linked list
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to reverse the linked list
    public void reverseList() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        System.out.println("Linked list reversed.");
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListManager listManager = new LinkedListManager();

        while (true) {
            System.out.println("\nLinked List Manager");
            System.out.println("1. Add Node at End");
            System.out.println("2. Add Node at Beginning");
            System.out.println("3. Add Node at Position");
            System.out.println("4. Delete Node by Value");
            System.out.println("5. Search Node by Value");
            System.out.println("6. Display Linked List");
            System.out.println("7. Reverse Linked List");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add at the end: ");
                    int dataEnd = scanner.nextInt();
                    listManager.addNodeAtEnd(dataEnd);
                    break;

                case 2:
                    System.out.print("Enter value to add at the beginning: ");
                    int dataBegin = scanner.nextInt();
                    listManager.addNodeAtBeginning(dataBegin);
                    break;

                case 3:
                    System.out.print("Enter value to add: ");
                    int dataPos = scanner.nextInt();
                    System.out.print("Enter position to add the node: ");
                    int position = scanner.nextInt();
                    listManager.addNodeAtPosition(dataPos, position);
                    break;

                case 4:
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();
                    listManager.deleteNodeByValue(deleteValue);
                    break;

                case 5:
                    System.out.print("Enter value to search: ");
                    int searchValue = scanner.nextInt();
                    listManager.searchNode(searchValue);
                    break;

                case 6:
                    listManager.displayList();
                    break;

                case 7:
                    listManager.reverseList();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
