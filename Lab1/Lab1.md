QUESTION: Write a Java Program that will collect an employee's basic details that fall into different data types and displays them. After the details have been displayed, with the help of conditional statements, check if the gender of the employee is 'm' or 'f'. It should print "MALE" for 'm' and "FEMALE" for 'f'. Assume that you can divide the states among India into different regions (North, South, Central, East, and West). If the employee is from the southern part of India, with the help of a switch statement, it should display "The Employee is from the southern states of India; Preferable work location is in ", along with the basic details. Identify if the employee belongs to the top MNC Companies (Facebook, Google, Microsoft, Samsung, IBM, Apple); if so, print a message "The employee is working in Top MNC Companies".

Note: Your program should be neatly organized, with appropriate comments, variable names, proper input output formatting, and necessary validations. 

--------------------------------------------------------------------------------------------------------------------------------------
PROGRAM

import java.util.Scanner; 
public class LAB1 { 
    public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);

//Takinbg inputs from user.

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

String region = "";

System.out.print("State :");
String state_ = sc.nextLine();


// Displaying Employees Data.

System.out.println("-------------------------------------------------------------------");
System.out.println("About this Employee");
System.out.println("-------------------------------------------------------------------");

String[] north_states = {"Jammu & Kashmir", "Himachal Pradesh", "Punjab", "Uttarakhand", "Haryana", "Delhi", "Rajasthan", "Uttar Pradesh","UT Chandigarh"};
String[] southern_states = {"Andhra Pradesh", "Karnataka", "Kerala", "Tamil Nadu", "Telangana"};
String[] eastern_states = {"Arunachal Pradesh", "Assam", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Sikkim", "Tripura"};
String[] west_states = {"Goa", "Gujarat", "Maharashtra", "Daman", "Diu", "Dadra Nagar Haveli"};

// Assign Region.
for (String s : north_states) {
    if (state_.equalsIgnoreCase(s)) {
        region = "North";
        break;
    }
}
for (String s : southern_states) {
    if (state_.equalsIgnoreCase(s)) {
        region = "South";
        break;
    }
}
for (String s : eastern_states) {
    if (state_.equalsIgnoreCase(s)) {
        region = "East";
        break;
    }
}
for (String s : west_states) {
    if (state_.equalsIgnoreCase(s)) {
        region = "West";
        break;
    }
}

// Check MNCs.

String[] MNCs = {"Facebook", "Google", "Microsoft", "Samsung", "IBM", "Apple"};
String MNC = "";
for (String s : MNCs) {
    if (company.equalsIgnoreCase(s)) {
        MNC = s;
        break;
    }
    else{
        MNC = "";
    }
}

String G = gender;

System.out.println("The employees' name is "+ name+ " and "+ ((G.equalsIgnoreCase("male"))?"he is ":"she is ") + ((G.equalsIgnoreCase("male"))?"Male":"Female") );
System.out.println("The Employee" + name +" is from the "+ region + " states of India; Preferable work location is in " + state_);

if(MNC.equalsIgnoreCase("")){
    System.out.println("The employee " + name +" is working in "+ company + ".");
}else{
    System.out.println("The employee " + name +" is working in Top MNC Companies.");
    System.out.println("The company is "+MNC);
}
}
