package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); //rastgele sayılar üretmek için kullanılır
                                    //0 ile 100 arasında rastgele sayı üretiyoruz.
        int rastgeleSayi = random.nextInt(101); //101 yazdıgımızda 0-101 arası sayı üretir

        //ÖDEV : 20 dahil 100 dahil arasında random sayı isteseydik ?

        //Kullanıcının kaç kere tahmin yaptığını takip etmek için bir sayac olusturalım ;
        int denemeSayisi=0;

        //Kullanıcının yaptığı tahmini saklamak için bir değişken olusturyoruz
         int tahminEdilen;

         //Tahmin için bir değişken olusturalım
        boolean tahminDogrumu = false;

        System.out.println("0 ile 100 arasında bir sayıyı tahmin etmeye çalışın");

        do {
           //kullanıcıdan tahmini alalım
            System.out.println("Tahmininizi yapınız");
           tahminEdilen = scanner.nextInt();

           //sayacı arttıralım
            denemeSayisi++;

            //tahmini kontrol edelim
            if (tahminEdilen<rastgeleSayi) {
                System.out.println("Sayı daha büyük");
            } else if (tahminEdilen>rastgeleSayi) {
                System.out.println("Sayı daha küçüktür");
            }else {
                System.out.println("Tebrikler , doğru bidiniz");
                System.out.println("Deneme Sayisi = " + denemeSayisi);
                tahminDogrumu = true;
            }
        }while (!tahminDogrumu);




    }
}
