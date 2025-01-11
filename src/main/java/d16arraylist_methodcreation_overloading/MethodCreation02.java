package d16arraylist_methodcreation_overloading;

public class MethodCreation02 {
    public static void main(String[] args) {

//-----------  1.Method Call --------------
        int result = multiply(8,9);
        System.out.println(result);

//---------- 2.Method Call ----------------
        int result2 = firstTwoMultiplyThirdAdd(9,5,2);
        System.out.println(result2);

//---------- 3.Method Call ----------------
        print("Ali Can"); //print methodu void oldugundan birşey döndürmüyor, içinde sout oldugu için direkt içine yazdıgımızı yazdırdı.



    }//main dışı

    //ornek 1: Iki sayiyi carpan bir method olusturunuz.
    //example 1: Create a method that multiplies two numbers

    //1.method
    protected static int multiply(int a , int b) {

        return a * b;
    }

    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz.
    //example 2: Create a method that multiplies the first two of the given 3 numbers and adds the result with the third number.

    //2.method
    private static int firstTwoMultiplyThirdAdd(int a , int b ,int c) {

        return  a * b + c;
    }

    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)
   //example 3: Create a method that prints an entered word to the console

    //3.method
    public static void print(String str) {

        System.out.println(str);

    }






}
