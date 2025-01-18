package d21oop;

public class Car extends Vehicle{
    //parent


    public String model = "Accord";
    public  int year = 2024;


    //Constructor olusturalım
    public Car() {
        this("Sport");
        System.out.println("Sedan");//4. bu

    }
    public Car(String tip) {

        super();//bu çagrı vehicle a
        System.out.println(tip); //3. bu
    }
}
