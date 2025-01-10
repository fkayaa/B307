package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
        /*Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz
          1==> Pazar, 2 ==> Pazartesi …*

        //*Example 1: When you receive the number of days from the user, write the code that writes the day name
          1==> Sunday, 2 ==> Monday …*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı gün sayısını giriniz.");

        int num = scanner.nextInt();

        if (num <= 0) { //num<1 de olur
            System.out.println("Gün sayıları 0 veya negatif olamaz.");
        } else if (num==1) {
            System.out.println("Pazartesi");
        }else if (num==2) {
            System.out.println("Salı");
        }else if (num==3) {
            System.out.println("Çarşamba");
        }else if (num==4) {
            System.out.println("Perşembe");
        }else if (num==5) {
            System.out.println("Cuma");
        }else if (num==6) {
            System.out.println("Cumartesi");
        }else if (num==7) {
            System.out.println("Pazar");
        }else {
            System.out.println("Gün sayısı 7'den büyük olamaz.");
        }


    }
}
