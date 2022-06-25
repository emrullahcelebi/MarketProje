package day1;


import java.util.Scanner;

public class Q12_IfStatement03 {
		/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */
        public static void main(String[] args) {
            Scanner scan  = new Scanner(System.in);

            System.out.println("Lutfen is unvaninizi girin(qa, dev, ba, pm)");
            String jobTitle = scan.next();

            if (jobTitle.equalsIgnoreCase("qa")){
                System.out.println("unvaniniz Quality Analyst");
            } else if (jobTitle.equalsIgnoreCase("dev")) {
                System.out.println("unvaniniz Developer");
            } else if (jobTitle.equalsIgnoreCase("ba")) {
                System.out.println("unvaniniz Business Analyst");
            } else if (jobTitle.equalsIgnoreCase("pm")) {
                System.out.println("unvaniniz Project Manager");
            } else {
                System.out.println("Lutfen gecerli bir unvan girin");
            }
        }

}

