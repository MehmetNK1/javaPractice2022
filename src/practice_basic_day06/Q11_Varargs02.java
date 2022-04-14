package practice_basic_day06;

public class Q11_Varargs02 {
    public static void main(String[] args) {
        // Create a multiply method with double varargs (return double)

    /*
    private static int carpim = 1;


        double carpan1 = 1;
        double carpan2 = 2;
        double carpan3 = 3;
        double carpan4 = 4;
        double carpan5 = 5;
        double carpan6 = 6;

        carpma(carpan1, carpan2, carpan3, carpan4, carpan5, carpan6);
        System.out.println("Carpim sonucu = " + carpim);
    }

    private static void carpma(double...carpan) {
        for (double each:carpan) {
            carpim*=each;
        }
    }

     */
        System.out.println(carpma(1.2, 2.3, 3.4, 4.5, 5.6));

    }

    public static double carpma(double... numbers) {
        int carpim = 1;
        for (int i = 0; i < numbers.length; i++)
            carpim *= numbers[i];

        return carpim;
    }


}