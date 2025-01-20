package d22oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.name);//Ali Can

        //getter
        System.out.println(s.getAge());//13 ---> getter ile private olan age i getirebildik
        System.out.println(s.isSuccessful());//----> getter sayesinde ===> true

        //setter
        s.setAge(14);//===> yası yapılandırdık--güncelledik
        System.out.println(s.getAge());//14

        s.setSuccessful(false);
        System.out.println(s.isSuccessful());//false

        //set ile yapılandır , get ile getir ...

    }
}
