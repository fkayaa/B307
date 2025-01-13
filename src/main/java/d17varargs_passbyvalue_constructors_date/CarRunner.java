package d17varargs_passbyvalue_constructors_date;

public class CarRunner {
    public static void main(String[] args) {

        //4- Car class’indan bir object uretelim


        //9- Default Car() icine parametre girelim
         Car c1 = new Car("BMV" ,"3.20",2023,false);
        System.out.println(c1.brand);//Honda--->BMV
        System.out.println(c1.model);//Accord--->3.20
        System.out.println(c1.hybrid);//true--->false
        System.out.println(c1.year);//2025--->2023
        c1.action();//---> method //Honda hızlı hareket eder--->BMV hızlı hareket eder
        c1.stop();//Honda Güvenli bir şekilde durur.--->BMV Güvenli bir şekilde durur.


        //5- Car class'a donup, constructor olusturalim

        //10- Baska bir object uretelim ve direkt objeyi yazdiralim
        Car c2 = new Car("Volvo","XC60",2025,true);
        System.out.println(c1);//ref. adresi verir bunlar --> toString olusturduktan sonra ==> Car{brand='BMV', model='3.20', year=2023, hybrid=false}
        System.out.println(c2);//ref. adresi verir bunlar --> toString olusturduktan sonra ==> Car{brand='Volvo', model='XC60', year=2025, hybrid=true}

        //11- Reference durumunu duzeltmek icin Car class’a toString methodu ekleyelim
        //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.


        //16- Yeni bir object uretelim
        Car c3 = new Car("Tofaş","Şahin");
        System.out.println(c3);
    }
}
