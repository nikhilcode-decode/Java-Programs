package LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- LinkedList Operations ---");
            System.out.println("1. Add element");
            System.out.println("2. Add at beginning");
            System.out.println("3. Add at end");
            System.out.println("4. Add at specific index");
            System.out.println("5. Remove element by value");
            System.out.println("6. Remove element by index");
            System.out.println("7. Remove first element");
            System.out.println("8. Remove last element");
            System.out.println("9. Get element by index");
            System.out.println("10. Check if element exists");
            System.out.println("11. Display list");
            System.out.println("12. Clear list");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    list.add(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter element to add at beginning: ");
                    list.addFirst(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter element to add at end: ");
                    list.addLast(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter index: ");
                    int indexToAdd = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter element: ");
                    String elemToAdd = sc.nextLine();
                    if (indexToAdd >= 0 && indexToAdd <= list.size()) {
                        list.add(indexToAdd, elemToAdd);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 5:
                    System.out.print("Enter element to remove: ");
                    String elemToRemove = sc.nextLine();
                    if (list.remove(elemToRemove)) {
                        System.out.println("Element removed.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter index to remove: ");
                    int indexToRemove = sc.nextInt();
                    sc.nextLine(); // consume newline
                    if (indexToRemove >= 0 && indexToRemove < list.size()) {
                        list.remove(indexToRemove);
                        System.out.println("Element removed.");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 7:
                    if (!list.isEmpty()) {
                        list.removeFirst();
                        System.out.println("First element removed.");
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;
                case 8:
                    if (!list.isEmpty()) {
                        list.removeLast();
                        System.out.println("Last element removed.");
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;
                case 9:
                    System.out.print("Enter index: ");
                    int getIndex = sc.nextInt();
                    sc.nextLine(); // consume newline
                    if (getIndex >= 0 && getIndex < list.size()) {
                        System.out.println("Element: " + list.get(getIndex));
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 10:
                    System.out.print("Enter element to search: ");
                    String searchElem = sc.nextLine();
                    if (list.contains(searchElem)) {
                        System.out.println("Element found.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 11:
                    System.out.println("Current List: " + list);
                    break;
                case 12:
                    list.clear();
                    System.out.println("List cleared.");
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}

