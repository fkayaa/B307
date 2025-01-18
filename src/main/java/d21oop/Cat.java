package d21oop;

import d20staticblock_instanceblock_oop.Mammal;

import d20staticblock_instanceblock_oop.Animal;

public class Cat extends Mammal {

    //Herkes Cat class’ta feedWithMilk() methodunu override etsin?

    public void meow() {

        System.out.println("Cats meow ...");
    }



@Override
    public void feedWithMilk() { //override ettik====> parentından alırız methodu

        System.out.println("Cats feed their babies with milk ...");

    }



}
