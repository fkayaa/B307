package d11loops;

public class ForLoops02 {
    public static void main(String[] args) {
        
        //ornek 2: 10'dan 7'e kadar tum int’lerin carpimini console’a yazdiriniz.
        //example 2: Write the product of all int’s from 10 to 7 to the console
        //10x9x8x7 ==> 5040
        
        int multiply = 1;

        for (int i = 10; i >6 ; i--) {
            
            multiply = multiply * i;
        }

        System.out.println("10*9*8*7*6 = " + multiply);
        
    }
}

//debugla ara değerlere bakmak --- ödev
