package d12loopsarrays;

public class WhileLoops01 {
    public static void main(String[] args) {
        /* for (baslangic degeri; loop calisma kurali; artirma/azaltma){
            calisacak kodlar
        }*/

        /*
        baslangic degeri
        while (loop calisma kurali) {
            calisacak kodlar
            artirma/azaltma
        }
        */

        //Ornek 1: 3'den 6'ya kadar tamsayilari console’a yazdiriniz (3 ve 6 dahil).
       //Example 1: Write integers from 3 to 6 to console (including 3 and 6)

        //1.yol: for loop
        for (int i = 3; i < 7; i++) {
            System.out.println(i);
        }

        //2.yol: while loop
        int i =3;
        while (i<7) {

            i++; // arttırma azaltmayı buraya alırsak i yi günceller ,öyle okur
            System.out.println("i = " + i);
            //i++; buraya yazdırırsak i yi oldugu gibi okutur,sonra arttırır
        }

        //Ornek 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz(12 dahil).
       //Example 2: Write the even integers from 23 to 12 to the console (including 12)


        int sum = 0;

        int f= 23;
        while (f>11) {

            if (f%2 == 0){

                System.out.println(f);
               // sum = sum + f;
            }
            f--;

        }








    }
}
