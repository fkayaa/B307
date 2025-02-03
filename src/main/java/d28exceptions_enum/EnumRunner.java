package d28exceptions_enum;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        //Cities c = new Cities(); HATA, enum'dan object olusturulmaz

        //1- Enum daki bir sabite nasil ulasabiliriz?
        Cities il = Cities.AKSARAY;
        System.out.println(il);

        //2- BURSA sabitinin ismine ulasalim
      String ilIsmi =  Cities.BURSA.getCityName();
        System.out.println(ilIsmi);

        //3- Ankara'nin posta koduna ulasalim
        String postal = Cities.ANKARA.getPostalCode();
        System.out.println(postal);//06000

        //4- Antalya'nin plaka koduna ulasalim

        int plateCode = Cities.ANTALYA.getPlateCode();
        System.out.println(plateCode); // 7


//4- Trabzon'un plaka koduna ulasalim
        System.out.println(Cities.TRABZON.getPlateCode()); //61


//5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin

//values() methodu enum icindeki tum datalari bir Array icinde bize verir
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen plaka kodunu giriniz");
        int plaka = input.nextInt();
        Cities[] sehirler =  Cities.values();
        System.out.println(Arrays.toString(sehirler)); // bütün şehirleri aldık

        if (plaka < 1 || plaka > 81) {
            System.out.println("Lutfen 1 ile 81 arasi bir plaka kodu giriniz");
        } else {
            for (Cities w:sehirler)

                if (plaka == w.getPlateCode()){
                    System.out.println(" Girmiş olduğunuz plaka  " +   w.getCityName()   + " iline aittir   ");
                    break;
                }
            {

            }

        }



    }
}