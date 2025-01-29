package d28exceptions_enum;

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
       int plaka = Cities.ANTALYA.getPlateCode();
        System.out.println(plaka);//7


    }
}
