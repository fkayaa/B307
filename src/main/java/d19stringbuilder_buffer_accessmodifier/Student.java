package d19stringbuilder_buffer_accessmodifier;

public class Student {

    //Access Modifier
    /* Access Modifier (Erişim Belirleyici)

   1)public
   2)protected
   3)default
   4)private

   public > protected > default > private

   public      ==> public olanlar her class'dan kullanilabilir
   protected   ==> protected olanlar baska package'lardan kullanilamaz,
                ancak baska package'larda child classlar icinden kullanilabilir
   default     ==> default olanlar baska package'lardan kullanilamazlar
   private     ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler

   Soru: "protected ile default" arasindaki farki söyleyiniz?
   Cevap: protected olanlar baska package'lardan kullanilamaz ancak baska package'larda
   child classlar icinden kullanilabilir. default olanlar baska package'lardan kullanilamazlar
*/

    public String stdName = "Ali Can"; //class seviyesinde oldugu için access modifier belirlenir.method içinde değil çünkü

    //method -scope içindekilere local değişken denir.

    protected String address = "Istanbul";

    String email = "alican@gmail.com"; //başına birşey yazmayınca default access modifier oldu

    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", tcKmlk='" + tcKmlk + '\'' +
                '}';
    }

    private  String tcKmlk = "1478236541";








}
