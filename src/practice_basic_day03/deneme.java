package practice_basic_day03;

import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("harf giriniz : ");
        String harf;
        harf = scan.nextLine();
        for (int i = 0; i < harf.length(); i++) {
            char ch = harf.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'ü'
                    || ch == 'ö' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U' || ch == 'Ü' || ch == 'Ö') {
                System.out.println("sesli harfdir ");
                //break;
            } else {
                System.out.println("sessiz harfdir ");
                break;
            }
        }
    }
}
