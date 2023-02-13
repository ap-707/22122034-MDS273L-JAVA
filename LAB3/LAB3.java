import java.util.Scanner;

public class LAB3{
    static int size = 1024;
    static String[][] details = new String[size][5];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Menu:");
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

    public static void collectDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

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

    public static void displayDetails() {
        System.out.println("Name\t\tRegister Number\t\tEmail\t\t\tClass\t\tDepartment");
        for (String[] s : details) {
            System.out.println(s[0] + "\t\t" + s[1] + "\t\t" + s[2] + "\t\t" + s[3] + "\t\t" + s[4]);
            if(s[1] == null){
                break;
            }
        }
    }

    public static void searchDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student Register number: ");
        String Reg = sc.nextLine();

        for(String[] s : details){
            if(Reg.equalsIgnoreCase(s[1])){
                System.out.println("Name\t\tRegister Number\t");
                System.out.println(s[0]+"\t\t"+s[1]+"\t");
                break;
            }else{
                System.out.println("Details for the student with the Register number '" + Reg + "' not found!");
                break;
            }
        }

    }

    public static void searchDetails(String reg) {
        for(String[] s: details){
            if (s[1] == reg) {
                System.out.println("Details of the student '" + reg + "':");
                System.out.println("Name: " + s[0]);
                System.out.println("Register Number: " + s[1]);
                System.out.println("Email: " + s[2]);
                System.out.println("Class: " + s[3]);
                System.out.println("Department: " + s[4]);
            } else {

                System.out.println("No student with the name '" + reg + "' was found.");

            }
        }

    }



}