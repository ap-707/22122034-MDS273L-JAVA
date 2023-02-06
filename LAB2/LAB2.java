import java.util.Scanner;

public class LAB2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int k = 0;

		String[] arr = new String[1024];

		char[] specialChar = {'@','!','#','$','%','^','&','*','(',')',,'_',' ','+','='}

		String search;

		String DeleteName;
		int indexed;

		do{
			System.out.println("-----------------------------------");
			System.out.println("1.Enter a name.");
			System.out.println("2.Search for a name.");
			System.out.println("3.Remove a name");
			System.out.println("0.Exit");
			System.out.println("-----------------------------------");

			int choice = Integer.parseInt(sc.nextLine());
	
			swich(choice){

				case 1:
						System.out.println("Enter the name:");

						String name = sc.nextLine();
					
						for(char j : specialChar){
							if(name.contains(j)){
								break;
							}
						}
			
	
						for(String s : arr){
							if(s.equalsIgnoreCase(name)){
								System.out.println(name+" already exist in the list.");
								System.out.println("Please enter different name.");
								break;
							}else{
								arr.add(name);
								System.out.println(name+" added into the list.");
							}
						}						

						
						k = k+1;
						
						break;

				case 2:
						System.out.print("Search: ");

						search = sc.nectLine();

						System.out.println("Searching for a name...");

						for(String searhing : arr){
							if(searhing == search){
								System.out.println(search+ " is in the list at " +arr.indexOf(search) + "th index");
							}else{continue;}
						}
		
						break;

				case 3:

						System.out.print("------------------------------------");
						System.out.print("1 -> delete name by index.");
						System.out.print("2 -> delete name by value.");
						System.out.print("------------------------------------");
						System.out.print("Enter choice: ");
						
						int choice2 = Integer.parseInt(sc.nextInt());

						swich(choice2){
							case 1:
								indexed = Integer.parseInt(sc.nextLine());
								System.out.print("Enter Index: ");
								arr.remove(Integer.valueOf(indexed));
								System.out.println("-----------------------------------")
								System.out.println("Name Successfully Removed.")
								System.out.println("-----------------------------------")
								break;

							case 2:
								System.out.print("Enter name: ");
								DeleteName = sc.nextLine();


								indexed = Integer.parseInt(sc.nextLine());
								System.out.print("Enter Index: ");
								arr.remove(Integer.valueOf(indexed));
								System.out.println("-----------------------------------")
								System.out.println("Name Successfully Removed.")
								System.out.println("-----------------------------------")

								break;

							default:
								break;
						}
						
						break;
			
				case 0:
						flag == false;
						break;
				default:
						System.out.println("Please enter valied input.");
						break;
			}
		}while(flag == true);
	}
}
