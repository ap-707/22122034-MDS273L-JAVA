import java.util.Arrays;
import java.util.Scanner;
public class LAB2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int k = 0;

		String[] arr = new String[1024];  		// Defining fixed length array.
		String[] newarr = new String[arr.length-1];	
		boolean flag = true;

		char[] specialChar = {'@','!','#','$','%','^','&','*','(',')','_',' ','+','='};   // special chrectors that should not be in the name.

		String search;

		String DeleteName;
		int sIndex;


		do{
			System.out.println("-----------------------------------");	// menu
			System.out.println("1.Enter a name.");
			System.out.println("2.Search for a name.");
			System.out.println("3.Remove a name");
			System.out.println("0.Exit");
			System.out.println("-----------------------------------");
			

			System.out.println();
			System.out.print("Enter Your Choice:");
			int choice = Integer.parseInt(sc.nextLine());
	
			switch (choice) {

				case 1: {
					Boolean valiedName = false;
					Boolean ExistName = false;

					System.out.println("Enter the name:");

					String name = sc.nextLine();

					for (char j : specialChar) {
						if (name.contains(Character.toString(j))) {  			//if entered name contains any special charector, it'll show warning message.
							System.out.println("Please enter valied Name.");
							valiedName = false;
							break;
						} else {
							valiedName = true;			// set valiedName true.
						}
					}

					for (String s : arr) {
						if (name.equalsIgnoreCase(s)) {			// if name already present in the name array, it'll shoe error message.
							System.out.println(name + " already exist in the list.");
							System.out.println("Please enter different name.");
							ExistName = true; 			// set ExistName true.
							break;
						}
					}

					if (valiedName && ExistName == false) {			// if the condition is teue then add name into array.
						arr[k++] = name;
						System.out.println(name + " added into the list.");
					}

					for(String s : arr ){
						if(s == null){     				// Print the names.
							System.out.print(a+",");
						}
					}

					break;
				}
				case 2: {
					System.out.print("Search: ");

					search = sc.nextLine();

					System.out.println("Searching for a name...");

					sIndex = 0;
					for (String s : arr) {
						sIndex++;
						if (search.equalsIgnoreCase(s)) {			// Searching the name.
							System.out.println(search + " is in the list at " + sIndex + "th position");
							break;
						}
					}

					break;
				}
				case 3: {
					System.out.print("Enter name: ");

					DeleteName = sc.nextLine();

					for (int i = 0, p = 0; i < arr.length; i++) {
						if (arr[i] == DeleteName) {				// if the name is found, it will replaced by last name.
							arr[i] = arr[arr.length-1];			// so the name will be removed from the array.
						}
					}

					System.out.println("\n-----------------------------------");
					System.out.println("Name Successfully Removed.");
					for (int i = 0; i < k; i++) {
						System.out.print(arr[i] + ",");
					}
					System.out.println("\n-----------------------------------\n");
					break;
				}
				case 0: {
					flag = false;
					break;
				}
				default: {
					System.out.println("\nPlease enter valied input.\n");
					break;
				}
			}
		}while(flag);
	}
}
