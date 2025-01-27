package d26maps_exceptions;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        //meshur bir interview sorusu

        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız olsun)
        //example 1: Given a String, count the number of times each word is used in that String
        // write the code that displays.(Case insensitive)

        String s = "Ali nasilsin Ali.";
        //1.noktalama isaretlerini sil
       s = s.replaceAll("\\p{Punct}","").toLowerCase();
        System.out.println(s);//ali nasilsin ali

       String[] words =  s.split(" ");
        System.out.println(Arrays.toString(words));//[ali, nasilsin, ali]

        HashMap<String , Integer> myMAp = new HashMap<>();
        System.out.println(myMAp);//{         }  bos map açtık

        for (String w : words) {

            Integer isThere = myMAp.get(w);

            if (isThere == null) {
                myMAp.put(w , 1); // map te eleman yoksa w dan yani ilk döngüde ali den bir tane ekle
            }else {
                myMAp.put(w , isThere + 1);//map te var olan elemanı 1 arttırdık
            }

        }
        System.out.println(myMAp);//{nasilsin=1, ali=2}

        //ODEV: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
        //example 2: Write the code that shows how many times each letter in a given String is used in that String.
        //"Hello" ==> h=1, e=1, l=2, o=1

        String h = "Hello";
        h = h.replaceAll(""," ").trim().toLowerCase();
        System.out.println(h); // H e l l o


        String[] harfler =  h.split(" ");
        System.out.println(Arrays.toString(harfler)); //[h , e, l, l, o]

        HashMap<String ,Integer> harfMap = new HashMap<>();//{}

        for (String w : harfler ) {

            Integer value = harfMap.get(w);

            if (value == null) {

                harfMap.put(w , 1);

            }else {

                harfMap.put(w , value + 1);
            }


        }
        System.out.println(harfMap); //{e=1, h=1, l=2, o=1}






    }
}
