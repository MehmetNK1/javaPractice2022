package practice_basic_day02;

public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {

        char finalNotu = 'B';

        // String result ="";

        String result = (finalNotu == 'A') ? "Gayet Basarili" : // " A " ise "?" (ise demek) basarili yaz
                        (finalNotu == 'B') ? "Basarili" : // " : " degilse demek
                        (finalNotu == 'C') ? "Ha gayret" : "Digerleri..";
                                                            // degilse deyip sonucu " ; " isareti belirler

        System.out.println("result = " + result);


    }
}
