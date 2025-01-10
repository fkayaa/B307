package d13array;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*
    1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.

    2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
    bir String dizisi sadece String değerler saklayabilir.

    3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
    Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.

    4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir

    5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.

    6)Array'ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
    (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
*/

        //Array olusturmak :

        String[] stdNames1 = new String[3]; //kaç data old söylemek gerekiyor. 3 data var demek
       // String stdNames2[] = new String[4];  bu da kullanılır lakin 1.genelde kullanılır

        //java nin özel bir yapılanmadır, objectidir array,class sınıfında değiller,collections ta değil

        //System.out.println("stdNames1 = " + stdNames1); //heap belleğinde ki referans değerini ,adresini gösterir. @5f184fc6/ bu şekilde yazdırmıyoruz
        System.out.println(Arrays.toString(stdNames1)); //array ler böyle çagırılır

        //-----------------------------------------------------

        //ornek 1: 5 elemanli notes adinda, int bir array olusturunuz ve console'a yazdiriniz

        int[] notes = new int[5];
        System.out.println(Arrays.toString(notes));//[0, 0, 0, 0, 0]

        //---------------------------
        //ornek 2: 10 elemanli integers adinda, Integer bir array olusturunuz ve console’a yazdiriniz
       //Array’ler de non primitive (reference) veri tipleri de saklanabilir.

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));
        //[null, null, null, null, null, null, null, null, null, null]

        //----------------------------------------------
        //ornek 3: 3 elemanli names adinda, String bir array olusturunuz ve console’a yazdiriniz
        String[] names = new String[3];
        System.out.println(Arrays.toString(names));

        //Array'e eleman eklemek
       //index mantigiyla ekleniyor. 0 ilk index demektir

        names[0] = "Ali Can";
        names[2] = "Veli Han";
        names[1] = "Ayşe Hanım"; //kont 3 ise, 3 eleman olur,index olarak alır

        System.out.println(Arrays.toString(names));


        //Bir veriyi gormek icin
        System.out.println(names[1]);

        names[0] = "Ömer Can";
        System.out.println(names[0]);//üzerine yazar

        //-------------------------------------
        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        // icerdigi karakter sayilari toplamini ekrana yazdirin.
        //Example 1: Create a String array, add 5 elements to it, all elements have
        // display the sum of the number of characters it contains.

        String[] cities = new String[5];
        cities[0] ="Bayburt";
        cities[1] ="Sivas";
        cities[2] ="Denizli";
        cities[3] ="Adana";
        cities[4] ="Ankara";

        //1.yol : for loop
        int totalChar = 0;
        for (int i = 0; i < cities.length ; i++) { //burdaki length farklı --> field

            totalChar += cities[i].length();

        }
        System.out.println("totalChar = " + totalChar); //30

        //2.yol : for each loop
        //for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
        //for loop'taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
        //variable ismi olarak da genel kabul w'nun kullanilmasidir.

       /* for (DataType variable : array/collections) {
             çalışılacak kodlar
        }
        */

        int sum = 0;
        for (String w : cities) {

            sum += w.length();

        }
        System.out.println("for each ten gelen toplam = " + sum);















    }
}
