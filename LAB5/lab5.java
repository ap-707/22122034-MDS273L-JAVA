import java.util.Scanner;

public class LAB5 {
    static String dataDecryption(String data){

        String[] dataArr = data.split("");
        String str = "";

        for (int i = 0 ; i<data.toCharArray().length ; i++){
            if(dataArr[i].equalsIgnoreCase("a")) {
                str = str + "X";
            } else if (dataArr[i].equalsIgnoreCase("b")){
                str = str + "Y";
            }else if (dataArr[i].equalsIgnoreCase("c")){
                str = str + "Z";
            }else if (dataArr[i].equalsIgnoreCase("d")){
                str = str + "A";
            }else if (dataArr[i].equalsIgnoreCase("e")){
                str = str + "B";
            }else if (dataArr[i].equalsIgnoreCase("f")){
                str = str + "C";
            }else if (dataArr[i].equalsIgnoreCase("g")){
                str = str + "D";
            }else if (dataArr[i].equalsIgnoreCase("h")){
                str = str + "E";
            }else if (dataArr[i].equalsIgnoreCase("i")){
                str = str + "F";
            }else if (dataArr[i].equalsIgnoreCase("j")){
                str = str + "G";
            }else if (dataArr[i].equalsIgnoreCase("k")){
                str = str + "H";
            }else if (dataArr[i].equalsIgnoreCase("l")){
                str = str + "I";
            }else if (dataArr[i].equalsIgnoreCase("m")){
                str = str + "J";
            }else if (dataArr[i].equalsIgnoreCase("n")){
                str = str + "K";
            }else if (dataArr[i].equalsIgnoreCase("o")){
                str = str + "L";
            }else if (dataArr[i].equalsIgnoreCase("p")){
                str = str + "M";
            }else if (dataArr[i].equalsIgnoreCase("q")){
                str = str + "N";
            }else if (dataArr[i].equalsIgnoreCase("r")){
                str = str + "O";
            }else if (dataArr[i].equalsIgnoreCase("s")){
                str = str + "P";
            }else if (dataArr[i].equalsIgnoreCase("t")){
                str = str + "Q";
            }else if (dataArr[i].equalsIgnoreCase("u")){
                str = str + "R";
            }else if (dataArr[i].equalsIgnoreCase("v")){
                str = str + "S";
            }else if (dataArr[i].equalsIgnoreCase("w")){
                str = str + "T";
            }else if (dataArr[i].equalsIgnoreCase("x")){
                str = str + "U";
            }else if (dataArr[i].equalsIgnoreCase("y")){
                str = str + "V";
            }else if (dataArr[i].equalsIgnoreCase("z")){
                str = str + "W";
            }else{
                str = str+" ";
            }
        }

        return str;
    }

    static String dataEncryption(String data){

        String[] dataArr = data.split("");
        String str = "";

        for (int i = 0 ; i<data.toCharArray().length ; i++){
            if(dataArr[i].equalsIgnoreCase("x")) {
                str = str + "A";
            } else if (dataArr[i].equalsIgnoreCase("y")){
                str = str + "B";
            }else if (dataArr[i].equalsIgnoreCase("z")){
                str = str + "C";
            }else if (dataArr[i].equalsIgnoreCase("a")){
                str = str + "D";
            }else if (dataArr[i].equalsIgnoreCase("B")){
                str = str + "E";
            }else if (dataArr[i].equalsIgnoreCase("c")){
                str = str + "F";
            }else if (dataArr[i].equalsIgnoreCase("d")){
                str = str + "G";
            }else if (dataArr[i].equalsIgnoreCase("e")){
                str = str + "H";
            }else if (dataArr[i].equalsIgnoreCase("f")){
                str = str + "I";
            }else if (dataArr[i].equalsIgnoreCase("g")){
                str = str + "j";
            }else if (dataArr[i].equalsIgnoreCase("h")){
                str = str + "K";
            }else if (dataArr[i].equalsIgnoreCase("I")){
                str = str + "L";
            }else if (dataArr[i].equalsIgnoreCase("j")){
                str = str + "M";
            }else if (dataArr[i].equalsIgnoreCase("k")){
                str = str + "n";
            }else if (dataArr[i].equalsIgnoreCase("l")){
                str = str + "O";
            }else if (dataArr[i].equalsIgnoreCase("m")){
                str = str + "P";
            }else if (dataArr[i].equalsIgnoreCase("n")){
                str = str + "Q";
            }else if (dataArr[i].equalsIgnoreCase("o")){
                str = str + "R";
            }else if (dataArr[i].equalsIgnoreCase("p")){
                str = str + "S";
            }else if (dataArr[i].equalsIgnoreCase("q")){
                str = str + "T";
            }else if (dataArr[i].equalsIgnoreCase("r")){
                str = str + "U";
            }else if (dataArr[i].equalsIgnoreCase("s")){
                str = str + "V";
            }else if (dataArr[i].equalsIgnoreCase("t")){
                str = str + "W";
            }else if (dataArr[i].equalsIgnoreCase("U")){
                str = str + "X";
            }else if (dataArr[i].equalsIgnoreCase("v")){
                str = str + "Y";
            }else if (dataArr[i].equalsIgnoreCase("W")){
                str = str + "Z";
            }else{
                str = str+" ";
            }
        }

        return str;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String origin;
        boolean flag = true;

        while(flag){
        System.out.print("Enter your message here:");
        origin = sc.nextLine();


        System.out.println("===============MENU==============");
        System.out.println("1.Encrypt\n"+
                           "2.Decrypt\n"+
                           "0.Exit\n"+
                           "================================="
        );

        System.out.print("\nEnter Your choice: ");
        int choice = Integer.parseInt(sc.nextLine());



            switch(choice){
                case 1:
                    String dec = dataDecryption(origin);
                    System.out.print("Encrypted message :");
                    System.out.println(dec);
                    break;
                case 2:
                    String enc = dataEncryption(origin);
                    System.out.print("Decrypted message :");
                    System.out.println(enc);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("please enter valied choice...");
                    break;
            }

        }

    }
}
