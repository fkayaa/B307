package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {
        //charAt() methoduna index verince size karakteri getirir.
        //break keyword'u, bir döngüyü veya bir switch ifadesini erken bir şekilde sonlandırmak için kullanılır.


        /*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
==> "Tramvay"==> "Tr"*/
        /*Example 1: Write all characters before the first letter 'a' in a given String to the console*/


        String s = "Tramvay";

        for (int i = 0; i <s.length() ; i++) {

            char ch = s.charAt(i);

            if (ch == 'a') {

                break; //a'yı görünce döngüyü kırar

            }
            System.out.print(ch);

        }
        System.out.println(" ");
        System.out.println("----------------------------");

        //---------------------------------------------
        //Ornek 2: Verilen bir String'de kucuk harfleri console'a yazdirmayan kodu yaziniz.
        //"Pwd12?Ab" ==> P12?A

        //Example 2: Write the code that does not print lowercase letters in a given String to the console


        //--1.yol :
        String str = "Pwd12?Ab";

        for (int i = 0; i < str.length(); i++) {

            //97 ile 122 arası küçük harfler

            char ch = str.charAt(i);

            if (!(ch >= 'a' && ch <='z')) {

                System.out.print(ch);


            }


        }

        System.out.println(" ");
        System.out.println("----------------------------");


        //--2.yol :

        for (int i = 0; i < str.length(); i++) {

            //97 ile 122 arası küçük harfler

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <='z') {

                continue; //işlem yapma ,döngüye devam et.artırma/azaltmaya git

            }else {
                System.out.print(ch);
            }

        }

        System.out.println(" ");
        System.out.println("----------------------------");


        //---3.yol
        for (int i = 0; i < str.length(); i++) {

            //97 ile 122 arası küçük harfler

            char ch = str.charAt(i);

            if (ch >= 97 && ch <=122) {

                continue; //işlem yapma ,döngüye devam et.artırma/azaltmaya git

            }else {
                System.out.print(ch);
            }
        }
        System.out.println(" ");
        System.out.println("----------------------------");


        //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz.
        //example 3: Write the code that reverses a given String

        //String t = "Ali Can";  ==> "naC ilA"
        //Loop olustururken baslangic ve bitis degeri cok onemlidir

        //son index her zaman length()-1’tir

        System.out.println(" ");
        System.out.println("----------------------------");

        String t = "Ali Can";
        //--1.yol: Sistemi gereksiz yorar
        for (int i = t.length()-1; i>=0 ; i--) {

            System.out.print(t.charAt(i)); //loop içinde sout her defasında çalışmasına neden olur
        }


        System.out.println("  ");
        System.out.println("----------------------------");


        //--2.yol : Tercih edilen yol

        String reverse =""; //ters çevirince reverse içinde saklarız

        for (int i = t.length()-1; i>=0 ; i--) {

            reverse = reverse + t.charAt(i);

            //reverse = reverse + t.substring(i, i + 1); --tartısın

        }
        System.out.println(reverse);

    }
}
