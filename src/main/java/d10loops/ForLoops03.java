package d10loops;

public class ForLoops03 {
    public static void main(String[] args) {
        //interview sorusu
        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz.
        //example 1: Print the sum of the digits of a given integer to the console

        //578 ==> 5+7+8=20 ==> Output 20 olmali

        int sum = 0;


        for (int i = 578; i>0; i/=10) {

            sum = sum + i%10;

        }
        System.out.println("578 sayısının rakamları toplamı : " +sum);


        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz.
        //Example 2: Write the code that returns the non-repeating characters in a String.
        // Yusuf ==> Ysf

        String t = "Yusuf";
        String uniqe = "";

        for (int i = 0; i <t.length() ; i++) {

            char ch = t.charAt(i); //index verdik ,harf verecek

            if (t.indexOf(ch) == t.lastIndexOf(ch)) { //eşitse tekrarsızdır

              uniqe = uniqe + ch;
            }

        }
        System.out.println(uniqe);




    }
}
