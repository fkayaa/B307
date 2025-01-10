package d13array;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        //Example 1: Create an int array and write the elements less than 5.
        //[12, 3, -3, 5, 23] ==> 3, -3

        int[] num = {12, 3, -3, 5, 23}; //kısa yoldan array olusturduk

        for (int w : num) {
            if (w < 5) {
                System.out.print(w + "  "); //3 ,-3
            }
        }

        //--------------------------------------
        var numbers2 = new int[]{1,2,3,4,5};//tür --> int //var sol tarafta kullanılır
        //--------------------------------------

        //Ornek 2: Spesifik bir elemanin Array'de olup olmadigini anlamak icin gereken kodu yaziniz.
        //Example 2: Write the code to find out if a specific element is in Array

        //binarySearch() methodu var olan elemanlar icin size o elemanin index'ini verir
        //binarySearch() methodunu sort() kullanmadan kullanmayiniz
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
        // "-" ==> isaretinin anlami eleman yok demektir

        /*
        Yani, metot şu şekilde çalışır:
        Diziyi ikiye bölün.
        Aranan değer, ortadaki elemana eşitse, arama tamamlanır.
        Aranan değer, ortadaki elemandan küçükse, dizinin sol yarısında aramaya devam edilir.
        Aranan değer, ortadaki elemandan büyükse, dizinin sağ yarısında aramaya devam edilir.
      Bu işlem, aranan değer bulunana veya dizi içinde aranacak bir alt dizi kalmayana kadar tekrar edilir.
 */

        //sort() methodu sayilari kucukten buyuge siralar (ascending order)
        //String data tiplerini alfabetik siralar (alphabetical order)
        //ascending order + alphabetical order = natural order
        //sort() methodu Array elemanlarini natural order'a gore siralar
        System.out.println();
        String names[] = {"A" , "T" , "K" , "E" , "B"};
        Arrays.sort(names); //sıraladık --> [A, B, E, K, T]
        System.out.println(Arrays.toString(names));

        int result = Arrays.binarySearch(names,"B");
        System.out.println("B' nin indexi : "+result);

        //ARASTIRMA ODEVI: Java'da char veya boolean turunde bir array olusturabilir misiniz?

        //-------------------------------------
        //-----------------------
        int[] arr = {2, 1, 7, 6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,2));//1
        System.out.println(Arrays.binarySearch(arr, 7)); //3
        System.out.println(Arrays.binarySearch(arr, 3)); //-3
        System.out.println(Arrays.binarySearch(arr, 9)); //-5

        //--------------------------

        String[] str = {"A", "C", "B", "D"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        System.out.println(Arrays.binarySearch(str,"A"));//0 varsa index,yoksa - yazıp kaçıncı eleman olurdu diye sayıyı yazıyoruz.
        System.out.println(Arrays.binarySearch(str,"C"));//2
        System.out.println(Arrays.binarySearch(str,"E"));//-5
        System.out.println(Arrays.binarySearch(str,"G"));//-5



        //--------------------------------------

        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        //Example 3: Write the code that shows you how many words are in a given sentence.
        //String s = "Java is easy. Learn Java earn money.";

        String s = "Java is easy. Learn Java earn money.";
        String[] words = s.split(" ");

        System.out.println(Arrays.toString(words)); // kelime kelime array içine alır

        System.out.println(words.length); // eleman sayısını verir .


    }
}
