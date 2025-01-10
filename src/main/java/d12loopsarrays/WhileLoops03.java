package d12loopsarrays;

public class WhileLoops03 {
    public static void main(String[] args) {

        //Interview sorusu

        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //Example 1: Write the code to check if a given integer is a palindrome.
        //Palindrome: 121 <==> 121        123321 <==> 123321

        int k = 2112;
        String original = String.valueOf(k); //" ... " oldu

        String reversed = "";

        int index = original.length()-1;
        while (index >= 0) {

            reversed += original.charAt(index);
            index--;
        }
        System.out.println("Sayının tersi = " + reversed);

        if (original.equals(reversed)) {
            System.out.println(original + " Palindrome bir sayıdır.");

        }else {System.out.println(original + " Palindrome bir sayı değildir.");}



    }
}
