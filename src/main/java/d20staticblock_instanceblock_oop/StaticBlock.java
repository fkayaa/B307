package d20staticblock_instanceblock_oop;

import java.time.LocalDate;

public class StaticBlock {

            /*"static" blok, bir class'in yüklenmesi sırasında otomatik olarak çalışan ve class'in başlatılmasını
        veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.
         Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
         Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
         bir şekilde hazır olmasını sağlar.*/


        //Bir variable olusturup deger atamazsaniz o variable'i initialize etmediniz demektir
    //static double pi;

    //Senaryo: Subat ayinda fiyatlarda indirim olacak. Class cagirildiginda otomatik price'i alacak
    //ve class'in heryerinde bu degeri kullanacak.
    //Scenario: There will be a discount on prices in February. The class will get the price automatically when called
    // and will use this value everywhere in the class

    static int price;

    static  { //static blocklar yukarıdan asagıya çalısır.
        System.out.println("static blok 2");
        LocalDate currentDate = LocalDate.now();
       if (currentDate.getMonthValue() == 2) {
           price = 1000;
           System.out.println(price);
       }else {
            price = 2000;
           System.out.println(price);
       }

    }


    static double pi;

    static { //block
        pi = 3.14;
        System.out.println("Static blok 1"); //geçiş üstünlüğü vardır,ister yukarıda ister asagıda olsun,önce static blocklar çalısır.
    }



    public static void main(String[] args) {


        System.out.println(pi);
        System.out.println("main method içi");

/*
    static { //block
        pi = 3.14;
        System.out.println("Static blok 1"); //geçiş üstünlüğü vardır,ister yukarıda ister asagıda olsun,önce static blocklar çalısır.
    }  ==> burda olsa da önce static blocklar çalısır.
 */


    }
}
