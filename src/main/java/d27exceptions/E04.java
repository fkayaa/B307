package d27exceptions;

import java.lang.reflect.Array;

public class E04 {
    public static void main(String[] args) {

        //4) ArrayIndexOutOfBoundsException: Bir dizi elemanına erişilmeye çalışıldığında,
        //dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.


        String[] arr = {"j","a","v","a"};
        getElement(arr ,1);//a
        getElement(arr,5);//ArrayIndexOutOfBoundsException




    }//main dışı

    public static void getElement(String[] s , int idx) {

        try {
            String el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("index numarası "+ (s.length-1) +" den büyük olamaz.");

        }

    }




}
