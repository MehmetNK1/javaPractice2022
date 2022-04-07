package deneme;

import java.util.Arrays;
import java.util.Scanner;

public class denem_3 {

    public static void main(String[] args) {
        arrayolustur();
    }

    private static void arrayolustur() {
        Scanner scan = new Scanner(System.in);
        System.out.print("array uzunlugu giriniz :");
        int uzunluk = scan.nextInt();
        int arr[] =new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("arrayin "+ (i+1) + ".elemanini giriniz :");
            arr[i]= scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("arr[son eleman]-arr[ilk eleman] : " + (arr[uzunluk-1] - arr[0]));
    }

    //public static void main(String[] args)
    {
        int[] arrNumaram = {5, 7, 8, 24, 9};
        System.out.println("Original array: "+ Arrays.toString(arrNumaram));
        int max = arrNumaram[0]; // buyuk olacak arr. once sifir index ile baslatma
        int min = arrNumaram[0]; // kucuk olacak arr. once sifir index ile baslatma
        for(int i = 1; i < arrNumaram.length; i++)
        { // islem ; sart(arr. uzunlugu "i" dongusunden buyuk olma); artirma
            if(arrNumaram[i] > max)// her seferinde "i" yi artirarak sart kontrolu
                max = arrNumaram[i];// yukarida sart dogru ise atama yap
            else if(arrNumaram[i] < min)// sart kontrolu
                min = arrNumaram[i];// atama
        }
        System.out.println("En buyuk - En kucuk: "+(max-min));
    }
}
