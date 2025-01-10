package d7ternary_string;

public class Ternary02 {
    public static void main(String[] args) {
        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.
        //Example : Write the code to check if the given number has 3 digits

        int a = -190;
            a = Math.abs(a); //mutlak deger methodudur
        String result = (a>99 && a<1000) ? "sayı 3 basamaklıdır " : "Sayı 3 basamaklı değildir";
        System.out.println("result = " + result);

        //(a>99 && a<1000) || (a<-99 && a>-1000) condition böyle de olur


    }
}
