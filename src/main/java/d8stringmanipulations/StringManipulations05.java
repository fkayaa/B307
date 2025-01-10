package d8stringmanipulations;

public class StringManipulations05 {
    public static void main(String[] args) {
        //Ornek 1: Bir String'in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        //Example 1: Starting from a specific character of a String up to a specific character
        // take all characters as dynamic.

        //1.yol : hard coding - tavsiye edilmez
        String a = "abc@gmail.com";
        System.out.println(a.substring(4,9)); //hard code --adres değiştiği zaman sonuc değişir


    }
}
