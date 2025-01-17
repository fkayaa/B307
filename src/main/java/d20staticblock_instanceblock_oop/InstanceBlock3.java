package d20staticblock_instanceblock_oop;

public class InstanceBlock3 {

    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.

    //Example 3: In a car factory, each car is black in colour and the fuel type is petrol.

    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color;

    public String fuelType;

    //instance block - Bu class'tan her object olusturuldugunda calisir
    {

        color = "Siyah"; //her otomobil varsayılan olarak siyah renkte başlar
        fuelType = "benzin"; //her otomobil varsayılan yakıt türü olarak benzin olarak ayarlanır

    }

    public InstanceBlock3() {
        System.out.println("Araba rengi : " + color);
        System.out.println("Araba yakıt türü :  " + fuelType);
    }

    public InstanceBlock3(String color ,String fuelType) {
        this.color = color; //constructor tarafından saglanan renkte örnegi baslat
        this.fuelType = fuelType;//constructor tarafından saglanan yakıt türü örnegi baslat
    }
}
