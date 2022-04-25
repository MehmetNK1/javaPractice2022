package interviewQuestions8;

import java.util.ArrayList;

public class Q02_2D_CollectionsTask {
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList

    // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    // Bu 3 ArrayList'i 2D ArrayList'te saklayın
    public static void main(String[] args) {

        ArrayList<ArrayList<String>>listeler=new ArrayList<>();
        ArrayList<String>calisanlar = new ArrayList<>();
        calisanlar.add("ahmet");
        calisanlar.add("ali");
        calisanlar.add("emrah");
        calisanlar.add("elif");

        System.out.println("calisanlar : "+calisanlar);

        ArrayList<String>isverenler=new ArrayList<>();
        isverenler.add("haluk");
        isverenler.add("eylul");
        isverenler.add("can");
        isverenler.add("mehmet");

        System.out.println("isverenelr : "+isverenler);
        ArrayList<String>sirketler =new ArrayList<>();
        sirketler.add("amazon");
        sirketler.add("google");
        sirketler.add("ibm");
        System.out.println("sirketler : "+sirketler);

        listeler.add(calisanlar);
        listeler.add(isverenler);
        listeler.add(sirketler);
        System.out.println(listeler);
        //[[ahmet, ali, emrah, elif], [haluk, eylul, can, mehmet], [amazon, google, ibm]]
    }
}