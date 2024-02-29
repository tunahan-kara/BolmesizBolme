import java.util.Scanner;

public class BolmesizBolme {
    public static void main(String[] args) {
        // Bölme operatörü kullanmadan bölme işlemi yapan java kodu
        Scanner veri = new Scanner(System.in);
        System.out.println("Bölünecek Sayıyı Giriniz : ");
        int sayi1 = veri.nextInt();
        System.out.println("Bölecek Sayıyı Giriniz : ");
        int sayi2 = veri.nextInt();
        int deger = 2 ;
        // sayılar eşitse sonuç 2 olacağından bunu en baştan koşula bağlıyoruz
        if (sayi1==sayi2) {
            System.out.println("1");
            return;
        }
        /* deger isimli atadığımız eleman ile kontrol yapacağız. eğer deger*sayi2 , sayi1'den küçükse deger artacak.
        deger'in artması aldığımız sonuç sayi1'den büyük olana kadar devam edecek. büyük olduğu anda bir önceki değer
        bizim en büyük bölenimizdir. Yani sonuç deger'in aldığı son değerdir.
         */
        while (sayi2*deger < sayi1) {
            deger++; }

        if (deger*sayi2>sayi1) {
            System.out.println(deger-1);
        }
        else System.out.println(deger);
         }}
