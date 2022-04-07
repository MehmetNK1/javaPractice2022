package practice_basic_day01;


import java.util.Scanner;

public class Q12_IfStatement03 {
		/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin.
        Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data:
         qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("is unvani ni gir :" +
                    "\n 1. ise qa  yaz\n 2. ise dev yaz" +
                    "\n 3. ise ba  yaz\n 4. ise pm  yaz");
            String isBasligi = scan.next().toLowerCase().toUpperCase();
            if (isBasligi.equals("qa")) {
                System.out.println("Quality Analyst");
            }else if (isBasligi.equals("dev")) {
                System.out.println("Developer");
            }else if (isBasligi.equals("ba")) {
                System.out.println("Business Analyst");
            }else if (isBasligi.equals("pm")) {
                System.out.println("Project Manager");
            }else{
                System.out.println("yanlis giris yaptin..");
            }



        //   System.out.println("Lutfen is unvaninizi girin :" );
        //   Scanner scan= new Scanner(System.in);
        //   String jobTitle=scan.nextLine().toLowerCase();

        //   if (jobTitle.equals("qa")) {
        //       System.out.println("is unvaniniz Quality Analyst");
        //   } else if (jobTitle.equals("dev")) {
        //       System.out.println("is unvaniniz Developer");
        //   } else if (jobTitle.equals("ba")) {
        //       System.out.println("is unvaniniz Business Analyst");
        //   } else if (jobTitle.equals("pm")) {
        //       System.out.println("is unvaniniz Project Manager");
        //   }
        //   // 2.yol
        //   switch (jobTitle) {
        //       case "qa":
        //           System.out.print("is unvaniniz Quality Analyst");
        //           break;
        //       case "dev":
        //           System.out.print("is unvaniniz Quality Developer");
        //           break;
        //       case "ba":
        //           System.out.print("is unvaniniz Business Analyst ");
        //           break;
        //       case "pm":
        //           System.out.print("is unvaniniz Project Manager");
        //           break;
        //       default:
        //           System.out.print("is unvaniniz bir jobtitle giriniz");
        //           break;
        //   }

        //   scan.close();

        }
}

