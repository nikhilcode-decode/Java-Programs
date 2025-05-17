import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        int choice;

        do {
            System.out.println("\n=== HashMap Menu ===");
            System.out.println("1. Put (Add/Update Key-Value)");
            System.out.println("2. Get by Key");
            System.out.println("3. Remove by Key");
            System.out.println("4. Contains Key");
            System.out.println("5. Contains Value");
            System.out.println("6. Size of Map");
            System.out.println("7. Is Map Empty");
            System.out.println("8. Clear Map");
            System.out.println("9. Display All Key-Value Pairs");
            System.out.println("10. Get All Keys");
            System.out.println("11. Get All Values");
            System.out.println("12. Get Entry Set");
            System.out.println("13. Get or Default");
            System.out.println("14. Put If Absent");
            System.out.println("15. Replace Value");
            System.out.println("16. Compute");
            System.out.println("17. Compute If Absent");
            System.out.println("18. Compute If Present");
            System.out.println("19. Merge Values");
            System.out.println("20. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            int key;
            String value;

            switch (choice) {
                case 1:
                    System.out.print("Enter key (int): ");
                    key = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter value (String): ");
                    value = sc.nextLine();
                    map.put(key, value);
                    System.out.println("Added.");
                    break;

                case 2:
                    System.out.print("Enter key: ");
                    key = sc.nextInt();
                    System.out.println("Value: " + map.get(key));
                    break;

                case 3:
                    System.out.print("Enter key to remove: ");
                    key = sc.nextInt();
                    map.remove(key);
                    System.out.println("Removed.");
                    break;

                case 4:
                    System.out.print("Enter key to check: ");
                    key = sc.nextInt();
                    System.out.println("Contains key? " + map.containsKey(key));
                    break;

                case 5:
                    sc.nextLine(); // consume newline
                    System.out.print("Enter value to check: ");
                    value = sc.nextLine();
                    System.out.println("Contains value? " + map.containsValue(value));
                    break;

                case 6:
                    System.out.println("Size: " + map.size());
                    break;

                case 7:
                    System.out.println("Is empty? " + map.isEmpty());
                    break;

                case 8:
                    map.clear();
                    System.out.println("Map cleared.");
                    break;

                case 9:
                    System.out.println("Map entries:");
                    for (Map.Entry<Integer, String> entry : map.entrySet()) {
                        System.out.println(entry.getKey() + " => " + entry.getValue());
                    }
                    break;

                case 10:
                    System.out.println("Keys: " + map.keySet());
                    break;

                case 11:
                    System.out.println("Values: " + map.values());
                    break;

                case 12:
                    System.out.println("Entry Set: " + map.entrySet());
                    break;

                case 13:
                    System.out.print("Enter key: ");
                    key = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter default value: ");
                    value = sc.nextLine();
                    System.out.println("Result: " + map.getOrDefault(key, value));
                    break;

                case 14:
                    System.out.print("Enter key: ");
                    key = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter value: ");
                    value = sc.nextLine();
                    map.putIfAbsent(key, value);
                    System.out.println("Operation done.");
                    break;

                case 15:
                    System.out.print("Enter key to replace: ");
                    key = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new value: ");
                    value = sc.nextLine();
                    map.replace(key, value);
                    System.out.println("Replaced if key existed.");
                    break;

                case 16:
                    System.out.print("Enter key to compute: ");
                    key = sc.nextInt();
                    map.compute(key, (k, v) -> v == null ? "Default" : v + "_computed");
                    System.out.println("Computed.");
                    break;

                case 17:
                    System.out.print("Enter key for computeIfAbsent: ");
                    key = sc.nextInt();
                    map.computeIfAbsent(key, k -> "Absent_Added");
                    System.out.println("Computed if absent.");
                    break;

                case 18:
                    System.out.print("Enter key for computeIfPresent: ");
                    key = sc.nextInt();
                    map.computeIfPresent(key, (k, v) -> v + "_present");
                    System.out.println("Computed if present.");
                    break;

                case 19:
                    System.out.print("Enter key to merge: ");
                    key = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter value to merge: ");
                    value = sc.nextLine();
                    map.merge(key, value, (oldVal, newVal) -> oldVal + "_" + newVal);
                    System.out.println("Merged.");
                    break;

                case 20:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 20);

        sc.close();
    }
}

