package SO_2;

import java.util.ArrayList;

public class SSTF {
    ArrayList<zgloszenie> pomocnicza;
    ArrayList<Integer> wynikowa;
    zgloszenie x,najblizsza;
    int najbizej,y=0;
    int wielkosc;


    public SSTF(ArrayList<zgloszenie> pomocnicza,ArrayList<Integer> wynikowa, int wielkosc) {

        this.pomocnicza = pomocnicza;
        this.wynikowa = wynikowa;
        this.wielkosc = wielkosc;

    }
    public void oblicz()
    {

        for(int i=0;i<wielkosc-1;i++)
        {najbizej=Math.abs(pomocnicza.get(i).pozycja-pomocnicza.get(i+1).pozycja);

            for (int j=i+1;j<wielkosc;j++)
            {

                if (Math.abs(pomocnicza.get(i).pozycja - pomocnicza.get(j).pozycja) <= najbizej) {
                    najbizej = Math.abs(pomocnicza.get(i).pozycja - pomocnicza.get(j).pozycja);

                    y=j;
                }

            }
            if(y!=0) {
                x = pomocnicza.get(i + 1);
                pomocnicza.set(i + 1, pomocnicza.get(y));
                pomocnicza.set(y, x);
            }

        }
        for(int i=0;i<wielkosc;i++)
        {
            System.out.println("Moment przybycia :"+pomocnicza.get(i).moment_przybycia+"  Pozycja :"+pomocnicza.get(i).pozycja);
        }
        double czas_czekania=pomocnicza.get(0).pozycja;
        double przemieszczenia_glowicy=pomocnicza.get(0).pozycja;
        for(int i=1;i<wielkosc;i++)
        {

            przemieszczenia_glowicy=przemieszczenia_glowicy+Math.abs(pomocnicza.get(i).pozycja-pomocnicza.get(i-1).pozycja);
            czas_czekania= czas_czekania+przemieszczenia_glowicy-pomocnicza.get(i).moment_przybycia;
        }
        wynikowa.add((int) przemieszczenia_glowicy);
        wynikowa.add((int) (czas_czekania/wielkosc));
        System.out.println("Laczne przemieszczenie glowicy: "+ przemieszczenia_glowicy+ " Sredni czas czekania: "+czas_czekania/wielkosc);
    }

}
