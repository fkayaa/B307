package d28exceptions_enum;

public class E11 {
    public static void main(String[] args) {

        int a = 12;
        int b = 4;
        int[] c = {3 , 5 , 7 , 9};
        bring(c , a , b);





    }//main dışı
    public static void bring(int[] c ,int a ,int b) {

        try {

            int idx = a / b;
            int element = c[idx];
            System.out.println(element);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // | pipe operatoru, multi-catch
            //  - | - pipe operetoru, multi-catch -- catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
            //kardes olanlar icin gecerli parent child iliskisi varsa olmaz.

            System.err.println(e.getMessage());

        } finally {

            System.out.println("Database ile baglantiyi kesiniz");

        }

        System.out.println("finally sonrası app çalısıyor ... ");





    }




}
