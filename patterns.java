import java.util.Scanner;

public class patterns {

    public static void printPattern1(int n) {
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern9(int n) {
        printPattern7(n);
        printPattern8(n);
    }

    public static void printPattern10(int n) {
        for (int i = 0; i < 2 * n + 1; i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern11(int n) {
        int start;
        for (int i = 1; i <= n; i++) {
            start = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void printPattern12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void printPattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void printPattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakPoint) ch++;
                else ch--;
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void printPattern19(int n) {
        int initSpace = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < initSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            initSpace += 2;
            System.out.println();
        }

        initSpace = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < initSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            initSpace -= 2;
            System.out.println();
        }
    }

    public static void printPattern20(int n) {
        int space = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) space -= 2;
            else space += 2;
        }
    }

    public static void printPattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int n;

        do {
            System.out.println("\n--- Pattern Menu ---");
            System.out.println("1. Square Star Pattern");
            System.out.println("2. Right Angle Triangle (Stars)");
            System.out.println("3. Right Angle Triangle (Numbers Increasing)");
            System.out.println("4. Right Angle Triangle (Same Numbers)");
            System.out.println("5. Inverted Star Pattern");
            System.out.println("6. Inverted Number Pattern");
            System.out.println("7. Pyramid Star Pattern");
            System.out.println("8. Inverted Pyramid Star Pattern");
            System.out.println("9. Diamond Star Pattern");
            System.out.println("10. Vertical Star Wave");
            System.out.println("11. 0-1 Triangle Pattern");
            System.out.println("12. Symmetric Number Pyramid");
            System.out.println("13. Increasing Number Triangle");
            System.out.println("14. Alphabet Triangle");
            System.out.println("15. Inverted Alphabet Triangle");
            System.out.println("16. Repeating Alphabet Triangle");
            System.out.println("17. Palindrome Alphabet Pyramid");
            System.out.println("18. Right Aligned Alphabet Pyramid");
            System.out.println("19. Hourglass Star Pattern");
            System.out.println("20. Sand Clock Star Pattern");
            System.out.println("21. Hollow Square Star Pattern");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice != 0) {
                System.out.print("Enter number of lines (n): ");
                n = sc.nextInt();

                switch (choice) {
                    case 1: printPattern1(n); break;
                    case 2: printPattern2(n); break;
                    case 3: printPattern3(n); break;
                    case 4: printPattern4(n); break;
                    case 5: printPattern5(n); break;
                    case 6: printPattern6(n); break;
                    case 7: printPattern7(n); break;
                    case 8: printPattern8(n); break;
                    case 9: printPattern9(n); break;
                    case 10: printPattern10(n); break;
                    case 11: printPattern11(n); break;
                    case 12: printPattern12(n); break;
                    case 13: printPattern13(n); break;
                    case 14: printPattern14(n); break;
                    case 15: printPattern15(n); break;
                    case 16: printPattern16(n); break;
                    case 17: printPattern17(n); break;
                    case 18: printPattern18(n); break;
                    case 19: printPattern19(n); break;
                    case 20: printPattern20(n); break;
                    case 21: printPattern21(n); break;
                    default: System.out.println("Invalid choice! Please try again.");
                }
            }
        } while (choice != 0);

        System.out.println("Exiting program. Goodbye!");
        sc.close();
    }
}
