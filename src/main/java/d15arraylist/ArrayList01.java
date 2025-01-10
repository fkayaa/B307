package d15arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        /*ArrayList, dinamik boyutlu bir array'dir; eleman ekleyip çıkarırken boyutu otomatik olarak ayarlanır.
         Gerçek hayatta bir alışveriş listesi gibi düşünülebilir.
         Alışveriş listesi, ürün isimlerini içerir ve bu isimler String türündedir.*/

        /*
        1)Array'ler primitive data type'lari ve reference'lari depolayabilir ama Arraylist'ler
        non-primitive'leri (reference'lari) depolar
        2)ArrayListler memory'de Array'lerden daha fazla yer kaplar
        3)Array'ler olusturulurken bastan eleman sayisini belirtmek zorundayiz
        4)ArrayList'ler eleman sayisinda esnektirler.
        5) Array'leri Java niye iptal etmedi?
            a) Array'ler cok daha hizlidir
            b) Array'ler memory'de cok az yer kaplarlar
            c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Array'ler tercih edilir

        6) Java'da generic (kapsamli) türler (<> ile belirtilen türler) için yalnızca referans
        veri türleri kullanılabilir. Primitive veri türleri (örneğin int, char, boolean, double, vb.)
         doğrudan generic türlerin içine yerleştirilemez. Bu nedenle, özel bir durumla karşılaştığınızda,
         bu türleri ilgili sınıflarla sarmalamanız (wrapper) gerekir.
*/
        //ArrayList nasil olusturulur?

       // ArrayList<Integer> ages = new ArrayList<Integer>(); //java 6 ve öncesi
        ArrayList<Integer> ages = new ArrayList<>(); //java 7 ve sonrası ,type inference--tip çıkarımı

        //ArrayList’lere eleman nasil eklenir?

        //add() metodu, ArrayList’e yeni bir eleman eklemek için kullanılır ve
        //eklenen elemanı listenin sonuna yerleştirir.

        ages.add(9);
        ages.add(12);
        ages.add(5);
        System.out.println(ages); //arrayListler dogrudan yazdırılır


        //List’te araya eleman eklemek icin index numarasini yazariz

        //add(int index, E element): Bu metot, belirtilen elemanı ArrayList’in belirtilen konumuna ekler.
       //Mevcut elemanlar sağa kaydırılır
        ages.add(1,28);
        ages.add(3,7);
        ages.add(11);
        System.out.println(ages);//[9, 28, 12, 7, 5, 11]
        //------------------------------------------------------------------------
        //Ornek 1: Verilen Integer List'i, ages List'inin icine koyunuz.
       //Example 1: Put the given Integer List into the ages List

        //addAll() metodu, bir koleksiyondaki tüm öğeleri mevcut ArrayList'e eklemek için kullanılır.
       //Bu metod, genellikle bir ArrayList'i başka bir koleksiyonun öğeleriyle genişletmek istediğinizde kullanışlıdır.

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(1);
        newAges.add(2);
        newAges.add(3);

        ages.addAll(newAges); //sağdaki soldakine eklenir.
        System.out.println(ages); //[9, 28, 12, 7, 5, 11, 1, 2, 3]

        ages.addAll(0,newAges);
        System.out.println(ages); //[1, 2, 3, 9, 28, 12, 7, 5, 11, 1, 2, 3]

        //size() metodu, ArrayList'teki öğelerin sayısını döndürür. (int return eder)
        int totalElement = ages.size();
        System.out.println(totalElement); //12

        //get(int index) metodu, ArrayList'te belirli bir konumdaki ogeye erismek icin kullanilir.
        int element = ages.get(3); //3.indexte olanı getir
        System.out.println(element); //9

        //set(int index, E element) metodu, ArrayList'te belirtilen indeksteki öğeyi verilen yeni öğeyle değiştirir.
       //Bu metot, listedeki bir öğeyi güncellemek için kullanılır. Metot, eski öğeyi döndürür.
        Integer a = ages.set(1,25);
        System.out.println(a);//2, değiştirecegi sayıyı döndürür.
        System.out.println(ages);//güncellenir -->[1, 25, 3, 9, 28, 12, 7, 5, 11, 1, 2, 3]





    }
}
