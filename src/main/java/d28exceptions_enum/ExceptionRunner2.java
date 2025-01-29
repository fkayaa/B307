package d28exceptions_enum;

public class ExceptionRunner2 {
    public static void main(String[] args) {

        numberOfStudents(55);


    }//main dışı

    public static void numberOfStudents(int sayi) {

        if (sayi < 0 ) {

            throw new InvalidNumberException("Bir okuldaki ögrenci sayısı negatif olamaz");

        }else {
            System.out.println(sayi);
        }
    }

}
