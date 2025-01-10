package d7ternary_string;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String Data Tipi (Class)
        //String data tipi, cumleler, kelimeler, semboller, rakamlar icerebilir.

        //length() methodu String’in uzunlugunu dondurur.1’den baslar.

        String s = "Java is easy";
        int sLength  = s.length();
        System.out.println("sLength = " + sLength);

        System.out.println("-------------------------");

        //Ornek 2: "s" String'inde ilk ve son index'teki karakterleri aliniz.
        //Example 2: Get the characters in the first and last index of String "s".

        //charAt(int index) metodu, belirtilen index'te yer alan karakteri döndürmek için kullanılır.
        //Indeks 0 tabanlıdır, yani ilk karakterin indeksi 0'dır, ikinci karakterin indeksi 1, ve böyle devam eder.
        //Java'da indexleme, genellikle diziler (arrays), dizeler (Strings) veya koleksiyonlar (collections)
        // gibi bir veri yapısındaki belirli bir elemana erişmek için kullanılan bir tekniktir.

        char firstChar = s.charAt(0);
        System.out.println("firstChar = " + firstChar);
        
        char lastChar = s.charAt(s.length()-1); //length()-1 son indexi dynamic olarak verir.
        System.out.println("lastChar = " + lastChar);


        System.out.println("-------------------------");

        //Ornek 3: "s" String'indeki ilk 4 karakteri aliniz.
        //Example 3: Get the first 4 characters of the string "s".

        //substring(int beginIndex, int endIndex): Belirtilen indeks aralığındaki substring'i döndürür.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)

        String sSubstring = s.substring(0,4);
        System.out.println("sSubstring = " + sSubstring); //Java

        //Ornek 4: "s" String'indeki "is" kelimesini aliniz.
        //Example 4: Get the word "is" in String "s".

        String sub = s.substring(5,7);
        System.out.println("sub = " + sub); //is

        //Ornek 5: "s" String'indeki "easy" kelimesini aliniz.
        //Example 5: Get the word "easy" in String "s".

        String sub3 = s.substring(8,12);
        System.out.println("sub = " + sub3);

        //2.kullanimi: substring(int beginIndex): Belirtilen indeksten başlayarak sonuna kadar olan substring'i döndürür.

        String sub4 = s.substring(8);
        System.out.println("sub4 = " + sub4);

        System.out.println("----------------------------------");

        //Ornek 6: "s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz.
        //Example 6: Check if the word easy exists in the String "s".

        //contains() method'u herhangi bir karakterin veya karakterlerin String'de var olup olmadigini kontrol eder.
        //contains() methodu true veya false return eder. boolean

        boolean isExist = s.contains("easy"); //büyük küçük harfe duyarlı
        System.out.println("isExist = " + isExist);

        //---------------------------------
        // isExist var mı anlamı tasır.
        // toUpper or toLower büyük küçük duyarlılık var ise bu metotlar kullanılır.

        //Ornek 7: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        //Example 7: Check if the string "s" starts with a certain letter.

        //startsWith() methodu bir Strig'in ilk karakterini/karakterlerini kontrol eder
        //startsWith() methodu boolean return eder.

        boolean isStart = s.startsWith("J");
        System.out.println("isStart = " + isStart);

        //Ornek 8: "s" String'inin "easy" ile bitip bitmedigini kontrol ediniz.
        //Example 8: Check if the string "s" ends with "easy".

        //endsWith() methodu bir Strig'in son karakterini/karakterlerini kontrol eder
        //endsWith() methodu boolean return eder.

        boolean isEnd = s.endsWith("y"); //büyük küçük duyarlı
        System.out.println("isEnd = " + isEnd);



    }
}
