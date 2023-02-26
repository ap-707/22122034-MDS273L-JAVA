import java.util.Scanner;

public class LAB3{

    // Defining global variable
    static int size = 1024;
    static String[][] details = new String[size][5];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;
        do {
            System.out.println("Menu:");            // Menu
            System.out.println("1. Enter student details");
            System.out.println("2. Display student details");
            System.out.println("3. Search student details");
            System.out.println("4. Exit");
            System.out.print("Enter an option: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    collectDetails();
                    break;
                case 2:
                    displayDetails();
                    break;
                case 3:
                    searchDetails();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option. Try again");
            }
        } while (option != 4);
    }

    // Colectiong Details.
    public static void collectDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Collecting data into 2 dimentional array.

                details[count][0] = name;
                System.out.print("Enter register number: ");
                details[count][1] = sc.nextLine();
                System.out.print("Enter email: ");
                details[count][2] = sc.nextLine();
                System.out.print("Enter class: ");
                details[count][3] = sc.nextLine();
                System.out.print("Enter department: ");
                details[count][4] = sc.nextLine();
                count++;
                System.out.println("Details added successfully!");



    }

    // Display all student's details in tabular formate.
    public static void displayDetails() {
        System.out.println("_____________________________________________________________________________");
        System.out.println("Name        Register Number Email               Class      Department");     // creating column headings in output
        System.out.println("````````````````````````````````````````````````````````````````````````````");
        for (String[] s : details) {
            if(s[1] == null){
                break;
            }else{
                System.out.printf("%-12s%-16s%-20s%-11s%s\n",s[0],s[1],s[2],s[3],s[4]);   // print each row using printf function. it's same as we were using in  c language.
            }
        }
        System.out.println("_____________________________________________________________________________");

    }

    // Search student by Register number
    public static void searchDetails() {
        Scanner sc = new Scanner(System.in);
        boolean regFound = false;

        System.out.print("Enter student Register number: ");

        String Reg = sc.nextLine(); // taking input from user.
        System.out.println("_____________________________________________________________________________");
        System.out.println("Name        Register Number Email               Class      Department");     // creating column headings in output
        System.out.println("````````````````````````````````````````````````````````````````````````````");

        for (String[] s : details) {

            if(Reg.equalsIgnoreCase(s[1])){

                System.out.printf("%-12s%-16s%-20s%-11s%s\n",s[0],s[1],s[2],s[3],s[4]);   // print each row using printf function. it's same as we were using in  c language.
                break;

            }

            if(regFound){
                System.out.println(Reg + "' not found!");
                break;
            }
        }
        System.out.println("_____________________________________________________________________________");
        
    }
}
