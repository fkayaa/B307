package d18datetime_stringbuilder;

import d19stringbuilder_buffer_accessmodifier.Student;

public class AnotherPackageClass {
    public static void main(String[] args) {

        Student veli = new Student();
        System.out.println(veli.stdName);//Ali Can
       //protected ,default olanlara ulaşamayız.
        //çünkü başka package tayız.
        //private da zaten gözükmez

        //toString ekledik şimdi

        System.out.println(veli);

//Student{stdName='Ali Can', address='Istanbul', email='alican@gmail.com', tcKmlk='1478236541'}

        //Not:
// objeleri direk yazmamiza olanak veren toString methodunu degiskenleri olusturdugumuz student classinda olusturduk
// ilk olusturdugumuzda bütün veriler secili oldugu icin Student classtan olusturulan bir objeyle bütün verileri yazdirabiliriz
// bu veri güvenligi acisindan olumsuz bir durum olusturmaktadir.



    }
}
