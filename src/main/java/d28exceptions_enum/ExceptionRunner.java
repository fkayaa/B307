package d28exceptions_enum;

public class ExceptionRunner {
    public static void main(String[] args) {

        studentGrade(-45);

    }

    public static void studentGrade(int not) {

        if (not < 0 || not > 100) {

            try {
                throw new InvalidStudentGradeException("Öğrenci notu 0' dan küçük ya da büyük olamaz");
            } catch (InvalidStudentGradeException e) {
               e.printStackTrace();
            }

        } else {
            System.out.println(not);
        }

    }
}
