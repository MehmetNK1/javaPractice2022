package practice_basic_day04;

import java.util.Arrays;

public class Q10_Arrays {
    public static void main(String[] args) {
     /*
      *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      */


        String cumle = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        cumle = cumle.replaceAll(" ", "");
        System.out.println(cumle);
        String arr[] = cumle.split("");
        System.out.println(Arrays.toString(arr));
        int sayac=0;
        for (int i = 0; i < arr.length; i++){
            sayac++;
        }
        System.out.println(sayac);
    }
}
