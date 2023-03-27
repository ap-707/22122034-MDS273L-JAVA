import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

class Student {

    Scanner sc = new Scanner(System.in);
    String name, email, clas, department, inputData, inputData2, phone, reg;

    public Student(String name2, String email2, String phone2, String reg2, String clas2, String department2) {
        this.reg = reg2;
        this.name = name2;
        this.email = email2;
        this.phone = phone2;
        this.clas = clas2;
        this.department = department2;
    }

    void saveIntoFile() {
        // file creartion
        // String FileName = "D:\\ASHISH\\Study Material\\JAVA\\CLASSES\\Students\\" +
        // name + "_" + reg + ".txt";
        String FileName = "D:\\ASHISH\\Study Material\\JAVA\\CLASSES\\Students\\" + reg + ".txt";

        try {
            System.out.print("Enter new file name: ");

            File file = new File(FileName);

            if (file.exists()) {
                System.out.println("file is exist...");
            } else {
                System.out.println("file is not exist...");

                if (file.createNewFile()) {
                    System.out.println("file is created...");

                    FileWriter fw = new FileWriter(FileName);

                    inputData = "=========================================================================\n" +
                            "NAME       EMAIL               PHONE        REG.NO.        DEPARTMENT\n" +
                            "--------------------------------------------------------------------------\n" +
                            String.format("%-11s", name) +
                            String.format("%-20s", email) +
                            String.format("%-13s", phone) +
                            String.format("%-15s", reg) +
                            String.format("%-20s", department);

                    fw.write(inputData);

                    fw.close();

                    System.out.println("Data Saved...");
                } else {
                    System.out.println("Error in file creation...");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    void printStudentDetail() {
        System.out.println("--------DETAILS---------");
        System.out.println("NAME: " + name);
        System.out.println("EMAIL: " + email);
        System.out.println("PHONE: " + phone);
        System.out.println("REG. NO.: " + reg);
        System.out.println("CLASS: " + clas);
        System.out.println("DEPARTMENT: " + department);
        System.out.println("########################");

    }

}

public class lab6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[100];
        int choice, updateChoice;
        boolean flag = true;

        String name, phone, email, clas, department, reg, r, updateReg;

        while (flag) {
            System.out.println("\n=============MENU===============");
            System.out.println("1.ADD A STUDENT");
            System.out.println("2.SEARCH STUDENT");
            System.out.println("3.UPDATE THE DETAIL OF STUDENT");
            System.out.println("4.DISPLAY ALL STUDENTS");
            System.out.println("=================================");

            System.out.print("Choose any one: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: {
                    System.out.print("NAME: ");
                    name = sc.nextLine();
                    System.out.print("EMAIL: ");
                    email = sc.nextLine();
                    System.out.print("PHONE: ");
                    phone = sc.nextLine();
                    System.out.print("REG. NO.: ");
                    reg = sc.nextLine();
                    System.out.print("CLASS: ");
                    clas = sc.nextLine();
                    System.out.print("DEPARTMENT: ");
                    department = sc.nextLine();
                    Student temp = new Student(name, email, phone, reg, clas, department);
                    for (int i = 0; i < s.length; i++) {
                        if (s[i] == null) {
                            s[i] = temp;
                            s[i].saveIntoFile();
                            break;
                        }
                    }

                    break;
                }

                case 2: {
                    System.out.println("\n=============================SEARCH STUDENT=============================");
                    System.out.print("ENTER REG. NO.: ");
                    r = sc.nextLine();

                    System.out.println(
                            "====================================================================================");
                    System.out.println(
                            "NAME       EMAIL                              PHONE        REG.NO.        DEPARTMENT");
                    System.out.println(
                            "------------------------------------------------------------------------------------");

                    for (int i = 0; i <= s.length - 1; i++) {
                        // for (Student i : s) {
                        // if (s[i].reg.equals(r) && s[i] != null) {
                        // if (s[i].reg == r) {

                        if (s[i] != null && s[i].reg == r) {
                            System.out.printf("%-11s" + "%-35s" + "%-13s" + "%-15s" + "%s\n",
                                    s[i].name,
                                    s[i].email,
                                    s[i].phone,
                                    s[i].reg,
                                    s[i].department);
                            break;
                        }

                        // break;
                        // }

                        // }

                    }
                    System.out.println(
                            "\n========================================================================================");
                    break;
                }

                case 3: {
                    System.out.print("ENTER REG.NO.:");
                    updateReg = sc.nextLine();

                    System.out.println("\t1.NAME");
                    System.out.println("\t2.EMAIL");
                    System.out.println("\t3.PHONE");
                    System.out.println("\t4.REG. NO.");
                    System.out.println("\t5.CLASS");
                    System.out.println("\t6.DEPARTMENT");

                    System.out.println("What you want to Update:");
                    updateChoice = Integer.parseInt(sc.nextLine());

                    switch (updateChoice) {
                        case 1: {
                            System.out.print("Enter Name:");
                            for (Student i : s) {
                                if (i.reg.equals(updateReg)) {
                                    i.name = sc.nextLine();
                                    break;
                                }
                            }
                            System.out.println("✅NAME UPDATETED !!");
                            break;
                        }

                        case 2: {
                            System.out.print("Enter Email:");
                            for (Student i : s) {
                                if (i.reg.equals(updateReg)) {
                                    i.email = sc.nextLine();
                                }
                            }
                            System.out.println("✅EMAIL UPDATETED !!");
                            break;
                        }

                        case 3: {
                            System.out.print("Enter Phone:");
                            for (Student i : s) {
                                if (i.reg.equals(updateReg)) {
                                    i.phone = sc.nextLine();
                                }
                            }
                            System.out.println("✅PHONE UPDATETED !!");
                            break;
                        }

                        case 4: {
                            System.out.print("Enter REG. NO.:");
                            for (Student i : s) {
                                if (i.reg.equals(updateReg)) {
                                    i.reg = sc.nextLine();
                                }
                            }
                            System.out.println("✅PHONE UPDATETED !!");
                            break;
                        }

                        case 5: {
                            System.out.print("Enter CLASS:");
                            for (Student i : s) {
                                if (i.reg.equals(updateReg)) {
                                    i.clas = sc.nextLine();
                                }
                            }
                            System.out.println("✅CLASS UPDATETED !!");
                            break;
                        }

                        case 6: {
                            System.out.print("Enter DEPARTMENT:");
                            for (Student i : s) {
                                if (i.reg.equals(updateReg)) {
                                    i.department = sc.nextLine();
                                }
                            }
                            System.out.println("✅DEPARTMENT UPDATETED !!");
                            break;
                        }

                        default: {
                            System.out.println("----------------------------");
                            System.out.println("Please enter Valid Input");
                            System.out.println("----------------------------");
                            break;
                        }
                    }

                    break;
                }

                case 4: {
                    System.out.println(
                            "====================================================================================");
                    System.out.println(
                            "NAME       EMAIL                              PHONE        REG.NO.        DEPARTMENT");
                    System.out.println(
                            "------------------------------------------------------------------------------------");

                    try {
                        for (int i = 0; i <= s.length; i++) {
                            if (s[i] != null) {
                                System.out.printf("%-4d" + "%-11s" + "%-35s" + "%-13s" + "%-15s" + "%s\n",
                                        i + 1,
                                        s[i].name,
                                        s[i].email,
                                        s[i].phone,
                                        s[i].reg,
                                        s[i].department);
                            }

                        }
                    } catch (Exception e) {
                    }

                    System.out.println("=========================================================================");
                    break;
                }

                default: {
                    System.out.println("Please enter valid input.🙄");
                }
            }

        }
        sc.close();
    }
}
