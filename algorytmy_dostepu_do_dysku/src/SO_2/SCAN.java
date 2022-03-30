package SO_2;

import java.util.ArrayList;

public class SCAN {
    ArrayList<zgloszenie> pomocnicza;
    ArrayList<Integer> wynikowa;
    zgloszenie x;
    int y=1;
    int wielkosc;
    public static int z=0;
    public SCAN(ArrayList<zgloszenie> pomocnicza, ArrayList<Integer> wynikowa,int wielkosc) {

        this.pomocnicza = pomocnicza;
        this.wynikowa = wynikowa;
        this.wielkosc = wielkosc;

    }
    public void oblicz()
    {
        double czas_czekania=pomocnicza.get(0).pozycja;
        double przemieszczenia_glowicy=0;
        for(int i=pomocnicza.get(0).pozycja;i<200;i++)
    {    z++;
       for(int j=y;j<wielkosc;j++)
       {
           if(z>=pomocnicza.get(j).moment_przybycia && i==pomocnicza.get(j).pozycja)
           {

               x=pomocnicza.get(y);
               pomocnicza.set(y, pomocnicza.get(j));
               pomocnicza.set(j,x);
               y++;
               czas_czekania=czas_czekania+pomocnicza.get(0).pozycja+z-pomocnicza.get(y-1).moment_przybycia;

           }
       }
    }
        while(y<wielkosc)
        {
           for(int i=199;i>=0;i--)
           {z++;
               for(int j=y;j<wielkosc;j++)
               {
                   if(z>=pomocnicza.get(j).moment_przybycia && i==pomocnicza.get(j).pozycja)
                   {
                       x=pomocnicza.get(y);
                       pomocnicza.set(y, pomocnicza.get(j));
                       pomocnicza.set(j,x);
                       y++;
                       czas_czekania=czas_czekania+pomocnicza.get(0).pozycja+z-pomocnicza.get(y-1).moment_przybycia;

                   }
               }
               if(y==wielkosc) break;
           }
            for(int i=0;i<200;i++)
            {z++;
                for(int j=y;j<wielkosc;j++)
                {
                    if(z>=pomocnicza.get(j).moment_przybycia && i==pomocnicza.get(j).pozycja)
                    {
                        x=pomocnicza.get(y);
                        pomocnicza.set(y, pomocnicza.get(j));
                        pomocnicza.set(j,x);
                        y++;
                        czas_czekania=czas_czekania+pomocnicza.get(0).pozycja+z-pomocnicza.get(y-1).moment_przybycia;

                    }
                }
                if(y==wielkosc) break;
            }
        }

        for(int i=0;i<wielkosc;i++)
        {
            System.out.println("Moment przybycia :"+pomocnicza.get(i).moment_przybycia+"  Pozycja :"+pomocnicza.get(i).pozycja);
        }

        for(int i=1;i<wielkosc;i++)
        {
            przemieszczenia_glowicy=z+pomocnicza.get(0).pozycja;
        }
        wynikowa.add((int) przemieszczenia_glowicy);
        wynikowa.add((int) (czas_czekania)/wielkosc);
        System.out.println("Laczne przemieszczenie glowicy: "+ przemieszczenia_glowicy+ " Sredni czas czekania: "+czas_czekania/wielkosc);
    }
}
