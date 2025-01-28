package d27exceptions;

public class E03 {
    public static void main(String[] args) {
        //3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
        //geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s = "Java";
        selectChar(s , 4);//StringIndexOutOfBoundsException



    }//main dışı

    public static void selectChar(String s ,int idx) {

        try {
            char ch =  s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("olmayan index kullanmayınız : " + e.getMessage());
            //olmayan index kullanmayınız : Index 4 out of bounds for length 4 --> kırmızı yazdı
            e.printStackTrace(); //kod yazan hatayı görmek isterse kullanır. exception ı gösterir ama fırlatmaz.
        }
        System.out.println("App çalısıyor");

    }


}
