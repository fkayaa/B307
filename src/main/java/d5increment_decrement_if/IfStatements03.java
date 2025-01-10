package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //if - else if - else
        //Kalibini ogrenelim

        /*        if () {

        } else if () {

        } else if () {

        } else {

        }*/

        //Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz.
        //Example 1: Write the code that checks whether a number received from the user is positive, negative or neutral


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int num = scanner.nextInt();

        if (num > 0) {

            System.out.println(num + " sıfırdan büyüktür.");

        } else if (num==0) {

            System.out.println(num + " Sayısı36 nötr dür");

        } else {

            System.out.println(num + " sıfırdan küçüktür.");

        }


    }
}
