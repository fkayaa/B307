package d20staticblock_instanceblock_oop;

public class StudentRunner {
    public static void main(String[] args) {

        System.out.println(Student.stdName);//Ali Can ===> static olanlar Class ismi ile çagırılır.

        //non-staticlere ulasmak için objectini -instance ını olusturmak gerekli;
        Student ali = new Student();
        System.out.println(ali.age); //non staticler burdan gelir ===> non-static olanlar variable üzerinden gelir

        Student.staticMethod(); //Ben static bir methodum ...===> static olanlar direkt class.method olarak gelir.

        ali.nonStaticMethod(); //Ben non-static bir methodum ...===> non staticler olusturulan variable uzerinden gelir.




    }
}