package practice_basic_day05;

public class Constructor_ThisKeyword {
    /*
     * Write program as a Book class that will have 2 Constructors. While creating
     * an object make sure: Instance variables are being initialized Both
     * Constructors are being executed

	 1) Constructor'lar main method'un disinda, class'in icinde olusturulur
	 2) Constructor'ın ismi class ismi ile aynı olmalıdır.
	 3) Yöntem ile Yapıcı Farkı:
	 * a) Yöntem adı sınıfı isminden farklı olabilir.
	      fakat Constructor ismi class ismi ile aynı olmalıdır.
	   b) Method'larda dönüş türü olmak zorundadır ama
	     Constructor'larda dönüş türü olmaz. Constructor'a dönüş
	     yazı eklerseniz artik o yapıcı değil method'dur.
	 4) Bir class'da birden fazla yapıcı olabilir. Ama kurucu'lar farkli olmalidir.
	    yani; farkli kurucu uretmek için aşırı yükleme kurallarını kullanmaliyiz.
	    Parametresiz bir kurucu ile nesne üretirsek nesnelerin değerleri örneği veya statik
        olarak olusturulan değişken'lerin ilk değerlerine esit olur. Eger biz nesnelerinin değerleri
        istersek tum değişken'ler için değiştirmektirmek ataması yapmam gerekir
        Object uretirken değerleri de kendimiz istersek yapıcı kullanmamız
        gerekir. Parametreli yapıcı olusturmak objeye bizim verdigimiz argüman'leri atamak
        için yeterli değil. Argümanları objeye atayabilmek için müteahhit bünye'si icede
        this.instanceVarIsmi = parametreIsmi; seklinde değer ataması yapmam gerekir.
        NOT : bu ile değer ataması yapilmayan yetiştirme için hic bir islem yapılmaz



     * 2 Constructor'a sahip olacak bir Book class olarak program yazın. oluştururken
     * bir nesne şunlardan emin olun: Örnek değişkenler başlatılıyor Her ikisi de
     * Yapıcılar yürütülüyor
     */

}
