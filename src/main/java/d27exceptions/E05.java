package d27exceptions;

public class E05 {
    public static void main(String[] args) {
        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        int b = 0;
        String s = "My Java";
        getCharFromString2(s,a,b);

    }//main dışı

    public static void getCharFromString(String s ,int a,int b) {

        try {

            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);

        }catch (ArithmeticException e){

            System.out.println("Sıfıra bölme yapılamaz " + e.getMessage());

        }catch(StringIndexOutOfBoundsException e){

            System.out.println("index " + (s.length()-1) + " den büyük olamaz." + e.getCause());//getCause() kök nedeni
        }

    }

    //2.yol: Tum exception turlerini tek bir catch'te yakalamak icin "Exception" adli parent kullanilir
    public static void getCharFromString2(String s,int a,int b){

        try {

            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);

        } catch (Exception e){//exceptions parentıdır ,hepsini tutar
            System.out.println("Bir istisna oluştu : " + e.getClass()); //getClass() exceptionın türünü getirir
        }

    }
}
