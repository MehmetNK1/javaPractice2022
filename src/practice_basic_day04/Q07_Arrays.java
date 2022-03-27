package practice_basic_day04;

import java.util.Arrays;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int[][] data = {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        //int max =0;değeri atarım. ve arrayin bütün elemanlarıyla tek tek karşılaştırırım.
        //karşılaştırdığım eleman max=0'dan büyükse, artık max'ımı yeniden karşılaştırdığım
        //değere atayarak güncellerim.peki neden value yaptık. ben en büyük değeri bulmak için
        // int max olarak atadığım değere,arraydeki değerlerin hepsinden küçük bir değer vermem
        // gerekiyorki işim kolaylaşsın.ve ben diyorum ki bu max değerine öyle küçük bir değer
        // atayayım ki işim garanti olsun. Integer değişkeninin belirli sınırları vardı.
        // o sınırın en küçük değerini max değerine ata (int max = Integer.MIN_VALUE  eksi
        // bilmem kaç yüzbine denk geliyor)

        for(int i = 0; i < data.length; i++) {
            Arrays.sort(data[i]);   // array siralma yapildi

            if(data[i][0] < minimum) minimum = data[i][0];
            if(data[i][data[i].length - 1] > maximum)
                maximum = data[i][data[i].length - 1];
        }//if(dışardaki listenin, i. elemanında bulununan listenin,  sonundaki eleman > maximum) ise
        // benim yeni marksimum değerim=dışarıdaki listenin, i. i. elemanında bulununan listenin,
        // sonundaki eleman'dır diyor

        System.out.println("Minimum = " + minimum);
        System.out.println("Maximum = " + maximum);

    }
}

//  int[][] arr = {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
//  for (int i = 0; i<4; i++)
//      for (int j =0; i<3; j++)
//  System.out.println(arr[i][j] + "");

// int [][] arr= {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
// for (int i = 0; i <4;i++){
//     for (int j = 0; j <3;j++){
//         System.out.print(arr[i][j] + " ");
//     } System.out.println("Maximum = " + maximum);
// }
// max ve min uzunlugundan -1 alinarak "< ve >" esitliyip min bulunur