package insertionsortandmergesort;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //Kullanıcıdan dizi boyutunu alıyoruz ve aldığımız dizi boyutunu dizi
        //isimli diziye girdi boyut olarak giriyoruz:
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz: ");
        int dizi_boyut = input.nextInt();
        int [] algoritma = new int[dizi_boyut];
        
        //Dizinin içini kullanıcı doldurması istendiği için tekrar scanner
        //sınıfı kullanılarak dizi elemanları "algoritma" isimli diziye aktarılıyor:
        Scanner input2 = new Scanner(System.in);
        System.out.println("Dizinin elemanlarini giriniz: ");
        for(int i=0;i<algoritma.length;i++) {
            algoritma[i] = input2.nextInt();
        }
        
        //Sıralanmamış diziyi ekrana yazdırıyoruz:
        System.out.print("Siralanmamis Dizi: ");
        for(int i=0;i<algoritma.length;i++) {
            System.out.print(" " + algoritma[i]);
        }
        System.out.println(" ");
        
        //İnsertion Sort algoritması için oluşturduğumuz sınıfın nesnesini oluşturup
        //algoritma dizimi İnsertion Sort algoritması sınıfındaki sıralama ve "SiraliDizi" isimli
        //yazdirma metotlarına paarametre olarak gönderdik:
        insertionSort iS = new insertionSort();
        iS.insertionSort(algoritma);   
        iS.siraliDizi(algoritma);
 
        //Merge Sort algoritması için oluşturduğumuz sınıfın nesnesini oluşturup
        //algoritma dizimi Merge Sort algoritması sınıfındaki sıralama ve "SiraliDizi" isimli
        //yazdirma metotlarına paarametre olarak gönderdik:
        mergeSort m = new mergeSort();
        m.Sort(algoritma);
        m.siraliDizi(algoritma);
    }
}