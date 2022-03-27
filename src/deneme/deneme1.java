package deneme;

import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int diziBoyut;            // degisken olustu
        System.out.print("Dizinin boyutunu giriniz : ");
        diziBoyut = sc.nextInt();       // boyutu kullanicidan aldi
        int [] sayilar = new int[diziBoyut]; //
        for (int i=0; i<sayilar.length; i++){ // baska metoda gonderme ihtimaline karsi. cunku atama yaptik
            System.out.print((i+1) + " . sayiyi giriniz : "); //13,14,16. satirlarda sayi alinir dongu baslar
                        //"i" yi bir artirma islemi , indexi bir artirark yazdir anlaminda donguye mudahale etmez
            sayilar[i]= sc.nextInt(); // dongunun dewami kac defa girilirse aktarma yapar
        }        // "i" 14. strda for da donguye dewam eder. cunku biz ne kadar girersek
        for (int i=0; i<sayilar.length; i++){ // yazdirma baslar
            System.out.println(sayilar[i] + " ");

        }
    }
}
