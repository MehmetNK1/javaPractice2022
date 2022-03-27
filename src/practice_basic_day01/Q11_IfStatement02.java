package practice_basic_day01;

import java.util.Scanner;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz : ");
        int not = scan.nextInt();

        if( not >= 90 && not <= 100) { // 90, 91 ..... 99
            System.out.println("You  made A, Great job");
        }

        else if( not <90 && not >= 80) { // 80, 81, 82...89
            System.out.println("You made B, Good");
        }

        else if(not < 80 && not >= 70 ) {  // 70, 71 ,... 79
            System.out.println("You made C, That's Okay");
        }

        else if ( not <70 && not >=60) {  // 60, 61 ,.. 69
            System.out.println("You made D, Really?");
        }
        else {
            System.out.println("You made F, Study more");
        }
    }

}
