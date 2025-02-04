package d32lambda;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        //Ornek: Rastgele sayi ureten bir method olusturunuz.
        //Example: Create a method that generates random numbers.

        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random sayı : " + randomSupplier.get());//Random sayı : 0.02701738613144755

        Supplier<String> constantNumber = () -> "42";
        System.out.println(constantNumber.get()); //42







    }
}
