package d22oop;

public class ChildClass extends ParentClass{
    @Override
    public int multiply(Integer a ,Integer b) {

        //Parent class'in carpma methodunu cagiralim
       Integer sonuc =  super.multiply(a , b);


        //Ek islevsellik katalim. Sonuca 10 ekleyerek genisletelim
       return sonuc + 10;

    }
}
