package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.
       //Example 1: Create the code that prints whether a number received from the user is odd or even.

        //1.yol
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");

        int num = scanner.nextInt();

        if (num%2 == 0){

            System.out.println("Sayı çift sayıdır");

        }
        if (num%2 != 0){ //if (num%2 == 1) da olur

            System.out.println("Sayı tek sayıdır");
        }
        //---------------
        //2.yol : if - else
        if (num%2 == 0){

            System.out.println("Çift Sayı");

        }else {

            System.out.println("Tek Sayı");
        }



    }
}
