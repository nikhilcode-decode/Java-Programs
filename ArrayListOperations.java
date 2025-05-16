package ArrayListt;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		ArrayList<String> ar = new ArrayList<String>();
		int choice;
		do
		{
			System.out.println("\n---------ArrayList Operation menu------------");
			System.out.println("1. Add Elements: ");
			System.out.println("2. Insert Elements of index : ");
			System.out.println("3. Get Elements : ");
			System.out.println("4. Update Elements : ");
			System.out.println("5. Remove elements by index : ");
			System.out.println("6. Remove elements by value : ");
			System.out.println("7. Search Elements : ");
			System.out.println("8. Display all elements : ");
			System.out.println("9. Clear list : ");
			System.out.println("10. Exit");
			System.out.println("Enter your choice : ");
			
			 choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	          
				switch (choice) {
	                case 1:
	                    System.out.print("Enter element to add: ");
	                    String element = sc.nextLine();
	                    ar.add(element);
	                    System.out.println("Element added.");
	                    break;

	                case 2:
	                    System.out.print("Enter index: ");
	                    int index = sc.nextInt();
	                    sc.nextLine(); // consume newline
	                    if (index >= 0 && index <= ar.size()) {
	                        System.out.print("Enter element: ");
	                        String elem = sc.nextLine();
	                        ar.add(index, elem);
	                        System.out.println("Element inserted.");
	                    } else {
	                        System.out.println("Invalid index.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter index to retrieve: ");
	                    index = sc.nextInt();
	                    if (index >= 0 && index < ar.size()) {
	                        System.out.println("Element at index " + index + ": " + ar.get(index));
	                    } else {
	                        System.out.println("Invalid index.");
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter index to update: ");
	                    index = sc.nextInt();
	                    sc.nextLine(); // consume newline
	                    if (index >= 0 && index < ar.size()) {
	                        System.out.print("Enter new value: ");
	                        String newValue = sc.nextLine();
	                        ar.set(index, newValue);
	                        System.out.println("Element updated.");
	                    } else {
	                        System.out.println("Invalid index.");
	                    }
	                    break;

	                case 5:
	                    System.out.print("Enter index to remove: ");
	                    index = sc.nextInt();
	                    if (index >= 0 && index < ar.size()) {
	                        ar.remove(index);
	                        System.out.println("Element removed.");
	                    } else {
	                        System.out.println("Invalid index.");
	                    }
	                    break;

	                case 6:
	                    System.out.print("Enter value to remove: ");
	                    String valueToRemove = sc.nextLine();
	                    if (ar.remove(valueToRemove)) {
	                        System.out.println("Element removed.");
	                    } else {
	                        System.out.println("Element not found.");
	                    }
	                    break;

	                case 7:
	                    System.out.print("Enter value to search: ");
	                    String searchValue = sc.nextLine();
	                    if (ar.contains(searchValue)) {
	                        System.out.println("Element found at index: " + ar.indexOf(searchValue));
	                    } else {
	                        System.out.println("Element not found.");
	                    }
	                    break;

	                case 8:
	                    System.out.println("All elements in the list: " + ar);
	                    break;

	                case 9:
	                    ar.clear();
	                    System.out.println("List cleared.");
	                    break;

	                case 10:
	                    System.out.println("Exiting program.");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please select from 1 to 10.");
	            }

			
			
		}while(choice != 10);
		{
			sc.close();
		}
		

	}

}
