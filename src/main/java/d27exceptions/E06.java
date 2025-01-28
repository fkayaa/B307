package d27exceptions;

public class E06 {
    public static void main(String[] args) {
        //5) NullPointerException:(bos isaretcisi) Null degerindeki
        // bir variable referans olarak kullanildiginda olusur

        String s = "java";
        numberOfChar(s);//4

        String t = "";
        numberOfChar(t);//0

        String u = null;
        numberOfChar(u);//NullPointerException



    }//main dışı

    public static void numberOfChar(String s) {

        try {
            int a = s.length();
            System.out.println(a);
        } catch (Exception e) {
            System.err.println("null degerleriyle length() methodunu kullanmayınız");
        }

    }




}
