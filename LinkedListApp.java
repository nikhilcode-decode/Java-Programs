import java.util.Scanner;

public class LinkedListApp {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        private Node head;

        // Insert at beginning
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Insert at end
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Delete by value
        public void deleteByValue(int key) {
            Node temp = head, prev = null;

            if (temp != null && temp.data == key) {
                head = temp.next;
                return;
            }

            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Value not found.");
                return;
            }

            prev.next = temp.next;
        }

        // Search for a value
        public boolean search(int key) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        // Reverse the list
        public void reverse() {
            Node prev = null;
            Node current = head;
            Node next;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }

        // Print the list
        public void printList() {
            Node temp = head;
            if (temp == null) {
                System.out.println("List is empty.");
                return;
            }
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int choice;
        do {
            System.out.println("\n--- Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete by Value");
            System.out.println("4. Search");
            System.out.println("5. Reverse");
            System.out.println("6. Display");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            int value;
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at beginning: ");
                    value = scanner.nextInt();
                    list.insertAtBeginning(value);
                    break;
                case 2:
                    System.out.print("Enter value to insert at end: ");
                    value = scanner.nextInt();
                    list.insertAtEnd(value);
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    value = scanner.nextInt();
                    list.deleteByValue(value);
                    break;
                case 4:
                    System.out.print("Enter value to search: ");
                    value = scanner.nextInt();
                    boolean found = list.search(value);
                    System.out.println(found ? "Value found." : "Value not found.");
                    break;
                case 5:
                    list.reverse();
                    System.out.println("List reversed.");
                    break;
                case 6:
                    list.printList();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
