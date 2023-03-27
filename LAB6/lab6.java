import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

class Student {

    Scanner sc = new Scanner(System.in);
    String name, email, clas, department, inputData, phone, reg;

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
        String FileName = name + "_" + reg + ".txt";
        try {
            System.out.print("Emnter new file name: ");

            File file = new File(FileName);

            if (file.exists()) {
                System.out.println("file is exist...");
            } else {
                System.out.println("file is not exist...");

                if (file.createNewFile()) {
                    System.out.println("file is created...");
                } else {
                    System.out.println("Error in file creation...");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // file writing

        try {
            FileWriter fw = new FileWriter(FileName);
            inputData = "=========================================================================\n" +
                    "NAME       EMAIL               PHONE        REG.NO.        DEPARTMENT\n" +
                    "--------------------------------------------------------------------------\n" +
                    "%-11s%-20s%-13d%-15d%d" + name + email + phone + reg + department;

            fw.write(inputData);
            System.out.println("Data saved...");
            fw.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
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
        int counter = 0, choice, updateChoice, r, updateReg;
        boolean flag = true;

        String name, phone, email, clas, department, inputData, reg;

        while (flag) {
            System.out.println("=============MENU===============");
            System.out.println("1.ADD A STUDENT");
            System.out.println("2.SEARCH STUDENT");
            System.out.println("3.UPDATE THE DETAIL OF STUDENT");
            System.out.println("4.DISPLAY ALL STUDENTS");
            System.out.println("=================================");

            choice = Integer.parseInt(sc.nextLine());

            System.out.println("Choose any one: ");

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
                    s[counter] = new Student(name, email, phone, reg, clas, department);
                    break;
                }

                case 2: {
                    System.out.println("=============SEARCH STUDENT=============");
                    System.out.print("ENTER REG. NO.: ");
                    r = Integer.parseInt(sc.nextLine());
                    System.out.println("=========================================================================");

                    System.out.println("NAME       EMAIL               PHONE        REG.NO.        DEPARTMENT");
                    System.out.println("--------------------------------------------------------------------------");
                    for (int i = 0; i <= s.length; i++) {
                        if (s[i] == null) {
                            System.out.println("object is null");
                        } else {
                            if (s[i].reg.equals(r)) {
                                System.out.printf("%-11s%-20s%-13d%-15d%d" +
                                        s[i].name,
                                        s[i].email,
                                        s[i].phone,
                                        s[i].reg,
                                        s[i].department);
                            }
                        }
                    }
                    System.out.println("=========================================================================");
                    break;
                }

                case 3: {
                    System.out.print("ENTER REG.NO.:");
                    updateReg = Integer.parseInt(sc.nextLine());

                    System.out.println("1.NAME");
                    System.out.println("2.EMAIL");
                    System.out.println("3.PHONE");
                    System.out.println("4.REG. NO.");
                    System.out.println("5.CLASS");
                    System.out.println("6.DEPARTMENT");

                    System.out.println("what you want to update:");
                    updateChoice = Integer.parseInt(sc.nextLine());

                    switch (updateChoice) {
                        case 1: {
                            System.out.print("Enter Name:");
                            for (Student i : s) {
                                if (i.reg.equals(updateReg)) {
                                    i.name = sc.nextLine();
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
                                    i.clas = sc.nextLine();
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
                }

                case 4: {
                    System.out.println("=========================================================================");
                    System.out.println("NAME       EMAIL               PHONE        REG.NO.        DEPARTMENT");
                    System.out.println("--------------------------------------------------------------------------");
                    for (Student i : s) {
                        System.out.printf("%-11s%-20s%-13d%-15d%d" + i.name, i.email, i.phone, i.reg, i.department);
                    }
                    System.out.println("=========================================================================");
                    break;
                }

                default: {
                    System.out.println("Please enter valid input.🙄");
                }
            }

        }

    }
}
