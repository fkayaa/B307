package d20staticblock_instanceblock_oop;

public class InstanceBlock2Runner {
    public static void main(String[] args) {

        InstanceBlock2 obj1 = new InstanceBlock2();//parametresiz olanı tetikler===>Selamlar parametresiz
        InstanceBlock2 obj2 = new InstanceBlock2(2025); //==>Selamlar parametreli
        //tekrara düşüyordu,ortak instance blockuna aldık ,her ikisinde de artık SELAMLAR gelir.Tekrardan kurtulduk

        System.out.println("Hellooo");





    }
}
