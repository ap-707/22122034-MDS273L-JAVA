import java.awt.image.AbstractMultiResolutionImage;
import java.util.Scanner;
public class LAB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//         collecting details.
        
        System.out.println("Enter Employee's Detail:");
        System.out.print("Name :");
        String name = sc.nextLine();

        System.out.print("Age :");
        int age = sc.nextInt();

        System.out.print("Gender (Male/Female) :");
        sc.nextLine();
        String gender = sc.nextLine();

        System.out.print("Salary :");
        String salary1 = sc.nextLine();
        int salary =  Integer.parseInt(salary1);

        System.out.print("Company :");
        String company = sc.nextLine();

        System.out.print("Position in Company :");
        String position = sc.nextLine();

        System.out.print("Department :");
        String department = sc.nextLine();

        String region = "";  // region will assign in further process.

        System.out.print("State :");
        String state_ = sc.nextLine();

        System.out.println("-------------------------------------------------------------------");
        System.out.println("About this Employee");   // Show details about employee.
        System.out.println("-------------------------------------------------------------------");
        
//         Define regions.
        
        String[] north_states = {"Jammu & Kashmir", "Himachal Pradesh", "Punjab", "Uttarakhand", "Haryana", "Delhi", "Rajasthan", "Uttar Pradesh","UT Chandigarh"};
        String[] southern_states = {"Andhra Pradesh", "Karnataka", "Kerala", "Tamil Nadu", "Telangana"};
        String[] eastern_states = {"Arunachal Pradesh", "Assam", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Sikkim", "Tripura"};
        String[] west_states = {"Goa", "Gujarat", "Maharashtra", "Daman", "Diu", "Dadra Nagar Haveli"};

        
        for (String s : north_states) {
            if (state_.equalsIgnoreCase(s)) {    // if state comes from north region then 'Nnrth' will assign to 'region' variable.
                region = "North";
                break;
            }
        }
        for (String s : southern_states) {     
            if (state_.equalsIgnoreCase(s)) {    // if state comes from north region then 'South' will assign to 'region' variable.
                region = "South";
                break;
            }
        }
        for (String s : eastern_states) {      
            if (state_.equalsIgnoreCase(s)) {   // if state comes from north region then 'East' will assign to 'region' variable.
                region = "East";
                break;
            }
        }
        for (String s : west_states) {
            if (state_.equalsIgnoreCase(s)) {    // if state comes from north region then 'West' will assign to 'region' variable.
                region = "West";
                break;
            }
        }


        String[] MNCs = {"Facebook", "Google", "Microsoft", "Samsung", "IBM", "Apple"};
        String MNC = "";
        for (String s : MNCs) {
            if (company.equalsIgnoreCase(s)) {   // if comapny variable contains any MNC company's name then it'll assign to 'MNC' named variable.
                MNC = s;
                break;
            }
            else{
                MNC = "";
            }
        }

'        String G = gender;

        System.out.println("The employees' name is "+ name+ " and "+ ((G.equalsIgnoreCase("male"))?"he is ":"she is ") + ((G.equalsIgnoreCase("male"))?"Male":"Female") );
        System.out.println("The Employee" + name +" is from the "+ region + " states of India; Preferable work location is in " + state_);

        if(MNC.equalsIgnoreCase("")){       // if MNC is empty means employee has never worked in MNCs.
            System.out.println("The employee " + name +" is working in "+ company + ".");
        }else{
            System.out.println("The employee " + name +" is working in Top MNC Companies.");
            System.out.println("The company is "+MNC);
        }
    }
}
