package interviewQuestions7;

public class Q06_PrintArray {
    // Create a method which takes String array as a parameter
    // and prints all the element

    // Dize dizisini parametre olarak alan bir yöntem oluşturun
    // ve tüm elemanı yazdırır

    public static void main(String[] args) {
        String [] arabalar = {"Honda", "Toyota", "Porsche", "Tesla", "BMW"};
        printElements(arabalar);

        String [] renkler = {"Mavi", "Kirmizi", "Mor", "Kahverengi", "Sari","Turuncu", "Yesil"};
        printElements(renkler);

    }

    private static void printElements(String[] arr) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " " ); //Honda Toyota Porsche Tesla BMW
        }
        System.out.println();
    }
}
