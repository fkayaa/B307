package d21oop;

import d20staticblock_instanceblock_oop.Mammal;

public class AnimalRunner {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark(); //Dogs bark ...
        d.eat();//Animals eat ... ==> parenttan geldi =====> override yaptık ===> Dogs eat ...
        d.drink();//Animals drink ... ==> parenttan geldi

        Bird b = new Bird();
        b.tweet();//Birds tweet ...
        b.eat();//Animals eat ... ==> parenttan geldi
        b.drink();//Animals drink ... ==> parenttan geldi

        Cat c = new Cat();
        c.meow();//Cats meow ...
        c.eat();//Animals eat ... ==> parenttan geldi
        c.drink();//Animals drink ... ==> parenttan geldi
        c.feedWithMilk();//override ettik ===> Cats feed their babies with milk ...

        Mammal m = new Mammal();
        m.feedWithMilk();//Mammals feed their babies with milk ...
        m.eat();//Animals eat ... ==> parenttan geldi
        m.drink();//Animals drink ... ==> parenttan geldi


    }
}
