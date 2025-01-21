package d23oop_collections;

public class AudiS5 implements Engine,AC,Brake{


    public void analog() {
        System.out.println("Audi S5 analog klima kullanir");
    }


    public void digital() {
        System.out.println("Audi S5 digital klima kullanir");
    }


    public void abs() {
        System.out.println("Audi S5 abs fren sistemi kullanir");
    }


    public void esp() {
        System.out.println("Audi S5 esp fren sistemi kullanir");
    }


    public void eco() {
        System.out.println("Audi S5 ekonomik motor kullanır.");
    }


    public void turbo() {
        System.out.println("Audi S5 turbo motor kullanır");
    }


    public void gas() {
        System.out.println("Audi S5 benzinli motor kullanir");
    }

    @Override
    public void run() {
        System.out.println("Audi S5 lazer farı calıstırır.");
    }
}
