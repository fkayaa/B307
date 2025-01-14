package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;  //time-paket, format-alt paket, DateTimeFormatter-class
import java.util.Set;

public class DateTime06 {
    public static void main(String[] args) {
        /*LocalTime Class'ta kullanilan tarih saat formatlari

        HH : mm ==> 24'lu saat sistemi
        hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
        hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
        HH : mm : ss ==> saniyeyi gosterir
    !!  HH : MM ==> yanlis format cunku MM aylar icin kullanilir
        "mm" "minute" demektir. "MM" "month" demektir.

        dd-MM-yyyy ==> gun - ay - yil
        MMM ==> Aug
       MMMM ==> August
        tarihte aralarda / da koyabiliriz,illaki tire olmasına gerek yok
        */

        //-------------
        //ornek 1:"DateTimeFormatter", bir Class'tir ve tarih ve saat verilerini belirli bir
        // biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.

        //DateTimeFormatter, tarih ve saat nesnelerini "metin" yani String olarak biçimlendirmenize ve
        // metni tarih ve saat nesnelerine çözmenize olanak tanır.
        //ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini
        // biçimlendirmek için kullanılır.
        //format() method'u LocalTime'i String'e istedigimiz formatta cevirir

        LocalTime myCurrentTime = LocalTime.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss ");
        String formattedTime = dtf1.format(myCurrentTime); //bu kalıba göre myCurrentTime ı formatla dedik
        System.out.println(formattedTime);


        //Ornek 2: Tarih’i formatlayalim
        LocalDate myCurrentDate = LocalDate.now();//zamanı aldık
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");//istenilen format ayarlandı

        String formattedDate = dtf2.format(myCurrentDate);//zamanı o formata ayarladık
        System.out.println(formattedDate);//yazdırdık

        //ornek 3: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //ZoneId class'i, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
        // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

//https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html ===> ZoneId bilgileri bu linkte var.

        //Tokyo'da ayın kaçı ?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo); //2025-01-15

        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);//2025-01-14

        //Tokyo'da saat kaç ?

        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//05:11:39.915318500

        LocalTime timeInAmsterdam = LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);//21:11:39.915318500

        //bu bilgiler localden geliyor --> javadan

        //Tum zone'lara bakalim
      /*  Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        for (String w : zoneIds) {
            System.out.println(w);
        }
        System.out.println("Toplam zaman dilimi sayısı : " + zoneIds.size()); ==> 603 zaman dilimi çıktısı verdi*/


        //---------------
        //ornek 4: Tarih ve zamani ayni anda kullanalim.
        //LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); //2025-01-14T23:19:27.135276200

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy -- HH:mm:ss ");
        String formattedDateTime = dtf3.format(ldt);
        System.out.println(formattedDateTime); // 14/Ocak/2025 -- 23:23:04





    }
}
