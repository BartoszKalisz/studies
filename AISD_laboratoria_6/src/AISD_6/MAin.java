package AISD_6;


import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class MAin {
    public static int x;
    public static void WidokSortowania()
    {
        System.out.println("Wybierz rodzaj sortowania: ");
        System.out.println("1 : Shellsort według nazwiska_imienia_wieku");
        System.out.println("2 : Shellsort według imienia_nazwiska_wieku");
        System.out.println("3 : Shellsort wedlug wieku_nazwiska_imienia");
        System.out.println("4 : Przez wybor wedlug nazwiska_imienia_wieku");
        System.out.println("5 : Przez wybor wedlug imienia_nazwiska_wieku ");
        System.out.println("6 : Przez wybor wedlug wieku_nazwiska_imienia ");
        System.out.println("7 : MergeSort według nazwiska_imienia_wieku");
        System.out.println("8 : MergeSort według imienia_nazwiska_wieku");
        System.out.println("9 : MergeSort wedlug wieku_nazwiska_imienia");
        System.out.println("10 : QuickSort wybor wedlug nazwiska_imienia_wieku");
        System.out.println("11 : QuickSort wedlug imienia_nazwiska_wieku ");
        System.out.println("12 : QuickSort wedlug wieku_nazwiska_imienia ");;
        System.out.println("13 : BubbleSort według nazwiska_imienia_wieku");
        System.out.println("14 : BubbleSort według imienia_nazwiska_wieku");
        System.out.println("15 : BubbleSort wedlug wieku_nazwiska_imienia");
        System.out.println("16 : Testowanie");

    }
    public static void InsertSort(Osoba[] tablica,Comparator t) {
        int  j;
        Osoba pomocnicza;

        //sortowanie
        for (int i = 1; i < tablica.length; i++) {
            j = i;
            pomocnicza = tablica[i];

            while (j > 0 && t.compare(tablica[j-1],pomocnicza)>0) {
                tablica[j] = tablica[j - 1];
                j--;
            }
            tablica[j] = pomocnicza;
        }


    }
    public static void Selectionsort(Osoba[] tablica, Comparator t) {

        int n = tablica.length;

            for (int i = 0; i < n - 1; i++) {
                // znajdowanie najmniejszego elementu
                int min = i;
                for (int j = i + 1; j < n; j++)
                    if (t.compare(tablica[j], tablica[min]) < 0)
                        min = j;

                //zamienianie elementów
                Osoba temp = tablica[min];
                tablica[min] = tablica[i];
                tablica[i] = temp;
            }



    }
    public static void ShellSort(Osoba[] tablica,Comparator t) {

        int h=0;
        int  j;
        Osoba pomocnicza;

        for(int i=0;i<20;i=i*3+1)
        {
            h=i/9;     //liczymy optymalna odleglosc odstepow
        }

        //sortowanie

            for(int k=h;k>=1;k=Math.round(k/3)) {
                for (int i = h; i < tablica.length; i++) {
                    j = i;

                    pomocnicza = tablica[i];

                    while (j > 0 && t.compare(tablica[j - 1], pomocnicza) > 0) {
                        tablica[j] = tablica[j - 1];
                        j--;
                    }
                    tablica[j] = pomocnicza;
                }
            }



    }

    //MergeSort
    private static void merge(Osoba[] tab,Comparator K,int pocz, int sr, int kon)
    {
        Osoba t[]= new Osoba[tab.length];
        int i,j,q;
        for (i=pocz; i<=kon; i++) t[i]=tab[i];  // Skopiowanie danych do tablicy pomocniczej
        i=pocz; j=sr+1; q=pocz;                 // Ustawienie wskaźników tablic
        while (i<=sr && j<=kon) {         // Przenoszenie danych z sortowaniem ze zbiorów pomocniczych do tablicy głównej
            if (K.compare(t[i],t[j])<0)
                tab[q++]=t[i++];
            else
                tab[q++]=t[j++];
        }
        while (i<=sr) {
            tab[q++] = t[i++]; // Przeniesienie nie skopiowanych danych ze zbioru pierwszego w przypadku, gdy drugi zbiór się skończył
        }

    }
    public static void MergeSort(Osoba[] tablica,Comparator t,int pocz, int kon) {
        int sr;
        if (pocz<kon) {
            sr=(pocz+kon)/2;
            MergeSort( tablica, t,pocz, sr);    // Dzielenie lewej części
            MergeSort( tablica, t,sr+1, kon);   // Dzielenie prawej części
            merge(tablica,t,pocz, sr, kon);   // Łączenie części lewej i prawej
        }

    }


    //QuicSort
    public static void QuickSort(Osoba[] tablica,Comparator t,int x,int y) {
        int i,j;
        Osoba v,temp;

        i=x;
        j=y;

        v=tablica[(x+y) / 2];


        do {
            while (t.compare(tablica[i],v)<0)
                i++;
            while (t.compare(v,tablica[j])<0)
                j--;
            if (i<=j) {
                temp=tablica[i];
                tablica[i]=tablica[j];
                tablica[j]=temp;
                i++;
                j--;
            }
        }
        while (i<=j);
        if (x<j)
            QuickSort(tablica,t,x,j);
        if (i<y)
            QuickSort(tablica,t,i,y);

    }

    //Bubblesort
    public static void BublleSort(Osoba[] tab,Comparator t) {

        int n = tab.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-1; j++)
                if (t.compare(tab[j],tab[j+1])>0)
                {

                    Osoba temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
    }
    public static void testowaniee()
    {
        Random generator = new Random();
        Osoba[] testowanie = new Osoba[10000];
        Osoba[] testowanie_2 = new Osoba[10000];
        for (int i = 0; i < 10000; i++) {
            int z=generator.nextInt(5);
            if(z==0) testowanie[i] = new Osoba(generator.nextInt(150),"Jan","Kowalski" );
            else if(z==1) testowanie[i] = new Osoba(generator.nextInt(150),"Konrad","Blaszczykowski" );
            else if(z==2) testowanie[i] = new Osoba(generator.nextInt(150),"Sandra","Lewandowski" );
            else if(z==3) testowanie[i] = new Osoba(generator.nextInt(150),"Pawel","Kubica" );
            else if(z==4) testowanie[i] = new Osoba(generator.nextInt(150),"Alicja","Nowak" );
            else if(z==5) testowanie[i] = new Osoba(generator.nextInt(150),"Michal","Jelen" );
        }
        long poczatek= System.currentTimeMillis();
        BublleSort(testowanie,new WiekNazwImieKomparator());
        long koniec =System.currentTimeMillis();
        System.out.println("Czasy dla losowej tablicy");
        System.out.println("BubbleSort: "+(koniec-poczatek));
         poczatek= System.currentTimeMillis();
        MergeSort(testowanie,new WiekNazwImieKomparator(),0,testowanie.length-1);
         koniec =System.currentTimeMillis();
        System.out.println("MergeSort: "+(koniec-poczatek));
         poczatek= System.currentTimeMillis();
        QuickSort(testowanie,new WiekNazwImieKomparator(),0,testowanie.length-1);
         koniec =System.currentTimeMillis();
        System.out.println("QuickSort: "+(koniec-poczatek));
         poczatek= System.currentTimeMillis();
        ShellSort(testowanie,new WiekNazwImieKomparator());
         koniec =System.currentTimeMillis();
        System.out.println("ShellSorrt: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        InsertSort(testowanie,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("InsertionSorrt: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        Selectionsort(testowanie,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("SelectionSort: "+(koniec-poczatek));

        poczatek= System.currentTimeMillis();
        BublleSort(testowanie,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("Czasy dla wersji optymistycznej");
        System.out.println("BubbleSort: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        MergeSort(testowanie,new WiekNazwImieKomparator(),0,testowanie.length-1);
        koniec =System.currentTimeMillis();
        System.out.println("MergeSort: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        QuickSort(testowanie,new WiekNazwImieKomparator(),0,testowanie.length-1);
        koniec =System.currentTimeMillis();
        System.out.println("QuickSort: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        InsertSort(testowanie,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("InsertionSorrt: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        ShellSort(testowanie,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("ShellSorrt: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        Selectionsort(testowanie,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("SelectionSort: "+(koniec-poczatek));

        for(int i=0;i<10000;i++)
        {
            testowanie_2[i]=testowanie[9999-i];
        }
        poczatek= System.currentTimeMillis();
        BublleSort(testowanie_2,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("Czasy dla wersji pesymistycznej");
        System.out.println("BubbleSort: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        MergeSort(testowanie_2,new WiekNazwImieKomparator(),0,testowanie.length-1);
        koniec =System.currentTimeMillis();
        System.out.println("MergeSort: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        QuickSort(testowanie_2,new WiekNazwImieKomparator(),0,testowanie.length-1);
        koniec =System.currentTimeMillis();
        System.out.println("QuickSort: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        InsertSort(testowanie_2,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("InsertionSorrt: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        ShellSort(testowanie_2,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("ShellSorrt: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        Selectionsort(testowanie_2,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("SelectionSort: "+(koniec-poczatek));
        for(int i=0;i<10000;i++)
        {
            int z=generator.nextInt(5);
            if(z==0) testowanie[i] = new Osoba(generator.nextInt(150),"Jan","Kowalski" );
            else if(z==1) testowanie[i] = new Osoba((int)generator.nextGaussian(),"Konrad","Blaszczykowski" );
            else if(z==2) testowanie[i] = new Osoba((int)generator.nextGaussian(),"Sandra","Lewandowski" );
            else if(z==3) testowanie[i] = new Osoba((int)generator.nextGaussian(),"Pawel","Kubica" );
            else if(z==4) testowanie[i] = new Osoba((int)generator.nextGaussian(),"Alicja","Nowak" );
            else if(z==5) testowanie[i] = new Osoba((int)generator.nextGaussian(),"Michal","Jelen" );
        }
        poczatek= System.currentTimeMillis();
        BublleSort(testowanie,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("Czasy dla rozkladu gaussa");
        System.out.println("BubbleSort: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        MergeSort(testowanie,new WiekNazwImieKomparator(),0,testowanie.length-1);
        koniec =System.currentTimeMillis();
        System.out.println("MergeSort: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        QuickSort(testowanie,new WiekNazwImieKomparator(),0,testowanie.length-1);
        koniec =System.currentTimeMillis();
        System.out.println("QuickSort: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        InsertSort(testowanie,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("InsertionSorrt: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        ShellSort(testowanie,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("ShellSorrt: "+(koniec-poczatek));
        poczatek= System.currentTimeMillis();
        Selectionsort(testowanie,new WiekNazwImieKomparator());
        koniec =System.currentTimeMillis();
        System.out.println("SelectionSort: "+(koniec-poczatek));
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {

        Osoba osoba_1 = new Osoba(20, "Adam", "Kowalski");
        Osoba osoba_2 = new Osoba(25, "Adrian", "Adamek");
        Osoba osoba_3 = new Osoba(30, "Amelia", "Gumny");
        Osoba osoba_4 = new Osoba(35, "Henryk", "Kowalski");
        Osoba osoba_5 = new Osoba(40, "Bogdan", "Lewandowski");
        Osoba osoba_6 = new Osoba(45, "Zofia", "Lewandowska");
        Osoba osoba_7 = new Osoba(50, "Paulina ", "Nowak");
        Osoba osoba_8 = new Osoba(55, "Jakub", "Adamek");
        Osoba osoba_9 = new Osoba(60, "Kamil", "Domowski");
        Osoba osoba_10 = new Osoba(50, "Adam", "Kowalski");
        Osoba osoba_11 = new Osoba(25, "Adrian", "Gumny");
        Osoba osoba_12 = new Osoba(30, "Amelia", "Adamek");
        Osoba osoba_13 = new Osoba(35, "Henryk", "Nowak");
        Osoba osoba_14 = new Osoba(18, "Bogdan", "Lewandowski");
        Osoba osoba_15 = new Osoba(19, "Zofia", "Lewandowska");
        Osoba osoba_16 = new Osoba(50, "Paulina ", "Kowalska");
        Osoba osoba_17 = new Osoba(55, "Jakub", "Kasperczak");
        Osoba osoba_18 = new Osoba(60, "Kamil", "Stoch");
        Osoba osoba_19 = new Osoba(21, "Piotr", "Kubica");
        Osoba osoba_20 = new Osoba(22, "Władysław", "Warszawski");

        Osoba tablica[] = {osoba_1, osoba_2, osoba_3, osoba_4, osoba_5, osoba_6, osoba_7, osoba_8, osoba_9, osoba_10, osoba_11, osoba_12, osoba_13, osoba_14, osoba_15, osoba_16, osoba_17, osoba_18, osoba_19, osoba_20};

        int Opcja;

        Scanner sc = new Scanner(System.in);
        WidokSortowania();
        while (sc.hasNext()) {
            Opcja = sc.nextInt();
            sc.nextLine();

            switch (Opcja) {
                case 1: {

                    ShellSort(tablica, new NazwImieWiekKomparator());
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }
                }
                break;
                case 2: {

                    ShellSort(tablica, new ImieNazwWiekKomparator());
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }
                }
                break;
                case 3: {

                    ShellSort(tablica, new WiekNazwImieKomparator());
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }
                }
                break;
                case 4: {

                    Selectionsort(tablica, new NazwImieWiekKomparator());
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }

                }
                break;
                case 5: {

                    Selectionsort(tablica, new ImieNazwWiekKomparator());
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }

                }
                break;
                case 6: {

                    Selectionsort(tablica, new WiekNazwImieKomparator());
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }


                }
                break;
                case 7: {

                    MergeSort(tablica, new NazwImieWiekKomparator(), 0, tablica.length - 1);
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }
                }
                break;

                case 8: {

                    MergeSort(tablica, new ImieNazwWiekKomparator(), 0, tablica.length - 1);
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }
                }
                break;
                case 9: {

                    MergeSort(tablica, new WiekNazwImieKomparator(), 0, tablica.length - 1);
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }
                }
                break;
                case 10: {

                    QuickSort(tablica, new NazwImieWiekKomparator(), 0, tablica.length - 1);
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }

                }
                break;
                case 11: {

                    QuickSort(tablica, new ImieNazwWiekKomparator(), 0, tablica.length - 1);
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }

                }
                break;
                case 12: {

                    QuickSort(tablica, new WiekNazwImieKomparator(), 0, tablica.length - 1);
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }

                }
                break;
                case 13: {

                    BublleSort(tablica, new NazwImieWiekKomparator());
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }

                }
                break;
                case 14: {

                    BublleSort(tablica, new ImieNazwWiekKomparator());
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }

                }
                break;
                case 15: {

                    BublleSort(tablica, new WiekNazwImieKomparator());
                    //wyswietlanie
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("#" + (i + 1) + "  :\t " + tablica[i]);
                    }

                }
                break;
                case 16: {
                testowaniee();

                }
                break;
            }
            WidokSortowania();
        }





    }
}