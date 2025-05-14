import java.util.Scanner;

public class UserSizedStack {
    int[] stack;
    int top = -1;
    int size;

    // Constructor to set the size of the stack
    UserSizedStack(int size) {
        this.size = size;
        stack = new int[size];
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is full.");
        } else {
            top++;
            stack[top] = value;
            System.out.println("Added: " + value);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Removed: " + stack[top]);
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top item: " + stack[top]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack items:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user to set stack size
        System.out.print("Enter the size of the stack: ");
        int userSize = sc.nextInt();
        UserSizedStack s = new UserSizedStack(userSize);

        int choice;
        do {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to push: ");
                    int num = sc.nextInt();
                    s.push(num);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}

