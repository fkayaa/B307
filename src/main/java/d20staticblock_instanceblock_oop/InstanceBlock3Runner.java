package d20staticblock_instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {

        InstanceBlock3 car1 = new InstanceBlock3();
     /*
     Araba rengi : Siyah
Araba yakıt türü :  benzin         ===> parametre olmayınca siyah ve benzin gelir.

      */

        //ancak renk ve yakıt türü constructorlarla özellestirilebilir
        InstanceBlock3 car2 = new InstanceBlock3("beyaz" , "dizel");
        System.out.println("Araba rengi : "+car2.color );
        System.out.println("Arabanın yakıt türü : " + car2.fuelType);
        /*
        Araba rengi : beyaz
Arabanın yakıt türü : dizel
         */





    }
}
