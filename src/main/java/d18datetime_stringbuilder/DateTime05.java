package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.Period;

public class DateTime05 {
    public static void main(String[] args) {
        //Java'da Period class'i, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.

    //Kullanım Alanları
    //Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
    // veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
    // ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

    //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
    // Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period objesi olarak döndürür.

        LocalDate date1 = LocalDate.of(2025,1,14);
        LocalDate date2 = LocalDate.of(1987,12,23);

        Period difference = Period.between(date2,date1);
        System.out.println(difference); //P37Y22D ==> 37 Yıl 22 Gün :)


        int yearD = difference.getYears();
        int monthD = difference.getMonths();
        int dayD = difference.getDays();

        System.out.println(date1 + " ve " + date2 + " arasındaki fark : ");
        System.out.println(yearD + " yıl");
        System.out.println(monthD + " ay");
        System.out.println(dayD + " gün yaşadınız :)");



        //https://www.oracle.com/technical-resources/articles/java/jf14-date-time.html
        //Duration











    }
}
