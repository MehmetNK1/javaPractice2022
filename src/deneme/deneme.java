package deneme;

public class deneme {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */


        int[][] arr=  {{-9,2,3}, {2,3,1} , {5,-5,5} , {2,1,3}} ;

        int min=arr[0][0];// burada illa 0 demek zorunda degiliz. arr[1][2] de yazabilirsin. illa max ve min arrleri
                          // ayni olma zorunda da degil. Onlari da degistirebilirsin.
                          // asagidaki loop kendi dongusunu tamamlayip break olana kadar kendisini dondurecegi icin
                          // min ve max degerleri elde etmis olacaktir.
        int max=arr[0][0];

        for(int i=0;i<arr.length;i++) //mat[i[
        {
            for(int j=0;j<arr[i].length ; j++)//mat[j]
            {
                if (arr[i][j] < min)
                    min=arr[i][j];
                if(arr[i][j]>max)
                    max=arr[i][j];
            }//inner
        }//outer
        System.out.println("min = " + min);
        System.out.println("max " +  max);


    }

}

