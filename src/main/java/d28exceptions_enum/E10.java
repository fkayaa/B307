package d28exceptions_enum;

public class E10 {
    public static void main(String[] args) {
        /*
        1) finally bloğu genellikle;
         a) Kaynakların serbest bırakılması :  (veritabani baglantisinin kesilmesi, close() methodu ile),
             Özellikle eski Java versiyonlarında (Java 7 öncesi), veritabanı bağlantıları gibi kaynaklar
             manuel olarak kapatılmalıydı. Bu tür kaynaklar, uzun süre açık bırakılırsa sistemde gereksiz
             yere yer kaplar ve potansiyel performans sorunlarına neden olabilir. Java 7 sonrasi otomatiklesti ( try-with-resources ifadesi ile)

         b) Dosyaların kapatılması :  (az once dosya baglantisi yapmistik.  fis.close(); ile kapatilabilirdi)
            Dosyaları okuma veya yazma işlemi bittikten sonra kapatmak gereklidir. Aksi halde, dosya kolları
             gereksiz yere sistemde yer kaplar.

         c) Her durumda çalıştırılması gereken temizleme işlemleri :
         (Bazı işlemler, başarılı olsun ya da olmasın, belirli bir sürecin sonunda her zaman yapılmalıdır.

        Örneğin, bir log dosyasına her işlemin başlangıç ve bitiş zamanını kaydetmek gibi. BufferedWriter ile)

         finally icin bir senaryo olusturalim; a/b bolumu ile bir index bulalim ve bu index'i kullanarak
        Array'deki elemani bulalim
 */
        int a = 12;
        int b = 4;
        int[] c = {3 , 5 , 7 , 9};
        bring(c , a , b);



    }//main dışı

    public static void bring(int[] c ,int a ,int b) {

        // Coklu finally block kullanilamaz
        //java da try + bir catch, try + birden fazla catch, try + catch + finally,
        // try + finally kullanilabilir.
        //Array içi ===> {3 , 5 , 7, 9}

        try {

            int idx = a / b;
            int element = c[idx];

        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { //pipe operatoru , multi-catch
            //  - | - pipe operetoru, multi-catch -- catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
           //kardes olanlar icin gecerli parent child iliskisi varsa olmaz.

            System.err.println(e.getMessage());

        } finally {
            System.out.println("Database ile baglantıyı kesiniz ...");
        }

    }
}
