package insertionsortandmergesort;

public class insertionSort {
    
    //Dizinin üzerinde swapping işlemi yapacağım insertionSort isimli
    //metodumu tanımlıyorum ve içine main sınıfından gelecek diziyi parametre olarak veriyorum:
    public void insertionSort(int dizi[]) {
        //Parametre olarak gelen dizinin uzunluğunu alıyoruz:
        int uzunluk = dizi.length;
        //For döngüsüyle gelen diziyi dolaşıyoruz:
        for (int j = 1; j < uzunluk; j++) {  
            int anahtar = dizi[j]; //Dizinin j.elemanı anahtar olarak atanıyor:
            //Yani burada j'yi 1'den başlatmamızın nedeni 0. indisin i değeri olacak olması!
            int i = j-1; //j-1 değeri i'ye atılıyor çünkü diziye i ve j olarak dolaşıcaz:
            //i ve j değerlerinin değişmesi için while döngüsü yazılıyor:
            while ( (i > -1) && ( dizi [i] > anahtar ) ) { 
                dizi [i+1] = dizi [i];  
                i--;  
            }  
            dizi[i+1] = anahtar; //anahtar değeri güncelleniyor:  
        }  
    }
    
    //Dizinin İnsertion Sort algoritmasıyla sıralanmış halini yazdırmak için
    //siraliDizi isimli metotu oluşturup yine içine main sınıfında oluşturduğum
    //diziyi parametre olarak veriyorum:
    public void siraliDizi(int dizi[]){
        System.out.print("Dizinin insertion sort algoritmasina gore siralanmis hali: ");    
        for(int i=0;i<dizi.length;i++) {
            System.out.print(" " + dizi[i]);
        }
        System.out.println(" ");
    }
}