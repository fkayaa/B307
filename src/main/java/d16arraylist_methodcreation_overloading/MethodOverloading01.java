package d16arraylist_methodcreation_overloading;

public class MethodOverloading01 {

    public static void main(String[] args) {
    /*
        Polymorphism:
        Method Overloading (static polymorphism) + Method Overriding(dynamic polymorphism)

        OOP'nin (Object Oriented Programming-Nesne yönelimli programlama) prensiplerinin biridir.
        Polymorphism (cok bicimlilik) demektir.
        Bir method'u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde calistirabilmek icin kullanilir.
*/

        /* i.Method Overloading : Java'da Method Overloading (Metot Aşırı Yükleme), aynı class içerisinde
        aynı isme sahip ancak farklı parametre listelerine sahip birden fazla metodun tanımlanması işlemidir.*/


        //String s = "Java";
        //s.substring(int beginIndex); ==> tek parametre aliyor
        //s.substring(int beginIndex, int endIndex); ==> iki parametre aliyor

        add(3,8);




    }//main dışı

    //ornek 1 : Toplama islemi yapan bir method olusturun ve sonra da overload edin.
   //example 1 : A method that performs an addition operation create and then overload

    public static void add(int a , int b) {

        System.out.println(a + b);

    }
    //overload 1--> ismi değişmeden imzası değişiyor.
    public static void add(double a , double b ) {

        System.out.println(a + b);

    }
    //overload 2
    public static void add(double a , int b ) {

        System.out.println(a + b);

    }
    //overload 3
    public static void add(int a , double b ) {

        System.out.println(a + b);

    }
    //overload - 4
    public static void add(int a , int b, int c) {

        System.out.println(a + b + c);

    }



}
