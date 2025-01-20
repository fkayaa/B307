package d22oop;

public abstract class Honda { //7. not public final abstract class Honda , HATA
    /*
4- Abstraction(Soyut)
Abstraction iki bolumden olusur.
i) Abstract Class:
Kendisinden object olusturulmaz. Bazi class'lari obje olusturmak amaciyla degil,
objeleri gruplara ayirmak ve genel ozellikleri belirlemek icin olustururuz.
Baslangic degil, sonuctur. Cünkü bu sınıflar belirli bir nesne grubunu temsil eder ve
bu gruptaki tüm nesneler için ortak olan özellikleri belirler.
*/

    // inheritance de extends keyworduyle classlar arasinda parent-child iliskisi kurariz, Poliformizimin bir türü olan
    // override ile parentsta bulunan methotlar üzerinde degisiklik yapabiliriz, parentta bulunan bir methot bütün alt classlar
    // tarafindan override edilirse o methot abstract (bodysiz methot) yapilir.

    /*
   1)Abstract method'larin body'si olmaz.Size ne yaptigini soyler,nasil yaptigini soylemez.

   2)Body'si olan method'lara 'non-abstract' veya 'concrete' (somut) method denir

   3)Abstract method'lar tum child class'lar tarafindan override edilmelidir yani kullanilmalidir.

   4)Abstract method'lar ancak abstract class'lar icinde olusturulabilir.

   5)Abstract class'lar hem 'abstract method' hem de 'concrete method' icerebilirler.

   6)Concrete method'lar child class'lar tarafindan istenirse override edilebilirler
*/

    //Java'da bir interface veya abstract class içinde main methodu yazmak mümkündür
    //Bir abstract class içinde birden fazla body'siz (gövdesiz) metod, yani abstract metod bulunabilir
    //Abstract Class'lar başka class'lar tarafından extends edilerek kullanılabilir.
    //Java'da bir abstract class, normal (somut) bir class'in child'i olabilir.

    //------------------------------------------

    //7) Final methodlar override edilemedigi icin, abstract olamazlar.(***"final" bir access modifier değildir. "final," bir Java anahtar kelimesidir)

    //8) Abstract bir class'in abstract bir child'i olabilir ve abstract child parent'inin methodlarini
   //override etmek zorunda degildir ama isterse de edebilir

    //9) Abstract bir class private olamaz yoksa child'lari ona ulasip override edemez

    //final classlar abstract olamazlar
    public  void music() { //    public final void music() normal metot final olabilir
        System.out.println("pro");
    }

    public abstract void engine(); //method abstract olunca , classta abstract olmak zorunda
    //public final void music() normal metot final olabilir


















}
