package d23oop_collections;

public class AudiA4 implements Engine , AC , Brake{

    /*
a) interface'leri parent yapmak icin 'implements' keyword'u child icinde kullanilir

b) extends kullanilmaz cunku bu iki class arasinda kullanilir

c) AudiA4 Class'i, Engine interface'i icindeki tum methodlari override etmek zorundadir.

d) AudiA4 Class'i, Engine interface'i icindeki tum methodlari override etmek zorunda
oldugundan method'larin bas kismina 'override' yazmak gerekmez ama tavsiye edilir.

e) Class icinde access modifier yazilmazsa default kabul edildiginden, mecbur public yazariz
*/
//interface classlardan implements ettiklerimizin methodunu kullanmak zorundayız
    //override yazmak zorunda değiliz



    //Brake interface'inden override edilenler
    public void abs() {
        System.out.println("Audi A4 abs fren sistemi kullanir");
    }

    public void esp() {
        System.out.println("Audi A4 esp fren sistemi kullanir");
    }


    //Engine interface inden override edilenler :
    @Override
    public void eco() {
        System.out.println("Audi A4 ekonomik motor kullanır.");
    }

    //override yazmak zorunda değiliz
    public void turbo() {
        System.out.println("Audi A4 turbo motor kullanır");
    }

    @Override
    public void gas() {
        System.out.println("Audi A4 benzinli motor kullanir");
    }



    //AC interface’inden override edilenler
    @Override
    public void analog() {
        System.out.println("Audi A4 analog klima kullanir");
    }

    @Override
    public void digital() {
        System.out.println("Audi A4 digital klima kullanir");
    }

    @Override
    public void run() {
        System.out.println("Audi A4 hava yastıgı calıstırır.");
    }
}
