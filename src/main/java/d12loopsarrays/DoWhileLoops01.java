package d12loopsarrays;

public class DoWhileLoops01 {
    public static void main(String[] args) {

        //do-while döngüsü, döngü bloğundaki kodun en az bir kere çalışacağından
        // emin olmak istediğiniz zaman kullanılır. Yani döngüdeki kodlar,
        // koşul kontrolü yapılırken bile olsa, en az bir kez çalışacaktır.

        /*
        baslangic degeri
            while (loop calisma kurali) {
                calisacak kodlar
            artirma/azaltma
        }
        */

               /* önce yap sonra düşün
            do {

            calisacak kodlar
            artirma/azaltma

        }while (loop calisma kurali);

        */

        //Ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console'a yazdiriniz.
       //Example 1: Write integers from 5(inclusive) to 3(inclusive) to console

        int i = 5; // başlangıçta 0 da yazsak bir kere çalışır
        do {
            System.out.println(i);
            i--;
        }while (i>2);



        //------------------------------------------------
        //while loop ile do while loop farki nedir?

        //Asagidaki kodu inceleyiniz. Bu kodda WHILE dongusune giremez cunku sart saglanmiyor.
        //while-loop da loop'un en basta kirilmasi mumkundur cunku once kural kontrol edilir sonra islem yapilir

        int k = 1;
        while (k < 1) {
            System.out.println("Ben while loop'um");
            k++;
        } //while döngüsüne girmez ,sart saglanmıyor

        //Asagidaki kodu inceleyiniz. do-while loop’da loop’un en basta kirilmasi mumkun degildir. Once 1 kere calistirilir (tabi sonsuz donguye sokulmazsa) Sonra kural kontrol edilir.

        int m = 1;

        do {

            System.out.println("Ben do-while loop'um");
            m++;

        } while (m < 1); //m>1 olursa sonsuz döngü olusur.break le döngü kırılabilir

    }
}
