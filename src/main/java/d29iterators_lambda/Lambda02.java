package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 10, 10));
        //printSquareOfOddElements(nums);
        printCubeOfDistinctOddElements(nums);

    } //main disi

    //ornek 1: Bir tamsayı listesi alan ve listedeki tek sayıların karelerini,
    // aynı satırda, aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
    //example 1: Create a method that takes a list of integers and prints the squares of
    // the odd numbers in the list on the same line with a space between them.(Functional)

    //map(): Elemanları dönüştürmek için kullanılır.
    // baslatmak için stream()
    // kosulları sağlamak için   filter()
    // değiştirmek istediğimizde map()
    // yazdırmak için  forEach()

    public static void printSquareOfOddElements(List<Integer> nums) {

        //nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " ")); //9 25 121
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> (int) Math.pow(t, 2)).
                forEach(t -> System.out.print(t + " ")); //9 25 121

        /** Java doc
         * @param
         * @return
         * @throws bu metot
         * @author serkan*/

    }

    //2) Bir tamsayı listesindeki tek sayıların küplerini, tekrarlanmadan, aynı satırda,
    // aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
    //2) Create a method that prints the cubes of odd numbers in a list of integers,
    // without repeating, on the same line, with spaces between them. (Functional)

    //distinct() metodu, bir akistaki tekrar eden ogeleri kaldirmak icin kullanilir

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {

        //2, 3, 3, 5, 10, 10
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t-> System.out.print(t + " ")); //27 125

    }

    //3)Bir listedeki tekrarlanmayan çift sayıların karelerinin toplamını hesaplayan bir method oluşturunuz.
    //3)Create a method that calculates the sum of squares of non-repeating even numbers in a list.

    //reduce()azaltmak: Koleksiyon elemanlarını tek bir değere indirger.




}