package Stringss;

import java.util.Scanner;

public class Stringp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer();

        int choice;
        do {
            System.out.println("\n--- StringBuffer Menu ---");
            System.out.println("1. Append Text");
            System.out.println("2. Insert Text");
            System.out.println("3. Replace Text");
            System.out.println("4. Delete Text");
            System.out.println("5. Reverse Text");
            System.out.println("6. Display Buffer");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Append
                    System.out.print("Enter text to append: ");
                    String appendText = scanner.nextLine();
                    buffer.append(appendText);
                    break;

                case 2: // Insert
                    System.out.print("Enter index to insert at: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter text to insert: ");
                    String insertText = scanner.nextLine();
                    if (insertIndex >= 0 && insertIndex <= buffer.length()) {
                        buffer.insert(insertIndex, insertText);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 3: // Replace
                    System.out.print("Enter start index: ");
                    int startReplace = scanner.nextInt();
                    System.out.print("Enter end index: ");
                    int endReplace = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter replacement text: ");
                    String replaceText = scanner.nextLine();
                    if (startReplace >= 0 && endReplace <= buffer.length() && startReplace < endReplace) {
                        buffer.replace(startReplace, endReplace, replaceText);
                    } else {
                        System.out.println("Invalid indices.");
                    }
                    break;

                case 4: // Delete
                    System.out.print("Enter start index: ");
                    int startDelete = scanner.nextInt();
                    System.out.print("Enter end index: ");
                    int endDelete = scanner.nextInt();
                    if (startDelete >= 0 && endDelete <= buffer.length() && startDelete < endDelete) {
                        buffer.delete(startDelete, endDelete);
                    } else {
                        System.out.println("Invalid indices.");
                    }
                    break;

                case 5: // Reverse
                    buffer.reverse();
                    System.out.println("Buffer reversed.");
                    break;

                case 6: // Display
                    System.out.println("Current buffer: " + buffer.toString());
                    break;

                case 7: // Exit
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);

        scanner.close();
    }
}
