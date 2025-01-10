package d8stringmanipulations;


import static java.lang.Double.valueOf;

public class StringManipulations04 {
    public static void main(String[] args) {
        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98
        //Example 1: Find the total price of the following products.
        //String tv = “$456.99”; String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98

        //valueOf() : Belirtilen String’i Double’a cevirir

        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$","");
        laptop=laptop.replace("$","");

       /* double tv1 = valueOf(tv);
        double laptop1 = valueOf(laptop);

        System.out.println(tv1+laptop1);
*/

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println("totalPrice = " + totalPrice +"$");


        //-------------------------

        //Ornek 2: Kullanici isminin ilk harflerini alip buyuk hale getirerek console'a yazdiriniz.
        //"   ali cAN   " ==> AC
        //Example 2: Take the first letters of the username, capitalize them and write them to the console.

        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String’i istediginiz karakterden parcalamaya yarar.
        //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna “method chain (zincir)” denir
        //\\s+ ifadesi, bir veya daha fazla ardışık boşluk karakterini ifade eder.

        String str = "   alI  cAN   ";
        char first=str.trim().toUpperCase().charAt(0);
        System.out.println("first = " + first); //A

        char last = str.trim().toUpperCase().split("\\s+ ")[1].charAt(0);
        System.out.println("last = " + last);//C

        System.out.println("" + first + last); //başına string eklediğimizde A ve C vermek zorunda kaldı,yoksa ascii değerlerini topluyordu.











    }
}
