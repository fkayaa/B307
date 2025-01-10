package d11loops;

public class ForLoops01 {
    public static void main(String[] args) {
        //ornek 1: 6'dan 10'a kadar tum int’lerin toplamini console’a yazdiriniz.
        //example 1: Write the sum of all int’s from 6 to 10 to the console
        //6+7+8+9+10=40 ==> 40

        int sum = 0;

        for (int i = 6; i < 11 ; i++) {
            sum = sum + i;
        }

        System.out.println("sum = " + sum); //yandan seçip debug dediğimizde alt tarafta aşama aşama görürüz

    }
}
