package d21oop;

public class Honda extends Car {
    //child


    public String model = "Civic";
    public  int year = 2023;

    //Constructor olusturalım
    public Honda() {
   // super();//her zaman cons ta en üstte olur,görünür yaptık super çagrıyı
        System.out.println("super.model = " + super.model);//accord yazar,cünkü super cagrısı parenta yapılıyor
        System.out.println("this.year = " + this.year);//kendi classından alır ==> this.year = 2023

        System.out.println("Civic");//5.bu

    }

    public Honda(String model) {
        super();//bu cagrı car a ==>params varsa parametreliye,yoksa yoka
        System.out.println(model);
    }
}
