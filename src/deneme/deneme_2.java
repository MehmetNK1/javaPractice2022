package deneme;

import java.util.Arrays;

public class deneme_2 {
    public static void main(String[] args)
    {
        int[] arrNumaram = {3, 45, 8, 2, 9};
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
