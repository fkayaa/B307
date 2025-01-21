package d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {
       // Engine e = new Engine(); HATA!!! , interfacelerden object üretilemez,çünkü onlarda abstract

        AudiA4 a4 = new AudiA4();
        a4.abs();
        a4.turbo(); //Audi A4 turbo motor kullanir
        a4.esp(); //Audi A4 esp fren sistemi kullanir

        AudiS5 s5 = new AudiS5();
        s5.abs(); //Audi S5 abs fren sistemi kullanir

        //Engine.price = 5000; ==> final olan variable a yeni atama yapılamaz

        System.out.println(Engine.fiyat);
        System.out.println(AC.fiyat);
        System.out.println(Brake.fiyat);

       Engine.speed(); // çünkü interface üzerinden static


        a4.power();//static ollmadıgı için object üzerinden çagırdık







    }
}
