package SO_4;

import java.util.ArrayList;

public class LRU {
    public int przelacznik=0;
    public int licznik_dolny=0;
    public int licznik=0;
    public int wielkosc_ramki;
    int ostatnio_uzyty=0;
    int pomocnicza_zmienna;
    ArrayList<Strona> strony= new ArrayList<>();
    ArrayList<Strona> pomocnicza= new ArrayList<>();
    ArrayList pamietanie_ramkek=new ArrayList<>();

    public LRU(int wielkosc_ramki, ArrayList<Strona> strony) {
        this.wielkosc_ramki = wielkosc_ramki;
        this.strony = strony;
    }
    public int algorytm_LRU()
    {

        for(int i=0;i<wielkosc_ramki;i++)
    {
        pamietanie_ramkek.add(i);
    }
       if(przelacznik==0) {
           for (int i = 0; i < strony.size(); i++) {

               mainloop:
               if (pomocnicza.size() < wielkosc_ramki) {

                   for (int j = 0; j < pomocnicza.size(); j++) {
                       if (pomocnicza.get(j).numer_strony == strony.get(i).numer_strony) {
                           pomocnicza_zmienna = (int) pamietanie_ramkek.get(j);

                           for (int k = j; k < pomocnicza.size() - 1; k++) {
                               pamietanie_ramkek.set(j, j + 1);
                           }
                           pamietanie_ramkek.set(pomocnicza.size() - 1, pomocnicza_zmienna);
                           break mainloop;

                       }
                   }

                   pomocnicza.add(strony.get(i));
                   licznik++;
               } else {
                   for (int j = 0; j < pomocnicza.size(); j++) {

                       if (pomocnicza.get(j).numer_strony == strony.get(i).numer_strony) {
                           pomocnicza_zmienna = (int) pamietanie_ramkek.get(j);

                           for (int k = j; k < pomocnicza.size() - 1; k++) {

                               pamietanie_ramkek.set(j, j + 1);
                           }

                           pamietanie_ramkek.set(pomocnicza.size() - 1, pomocnicza_zmienna);

                           break mainloop;
                       }
                   }
                   pomocnicza.remove((int) pamietanie_ramkek.get(pomocnicza.size() - 1));

                   pomocnicza_zmienna = (int) pamietanie_ramkek.get(0);

                   for (int k = pomocnicza.size() - 1; k > 0; k--) {


                       pamietanie_ramkek.set(k, k - 1);
                   }

                   pamietanie_ramkek.set(0, pomocnicza_zmienna);

                   pomocnicza.add(strony.get(i));
                   licznik++;
               }

           }
       }
       else
       {
           for (int i = 0; i < strony.size(); i++) {

               mainloop:
               if (pomocnicza.size() < wielkosc_ramki) {

                   for (int j = 0; j < pomocnicza.size(); j++) {
                       if (pomocnicza.get(j).numer_strony == strony.get(i).numer_strony) {
                           pomocnicza_zmienna = (int) pamietanie_ramkek.get(j);

                           for (int k = j; k < pomocnicza.size() - 1; k++) {
                               pamietanie_ramkek.set(j, j + 1);
                           }
                           pamietanie_ramkek.set(pomocnicza.size() - 1, pomocnicza_zmienna);
                           break mainloop;

                       }
                   }

                   pomocnicza.add(strony.get(i));
                   licznik++;
               }

           }
       }
        return licznik;
    }

}