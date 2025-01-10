package d9string_loops;

public class Var01 {
    public static void main(String[] args) {
        /*var Kullanımı: Java 10 ile tanıtılmış bir özelliktir ve local variable type inference
        (yerel değişken türü çıkarımı) olarak adlandırılır. Bu, değişkenin türünü açıkça
        belirtmeden tanımlayabilmenizi sağlar ve derleyici, atanan değerden değişkenin
        türünü otomatik olarak çıkarır.

        var, sadece yerel değişkenler için kullanılabilir (metot içinde).
        Tür, atanan değerden otomatik olarak belirlenir.
        Derleyici zamanı özelliğidir; yani, var kullanımı sadece kodun okunabilirliğini artırır ve
        çalışma zamanında hiçbir fark oluşturmaz.*/


        int age = 14;
        String s = "Ali Can";

        var i = 12; //int i = 12; gibi kabul eder
        var m = "Ali"; // String m = "Ali";


        /*
        var ile ilgili kurallar:

        1- Türü Derleyici Belirler:
        var kullandığınızda, değişkenin türü atanan değerden çıkarılır.
        2- Değişkenin Türü Değiştirilemez:
        Bir kez tür çıkarıldıktan sonra, değişkenin türü sabittir ve değiştirilemez. */


        var x = 10;
        //x = "Hello"; Bir kez tür çıkarıldıktan sonra, değişkenin türü sabittir ve değiştirilemez


        //3- null Ataması Yapılamaz:
        //Tür çıkarımı için bir değere ihtiyaç duyulur; null ataması tür çıkarımı yapamayacağı için hata verir.

        //var y = null; --> HATA  cunku tur belirlenemiyor

        //4- Yalnızca Yerel Değişkenler İçin Kullanılabilir:
        //var, yalnızca bir metot veya blok içinde tanımlanan yerel değişkenler için kullanılabilir.
        //Class seviyesindeki değişkenlerde kullanılamaz. Ayrıca deger ataması olmadan kullanılamaz.

        //var z; --> HATA ,deger ataması olmadan kullanılmaz
         var z = ""; //string belirttiği için kabul ediyor

         /*

        var Kullanmanın Avantajları :
        1-Daha Temiz Kod:
        Türü açıkça belirtmek zorunda kalmadan, daha az kod yazmanızı sağlar.
        2- Türü Karmaşık nesnelerde Kullanışlıdır (map'lerde mesela)

        var Kullanmanın Sınırlamaları :
        1- Okunabilirlik Sorunları:
        Tür çıkarımı bazen kodun okunabilirliğini zorlaştırabilir, özellikle değişkenin türünü tahmin etmek zor olduğunda.
        2-Açıkça Tür Belirtimi Gereken Durumlar:
        Karmaşık mantıkta, var yerine açık tür belirtimi daha iyi olabilir.*/

    }
}
