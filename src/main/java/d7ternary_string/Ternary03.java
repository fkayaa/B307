package d7ternary_string;

public class Ternary03 {
    public static void main(String[] args) {

        //interview sorusu
        /*Ornek 1:  Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz.
        Example 1: Write the code to check if the given year is a "Leap Year".

        1) Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil */

        //(c) ? (t) : (f); ternary
        //(c) ? ((c) ? (t) : (f)) : ((c) ? (t) : (f)); nested ternary

        int a = 2005;

        String result = ( a % 100 == 0 ) ?
                (( a % 400 == 0 ) ? "Leap Year" : "Leap Year değil") :
                (( a % 4 == 0 ) ? "Leap Year" :"Leap Year Değil");

        System.out.println("result = " + result);

    }
}
