package d23oop_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

        /*Collections (koleksiyonlar), Object'leri depolamak ve işlemek için kullanılan
    bir class'lar ve interface'ler kümesidir.

    —Collections, çeşitli Object (nesne) işleme yöntemlerini de destekler:
            Ekleme: Bir nesneyi bir koleksiyona eklemek için kullanılır.
            Silme: Bir nesneyi bir koleksiyondan silmek için kullanılır.
            Arama: Bir koleksiyonda bir nesneyi bulmak için kullanılır.
            Döngüleme: Bir koleksiyonun tüm nesnelerini işlemek için kullanılır.

    —Collections, Java programcılarının aşağıdakileri yapmasına olanak tanır:
            Verileri verimli bir şekilde depolamak
            Verileri hızlı bir şekilde işlemek(verileri aramak, sıralamak, filtrelemek)
        Verileri güvenli bir şekilde depolamak*/


        /*Java da Array'ler neden eksik kaldi da Collection'lar gelistirildi?

        Java'da array'ler eksik kaldı çünkü:

        Boyutları statiktir: Bu, array'lerin dinamik olarak büyüyemediği veya küçülemediği anlamına gelir.
        İç içe geçmiş array'ler karmaşıktır: Bu, array'lerin birbirleriyle ilişkili olduğu durumlarda karmaşık ve hata yapmaya müsaittir.
        Array'ler genel olarak verimli değildir: Bu, ekleme, silme ve arama gibi işlemler için genellikle daha yavaştır.

        Collections, bu dezavantajları çözmek için tasarlanmıştır.*/
   //----------------------------------


        /*LinkedList: Bağlı bir listedir.

        LinkedList'ler de, bir dizi index'e sahiptir. Ancak, bu index'ler,
        LinkedList'in içinde bulunan node'ların konumunu temsil eder.

        ArrayList'lerde, bir elemana erişmek için, o elemanın index'ine doğrudan erişilebilir.
        Ancak, LinkedList'lerde, bir elemana erişmek için, o elemanın bulunduğu node'a erişmek gerekir.
        Bu, LinkedList'lerde bir elemana erişmenin daha yavaş olmasına neden olabilir.

        1) Her eleman, bir önceki ve bir sonraki elemanı işaret eden (pointer) bağlantılara sahiptir.
        Bu nedenle, ekleme ve silme işlemleri hızlıdır, ancak elemanlara erişim, başka bir elemandan
        başlayarak ilerlemeyi gerektirir. Yani ArrayList'e gore erisim yavastir.
        ArrayList'lerde get(index) ile hizli erisiriz. Ama LinkedList'ler en bastan istenen eleman mi diye
        tek tek bakar.

        2) Başka bir elemanın başından veya sonundan eleman eklemek veya silmek, hızlı bir şekilde yapılabilir.

        3) Bağlantılar ve düğümler (node) nedeniyle LinkedList, genellikle daha fazla bellek kullanır.*/

        /*Sonuc:
            LinkedList'in bu hızlı ekleme ve silme işlemleri, bazı senaryolarda tercih edilmesine neden olurken,
            veriye doğrudan erişim gerektiren durumlarda ArrayList daha uygundur.

            Bu nedenle, hangi liste türünün kullanılacağı, uygulamanın gereksinimlerine ve
            yapılacak işlemlerin türüne bağlıdır.*/

        //O(1) zaman karmasikligi nedir?

        ArrayList<String> list1 = new  ArrayList<>();
        List<String> list2 = new ArrayList<>(); //bu ifade tür esnekliği sağlıyor.

        //List<String> list3 = new List<String>();  ===> Constructor tarafına interface yazılamaz.


        LinkedList<String> myList = new LinkedList<>();

//1-add() : listeye bir eleman ekler

        myList.add("Ali");
        myList.add("Veli");
        myList.add("Ayse");
        myList.add("Fatma");

        System.out.println(myList); //[Ali, Veli, Ayse, Fatma]

        //Java'da LinkedList'e eleman eklemek için genellikle add metodu kullanılır.
      // Bu, standart ve en yaygın yöntemdir. Ancak, LinkedList'e eleman eklemek için daha "kısa yollar" bulunmaktadır.

        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Eleman1","Eleman2","Eleman3"));
        System.out.println(linkedList);//[Eleman1, Eleman2, Eleman3]

        //dogrudan yazdırmak için constructor içinde ; Arrays.asList() içine yazılır

        LinkedList<String> linkedList2 = new LinkedList<>(List.of("Eleman1","Eleman2","Eleman3"));
        System.out.println(linkedList2);//[Eleman1, Eleman2, Eleman3]






















    }
}
