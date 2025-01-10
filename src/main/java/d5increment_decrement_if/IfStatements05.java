package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements05 {
    public static void main(String[] args) {
        /*Ornek 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.

        0-4 (dahil) ==> bebek
        5-12 (dahil)==> cocuk
        13-20 (dahil) ==> genc
        21-30 (dahil) ==> yetiskin
        30 ustu ==> Tanimlanmamis*/

        /*Example 1: Create the code that takes the age value from the user and prints the stage of age according to the following table.

        0-4 (inclusive) ==> baby
        5-12 (inclusive)==>child
        13-20 (inclusive) ==> young
        21-30 (inclusive) ==> adult
        Over 30 ==> Undefined*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz.");
        int age = scanner.nextInt();


        if (age<0){
            System.out.println("yaş 0 dan küçük olamaz");
        } else if (age<5) {
            System.out.println("Bebek");
        }else if (age<13) {
            System.out.println("Çocuk");
        }else if (age<21) {
            System.out.println("Genç");
        }else if (age<31) {
            System.out.println("Yetişkin");
        }else {
            System.out.println("Tanımlanmamış yaş");
        }


    }
}
