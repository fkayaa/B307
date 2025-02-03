package d30lambda;

import java.util.*;

public class Lambda02 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10, 14));
        //printSquareOfOddElements(nums);
        //printCubeOfDistinctOddElements(nums);
        //printSumOfSquaresOfDistinctEvenElements(nums);
        //printProductOfSquareOfDistinctEvenElements(nums);
        //maksimum1(nums);
        //maksimum2(nums);
        //maksimum3(nums);
        //maksimum4(nums);
        //minimum1(nums);
        //minimum2(nums);
        //minimum3(nums);
        //minimum4(nums);
        //minimum5(nums);
        getMinGreaterThanSevenEven(nums);

    } //main disi

    //----------------------------
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

    //----------------------------
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
                forEach(t -> System.out.print(t + " ")); //27 125

    }

    //----------------------------
    //3)Bir listedeki tekrarlanmayan çift sayıların karelerinin toplamını hesaplayan bir method oluşturunuz.
    //3)Create a method that calculates the sum of squares of non-repeating even numbers in a list.
    //3 + 5 = 8

    //reduce()-azaltmak: Koleksiyon elemanlarını tek bir değere indirger.

    //reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
    //t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
    //u: Ilk elemandir
    //(t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir.

    //İlk iterasyonda:
    //t=0 (başlangıç değeri olarak belirtildiği için)
    //u=4 (ilk eleman)
    //t+u = 4

    //İkinci iterasyonda:
    //t=4 (önceki adımdan gelen sonuç)
    //u=100 (ikinci eleman)
    //t+u = 104

    /*4- Java’da method reference, lambda ifadelerine bir alternatif olarak sunulan bir özelliktir.
    Method reference, zaten tanımlanmış bir metodu doğrudan bir fonksiyonel arayüze atamak için kullanılır.
    Bu, bazen bir lambda ifadesinden daha okunabilir bir kod yazmamıza olanak tanır.*/

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {

/*        int toplam = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);*/

        int toplam = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, Integer::sum);

        System.out.println(toplam); //104

    }

    //----------------------------
    //5) Bir listedeki tüm tekrarlanmayan çift sayıların karelerinin çarpımını hesaplayan
    // bir method oluşturunuz.
    //5) Create a method that calculates the product of the squares of all
    // non-repeating even numbers in a list.

    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums) {
        //2, 3, 4, 5, 11, 13
        int carp = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(1, (t, u) -> t * u);
        System.out.println(carp); //64

    }

    //----------------------------
    //6)Verilen List'teki maksimum değeri bulmak için bir method oluşturun.
    //6)Create a method to find the maximum value in the given List

    //1.yol:
    //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)

    public static void maksimum1(List<Integer> nums) {

        int max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max); //11

    }

    //2.yol:
    //Integer.MIN_VALUE yerine nums.get(0) ile ilk index'teki elmani yani 2'yi alip t'ye yukledik.

    public static void maksimum2(List<Integer> nums) {

        int max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max); //11

    }

    //3.yol:
    //sorted(): Koleksiyonu belirli bir kritere göre sıralar.(naturel order. kucukten buyuge)
    //reduce’un tek parametreli kullaniminda bir Optional doner.
    // Bu, sonucun var olabileceği veya olmayabileceği anlamına gelir.
    //Bu nedenle sonucu almak için get() metodu kullanılır.

    public static void maksimum3(List<Integer> nums) {

        //1,4,3,7 ==> 1,3,4,7

        int max = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println(max); //11

    }

    //4.yol: Best Practice
    //Java'da :: işareti, "Method Reference" olarak adlandırılır.
    // Bir metodun doğrudan referansını alarak lambda ifadeleri yazmadan kullanmanızı sağlar.

    public static void maksimum4(List<Integer> nums) {

        int max = nums.
                stream().
                distinct().
                reduce(Math::max).
                get();
        System.out.println(max); //11

    }

    //----------------------------
    //7)Verilen List'teki minimum değeri bulmak için bir method oluşturun.
    //7)Create a method to find the minimum value in the given List

    //1.yol:

    public static void minimum1(List<Integer> nums) {


        Integer min = nums.stream().distinct(). //2, 3, 4, 5, 11, 10

                reduce((t, u) -> t > u ? u : t).get();

        System.out.println(min);//2

    }

    //2.yol:
    //sorted(Comparator.reverseOrder()) ifadesi,
    // Java Stream API'si içinde bir koleksiyonu ters sıralamak için kullanılır.
    //Comparator class, reverseOrder() methoddur.

    public static void minimum2(List<Integer> nums) {

        //2, 3, 4, 5, 11, 10
        //2,3,4,5,10,11
        //11,10,5,4,3,2

        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()). //11,10,5,4,3,2
                reduce((t, u) -> u).get();

        System.out.println(min);//2

    }

    //3.yol:

    public static void minimum3(List<Integer> nums) {

        //2, 3, 4, 5, 11, 10
        //2,3,4,5,10,11 ==> 1
        //11,10,5,4,3,2 ==> 2

/*        Integer min = nums.
                stream().
                distinct().
                sorted(). //2,3,4,5,10,11
                reduce((t, u) -> t).get();*/

        Optional<Integer> min = nums.
                stream().
                distinct().
                sorted(). //2,3,4,5,10,11
                        reduce((t, u) -> t);

        if (min.isPresent()) {
            System.out.println(min.get());
        } else {
            System.out.println("Liste bos veya min deger bulunamadi");
        }

    }

    //4.yol:

    public static void minimum4(List<Integer> nums) {

        Integer min = nums.stream().distinct().reduce((t, u) -> Math.min(t, u)).get();

        System.out.println(min); //2

    }

    //5.yol:

    public static void minimum5(List<Integer> nums) {

        Integer min = nums.
                stream().
                distinct().
                reduce(Math::min).
                get();

        System.out.println(min); //2

    }

    //----------------------------
    //8) Verilen listedeki 7'den büyük en küçük çift sayıyı bulan bir yöntem oluşturun.
    //2, 3, 4, 5, 11, 10, 14 ==> 10 <-- 7’den buyuk en kucuk cift sayi
    //8) Create a method that finds the smallest even number greater than 7 in the given list.
    //2, 3, 4, 5, 11, 10, 14 ==> 10 <-- Smallest even number greater than 7

    //findFirst(): Sıralı akışta bulunan ilk elemanı (yani bu senaryo da en küçük elemanı) alır.
    // Bu işlem bir Optional döndürür, çünkü akışta hiç eleman kalmamış olabilir
    // (filtreleme nedeniyle veya başka bir sebepten dolayı)

    public static void getMinGreaterThanSevenEven(List<Integer> nums) {

/*        Integer min = nums.
                stream().
                filter(t -> t > 7 && t % 2 == 0).
                sorted(). //10,14
                reduce((t,u) -> t).
                get();

        System.out.println(min); //10*/

        Integer min = nums.
                stream().
                filter(t -> t > 7 && t % 2 == 0).
                sorted(). //10,14
                        findFirst().
                get();

        System.out.println(min); //10
    }



}