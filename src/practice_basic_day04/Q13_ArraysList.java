package practice_basic_day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q13_ArraysList {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        Scanner scanner = new Scanner(System.in);
        int[] input = {1,2,3,4,5,6,7,8};
        System.out.println("Kaç adet max değeri bilmek istiyorsunuz ? ");
        int n = scanner.nextInt();
        Arrays.sort(input);
        System.out.print("Array'in "+n+" adet max rakamları : ");
        for (int i =input.length-1; i>(input.length-1-n) ; i--) {
            //sort'tan sonra arrayin en büyük "n" elemanını veren loop

            System.out.print(input[i] + " ");
        }
        /*
        int arr[] = {2, 5, 3, 9, 8, 12, 6, 77, 44, 11};
        int n = 5;

        List<Integer> list = new ArrayList<>(); // bir list olusturun

        for (int each : arr) {  // list'e tüm elemanlarini ekleyiniz
            list.add(each);
        }
       //  System.out.println(list); // [2, 5, 3, 9, 8, 12, 6, 77, 4, 11]


        List<Integer> newList = new ArrayList<>();
        int say = 1;
        while (say <= n) {

            int max = list.get(0); // max = listin ilk elemani

            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }

            newList.add(max);
            list.remove(list.indexOf(max)); // ayni buyuk sayi olmamasi icin bulunan en buyuk sayi ilk listten silinir
            say++;
        }
        System.out.println("Arrayin ilk " + n + " maksimum degerleri " + newList);

         */
    }

}
