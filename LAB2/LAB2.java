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

					if (valiedName && ExistName == false) {
						arr[k++] = name;
						System.out.println(name + " added into the list.");
					}

					System.out.println("Name: " + Arrays.toString(arr));

					break;
				}
				case 2: {
					System.out.print("Search: ");

					search = sc.nextLine();

					System.out.println("Searching for a name...");

					sIndex = 0;
					for (String s : arr) {
						sIndex++;
						if (search.equalsIgnoreCase(s)) {
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
						if (arr[i] == DeleteName) {
							arr[i] = arr[arr.length-1];
						}
					}
//					int zz = 0;
//					for(String s : arr){
//						if (s  == DeleteName){
//							continue;
//						}else{
//							newarr[zz++] = s;
//						}
//					}

//					System.out.println("Array : " + Arrays.toString(newarr));
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
