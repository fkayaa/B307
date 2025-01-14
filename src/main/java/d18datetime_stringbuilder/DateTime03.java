package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {
        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.
        //Example 1: If the date you have received from the user is in the past, give the message “You have entered an invalid date”.
        //If the date you have received from the user is in the future, say “You can enter the time”.

        Scanner input = new Scanner(System.in);
        LocalDate givenDate = null; //LocalDate givenDate; ==> aynı şey

        while (true) {

            System.out.println("Lütfen yılı giriniz");
            int year = input.nextInt();

            System.out.println("Lütfen ayı giriniz");
            int month = input.nextInt();

            if (month < 1 || month > 12) {

                System.out.println("Lütfen ayı 1 den 12 ye kadar giriniz ...");
                continue;
            }
            System.out.println("Lütfen günü giriniz");
            int day = input.nextInt();
            //Ayin kac cektigini bulalim. Yil ve ay icin YearMonth objesi ollusturalim (Gun yok burada)
            YearMonth yearMonth = YearMonth.of(year, month);

            //Ayin maksimum gun sayisini bulalim
            int daysInMonth = yearMonth.lengthOfMonth(); //Ayın gününü sayıyor

            if (day < 1 || day > daysInMonth) {

                System.out.println("Lütfen 1 ile " + daysInMonth + " arasında bir değer giriniz");

                continue;
            }
            givenDate = LocalDate.of(year, month, day);
            if (givenDate.isBefore(LocalDate.now())) {
                System.out.println("Geçersiz , geçmiş bir tarih girdiniz");
            } else {
                System.out.println("Zamanı girebilirsiniz");

                System.out.println(givenDate);
                break; //return yazsak method tan çıkılır,main dısına gider
                //break kullanılsa döngüyü kırar,döngüden çıkar.
            }

        }


    }//main dışı
    /*
    return Kullanımı:
    Avantajı: Döngüden çıkmak için ek bir işleme gerek kalmaz; metot doğrudan sonlanır.
    Dezavantajı: Kodun bu noktadan sonra çalıştırılmasını planlamıyorsanız sorun yok. Ancak ileride başka kod blokları eklenirse, o kodlar çalıştırılmaz.
    Bu kodda, döngü sonlandığında başka bir işlem yapılmayacaksa return kullanımı temiz ve doğru bir çözüm olur.
 */
}
