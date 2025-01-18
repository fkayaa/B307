package d21oop;

public class Dog extends Mammal {

    public void bark() {
        System.out.println("Dogs bark...");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat...");
    }

    @Override
    public Animal create() {
        return new Dog(); //Upcasting
    }

    @Override
    public int add (int a, int b) {
        return a + b;
    }

    @Override
    public Integer multiply (Integer a, Integer b) {
        return a * b;
    }

}