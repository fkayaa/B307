package d12loopsarrays;

public class ForLoops06 {
    public static void main(String[] args) {

        //Java'da etiketler (labels), döngülerde (for, while, do-while) kullanılır ve genellikle iç içe
        // döngülerde belirli bir döngüden çıkmak veya belirli bir döngünün başına dönmek için kullanılır.
        //Etiketler, bir döngüye bir ad (label) vererek, bu döngüyü hedefli bir şekilde kontrol etmenizi sağlar.

        /* Etiket Kullanımına Dair Notlar
        1- Etiket Kullanımı Şart mı?
        Değil.Etiketler genellikle iç içe döngülerde kontrolü kolaylaştırmak için kullanılır.
        Basit döngülerde break ve continue genellikle yeterlidir.

        2- Etiketlerin Tanımı:
        Etiketler bir ad tanımlanır ve ardından : karakteri ile belirtilir.
        Etiket, bir döngüden hemen önce yerleştirilir.

        3- Kod Okunabilirliği:
        Çok sayıda etiket kullanımı kodun okunabilirliğini zorlaştırabilir.
        Sadece gerçekten ihtiyaç duyulan durumlarda kullanılmalıdır.*/

        outerLoop: //altındaki loopun etiketi
        for (int i= 1; i <= 3 ; i++) {

            for (int j = 1; j <= 3 ; j++) {

                if (i == 2 && j == 2) {
                    System.out.println("Etiketli döngüden çıkılıyor ...");
                    break outerLoop;
                }

                System.out.println("i = " + i + ", j = " + j);

            }

        }

        System.out.println("Program bitti...");

    }
}
