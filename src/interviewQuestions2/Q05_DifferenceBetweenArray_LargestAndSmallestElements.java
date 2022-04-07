package interviewQuestions2;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_DifferenceBetweenArray_LargestAndSmallestElements {
    /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("arr. uzunlugu gir : ");
        int uznluk = scan.nextInt();
        int arr [] = new int[uznluk];
        for (int i = 0; i < uznluk; i++){
            System.out.println(" arryin "+ (i+1)+ "elamani :");
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("son eleman- ilk eleman "+(arr[uznluk-1]-arr[0]));

    }
}
