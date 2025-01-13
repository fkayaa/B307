package d17varargs_passbyvalue_constructors_date;

public class Varargs {
    public static void main(String[] args) {

        //Variable arguments - Değişken sayida argümanlar

        /* Varargs, bir methodun değişken sayıda argüman almasına izin veren bir özelliktir.
        Varargs, "variable arguments" yani "değişken sayıda argüman"ın kısaltmasıdır.

        Varargs, aşağıdaki kurallara tabidir:

        1- Birden fazla varargs kullanilamaz. Varargs parametre, her zaman son parametre olmalıdır.
        Yoksa veri tabani surekli veri kabul eder ve diger parametreye gecemez.
        2- Varargs arka planda Array yapisini kullanir
        3- Varargs parametre, bir primitive veri tipi veya non-primitive(referans) olabilir.
        4- Varargs parametre, aynı türdeki birden fazla argüman alabilir.
        5- Varargs parametre, sıfır argüman alabilir. main ici add(); olabilir*/


//1. method call
   int result =  add(3,4,8);
        System.out.println(result); //15


    }//main dışı

   /*

    public static int add1(int a, int b) {
        return a + b;
    }
    public static int add2(int a, int b, int c) {
        return a + b + c;
    }
    */

    //1.method varargs :
    public static int add(int ... a) { //... varargs bu //3 nokta koydugumuz da Java varargs kabul eder

        int sum = 0;

        for (int w : a) {
            sum += w;
        }
            return sum;
    }

















}
