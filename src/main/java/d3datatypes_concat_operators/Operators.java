package d3datatypes_concat_operators;

public class Operators {
    public static void main(String[] args) {

        /*
+,-,*,/ islemleri Java'da matematikte kullanildigi gibi kullanilir
Not 1: Java'da bir tamsayiyi baska bir tamsayiya bolerseniz sonuc her zaman tamsayi olur
Not 2: Eger sonuc tamsayi degilse Java sonucun ondalik kismini silerek onu int'e donusturur.
Not 3: Bir matematiksel islemde farkli data tiplerini kullanirsaniz sonuc her zaman buyuk data tipinde olur.
 */

        int amountOfMoney1 = 25;
        int numberOfNumber1 = 10;
        System.out.println(amountOfMoney1/numberOfNumber1);//2 cikti, 2.5 cikmaliydi, Java .5'i sildi



    }
}
