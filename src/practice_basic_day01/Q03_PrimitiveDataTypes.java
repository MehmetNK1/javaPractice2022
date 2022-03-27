package practice_basic_day01;

public class Q03_PrimitiveDataTypes {
    public static void main(String[] args) {
        /*
         * Primitive data type
                byte: only takes whole numbers / sadece tam sayıları alır
	 	        short: only takes whole numbers /sadece tam sayıları alır
	 	        int(used more often): only takes whole numbers / ustekilere gore daha sik kullanilir
	 	        * sadece tam sayıları alır /
	 	        long: only takes whole numbers /sadece tam sayıları alır

	 	        float: can take decimals (MUST have F or f at the end) /
	 	        * ondalık sayılar alabilir (sonunda F veya f olması ZORUNLUDUR)
	 	        double( used more often): can take decimals /
	 	        * (daha sık kullanılır): ondalık sayılar alabilir / ustekine gore daha sik kullanilir

	 	        boolean: true or false boolean expressions / doğru veya yanlış boole ifadeleri
	 	        char: character within single quote '' / tek tırnak ile kullanilir '' ayrıca sayı alır
	 	        	 	also takes number
         * Range: double > float >long > int >short > byte
         */

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        byte byteMax = Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);

        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);

        short shortMax = Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);

        short shortMin = Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);

        int intMin = Integer.MIN_VALUE;
        System.out.println("intMin = " + intMin);

        int intMax = Integer.MAX_VALUE;
        System.out.println("intMax = " + intMax);

        long longMin = Long.MIN_VALUE;
        System.out.println("longMin = " + longMin);

        //long, double, float veri tiplerinin max ve min degerlerini yazdiralim.


        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float  laptopFiyat = 9999.99F;
        double kilometre =579.6;
        char cinsiyet = 'E';
        boolean dogruMu =true;

    //   System.out.println(laptopFiyat);
    //   System.out.println("laptopFiyat = " + laptopFiyat); //soutv yazinca bu sekilde cikiyor
    //   System.out.println(kilometre);
    //   System.out.println(cinsiyet);
    //   System.out.println(dogruMu);
        /*
        coklu yorum satiri
         */

        System.out.println(laptopFiyat +"," + kilometre + "," + cinsiyet + "," + dogruMu);

    }

}
