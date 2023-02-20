import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class LAB4 {

    public static final Scanner sc = new Scanner(System.in);
//  -----------------global variables.-------------

    static String AccountNumber;
    static String AccountHolder;
    static int AccountBalance;

    static String[][] transactions = new String[100][5];
    static int iterator = 0;

//  ------------------User Defne Function---------------------
static void InitializeTheCustomer(){
    System.out.println("______________________________\n1. Initialize the customer\n````````````````````````````````");

    System.out.print("\nEnter customer name:");
    AccountHolder = sc.nextLine();

    System.out.print("\nEnter Account Number:");
    AccountNumber = sc.nextLine();

    System.out.print("\nEnter Balance:");
    AccountBalance = Integer.parseInt(sc.nextLine());

    System.out.println("______________________________\nCustomer added Successfully\n````````````````````````````````");

}

static void depositMoney(){
    System.out.println("______________________________\n2. Deposit Money\n````````````````````````````````");

    System.out.print("Enter Amount: ");
    int deposite = Integer.parseInt(sc.nextLine());
    int old_bal = AccountBalance;
    AccountBalance = AccountBalance + deposite;

//    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd    HH:mm:ss");
    LocalDateTime cr_dt = LocalDateTime.now();


    iterator++;
    transactions[iterator][0] = "Deposite";
    transactions[iterator][1] = ""+deposite;
    transactions[iterator][2] = ""+AccountBalance;
    transactions[iterator][3] = ""+dt.format(cr_dt);
    transactions[iterator][4] = ""+old_bal;

    System.out.println("Your New Balance: "+AccountBalance);
}

static void WithdrawMoney(){
    System.out.println("______________________________\n3. Withdraw Money\n````````````````````````````````");
    int old_bal = AccountBalance;
    System.out.print("Enter Amount: ");
    int Withdraw = Integer.parseInt(sc.nextLine());

    if(AccountBalance <= 0 || AccountBalance < Withdraw){
        System.out.println("ERROR: Insufficient balance.");
    }else{
        AccountBalance = AccountBalance - Withdraw;
    }

    DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd    HH:mm:ss");
    LocalDateTime cr_dt = LocalDateTime.now();

    iterator++;
    transactions[iterator][0] = "Withdraw";
    transactions[iterator][1] = ""+Withdraw;
    transactions[iterator][2] = ""+AccountBalance;
    transactions[iterator][3] = ""+dt.format(cr_dt);
    transactions[iterator][4] = ""+old_bal;

    System.out.println("Your New Balance: "+AccountBalance);
}

static void showTransactoins(){
    System.out.println("_______________\n3. Withdraw Money\n````````````````");

    System.out.println("transaction Ammount   Old Balance New Balance DATE        TIME");
    for(String[] s: transactions){
        if(s[0]==null){
            continue;
        }else{
            System.out.printf("%-12s"+"%-10s"+"%-12s"+"%-12s"+"%s\n",s[0],s[1],s[4],s[2],s[3]);
        }
    }
    System.out.println("--------------END-------------");
}

static void accountSummary(){
    System.out.println("Account Holder Name: "+AccountHolder);
    System.out.println("Account Number:"+AccountNumber);
    System.out.println("Account Balance: "+AccountBalance);

}

//    ----------------------MAIN---------------------
    public static void main(String[] args) {
        boolean flag = true;

        InitializeTheCustomer();

        while(flag){
            System.out.println("------------MENU----------------");
            System.out.println("1. deposit money");
            System.out.println("2. withdraw money");
            System.out.println("3. print the transactions");
            System.out.println("4. print account summary");
            System.out.println("5. Exit");
            System.out.println("--------------------------------");
            System.out.print("\nChoose option: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch(choice){
                case 1:
                    depositMoney();
                    break;
                case 2:
                    WithdrawMoney();
                    break;
                case 3:
                    showTransactoins();
                    break;
                case 4:
                    accountSummary();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Enter valied Input.");
                    break;
            }
        }
    }
}
