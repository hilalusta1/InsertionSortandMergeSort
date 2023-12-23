package insertionsortandmergesort;

public class mergeSort {
    //Merge Sort algoritmasında problem orta değer bulunarak iki parçaya bölünür.
    //Ve tek eleman kalana kadar bölme işlemine devam edilir.
    //Tek eleman kaldığında ise merge edilerek yukarıya doğru inşa edilir.
    
    int[] dizi; //Bu sınıfta kullanacağımız değişkenlerin tanımlanması:
    int[] temp;
    int uzunluk;
    
    public void Sort(int[] dizi)
    {
        this.uzunluk = dizi.length; //parametre olarak gelen dizinin uzunluğunu uzunluk değişkenine aldık
        this.dizi = dizi; //parametre olarak gelen dizinin sınıfta tanımlanmış parametre olduğunu söylüyoruz
        this.temp = new int[uzunluk]; //sınıfta tanımlanmış olan temp dizisinin boyutunu uzunluk olarak aldık:
        Divide(0, uzunluk - 1); //Divide metodunu çağırdık ve içine parametreleri yolladık:
    }
    
    //Merge Sort recursive bir çözümdür yani bir fonksiyonda yine o fonksiyonu kullanabiliriz:
    public void Divide(int sol, int sag)
    {
        //Divide işlemi parçalamaktır, diziyi seçtiğimiz noktadan sürekli iki eşit parçaya
        //bölüyoruz, bu işlem tek işlem kalana kadar devam ediyor:
        if (sol < sag)
        {
            int orta1 = sol + (sag - sol) / 2; //Dizinin orta değeri
            Divide(sol, orta1); //Sol tarafı bölüyoruz
            Divide(orta1 + 1, sag); //Sağ tarafı bölüyoruz
            Merge(sol, sag, orta1); //Ve merge fonksiyonuyla sıralanmış dizileri tekrar inşa ediyoruz.
        }
    }
    
    public void Merge(int sol, int sag, int orta)
    {
        //Divide işleminden sonra merge işlemiyle bölünen dizi tekrar inşa edilecek
        //bu inşa işlemi bölünen dizilerin en soldan başlanarak dizi
        //indekslerinin karşılaştırılması şeklinde yapılır.
        
        for (int i = sol; i <= sag; i++) temp[i] = dizi[i]; //Temp dizisine işlem aralığı atandı:
            int a = sol; //Dizinin başlangıç noktası belirlendi
            int b = orta + 1; //Sağ kısmın başlangıç indexsi
            int c = sol; //Değişim parçasının indexsi
                while(a <= orta && b <= sag) //Sağ kısım bitişe, sol kısım ortaya gelene kadar while döngüsü döner
                {
                //Parçaların değerleri karşılaştırır:
                    if(temp[a] <= temp[b]) //Küçükse ve eşit ise değer en sola gelir:
                    {
                        dizi[c] = temp[a]; 
                        a++; //İndis arttırımı yapılır
                    }
                    else
                    {
                        dizi[c] = temp[b]; //Büyük olması halinde sağ ile yer değiştirme işlemi yapılır.
                        b++; //indis arttırımı yapılır
                    }
                    c++; //Bir sonraki indise geçilir
                }
                while(a <= orta) //İşlem görmemiş kısımları diziye aktarma işlemi burda yapılır
                                 //yani karşılaştırma yapılmamış indisler içindir bu while döngüsü
                {
                    dizi[c] = temp[a];
                    c++;
                    a++;
                }
    }
    
    //Dizinin Merge Sort algoritmasıyla sıralanmış halini yazdırmak için
    //siraliDizi isimli metotu oluşturup yine içine main sınıfında oluşturduğum
    //diziyi parametre olarak veriyorum:   
    public void siraliDizi(int dizi[]){
        System.out.print("Dizinin merge sort algoritmasina gore siralanmis hali: ");    
        for(int i=0;i<dizi.length;i++) {
            System.out.print(" " + dizi[i]);
        }
        System.out.println(" ");
    }
}