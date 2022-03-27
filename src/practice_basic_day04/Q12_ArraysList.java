package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArraysList {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Olusturmak istediginiz listin uzunlugunu girin :");
        int listUzunluk = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("girdiginiz list uzunlugu kadar eleman ekleyiniz .. ");

        for (int i = 0; i < listUzunluk; i++){
            list.add(scan.nextInt());
        }
        tekrarliEleman(list);
    }
    private static void tekrarliEleman(List<Integer> list) {
        List<Integer>tekrarlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){ // ilk listem
            for (int j = i+1; j < list.size(); j++){
                if (list.get(i) == list.get(j) && ! tekrarlist.contains(list.get(i))){
                    tekrarlist.add(list.get(i));
                }
            }
        }
        System.out.println("tekrarli listenin elemanlari : " + tekrarlist);

        /*
         Scanner scanner = new Scanner(System.in);
        int uzunluk = 5;// kullanıcı 5 girdi varsayalm

        List<Integer> arr = new ArrayList<>(); //kullanıcıdan alınanların TÜMÜNÜ atacağımız list

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array'in " + (i + 1) + ". elemanını giriniz: ");
            int eleman = scanner.nextInt();
            arr.add(eleman);
        }
        System.out.println(arr);

        Collections.sort(arr);// kullanıcıdan alınan tüm rakamların küçükten büyüğe sıralanması

        List<Integer> repeatedArr = new ArrayList<>();
        // kullanıcıdan alınan rakamların TEKRARLAYANLARINI atacağımız list

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {

                if (arr.get(i).equals(arr.get(j)) && i != j && !repeatedArr.contains(arr.get(i))) {
                    repeatedArr.add(arr.get(i));
         */
    }
}
