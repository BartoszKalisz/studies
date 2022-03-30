package SO_2;

import java.util.ArrayList;
import java.util.Random;

public class EDF {
    ArrayList<zgloszenie> pomocnicza;
    ArrayList<Integer> wynikowa;
    zgloszenie x;
    int wielkosc;
    double czas_czekania;
    double przemieszczenia_glowicy;

    public EDF(ArrayList<zgloszenie> pomocnicza, ArrayList<Integer> wynikowa,int wielkosc) {

        this.pomocnicza = pomocnicza;
        this.wynikowa = wynikowa;
        this.wielkosc= wielkosc;
    }

    public void oblicz()
    {
        Random generator = new Random();
        int a= generator.nextInt(wielkosc-2)+1;
        int b= generator.nextInt(wielkosc-2)+1;
        int c= generator.nextInt(wielkosc-2)+1;

        x= pomocnicza.get(a);
        pomocnicza.set(a,pomocnicza.get(1));
        pomocnicza.set(1,x);

        x= pomocnicza.get(b);
        pomocnicza.set(b,pomocnicza.get(2));
        pomocnicza.set(2,x);

        x= pomocnicza.get(c);
        pomocnicza.set(c,pomocnicza.get(3));
        pomocnicza.set(3,x);

        czas_czekania=pomocnicza.get(0).pozycja;
        przemieszczenia_glowicy=pomocnicza.get(0).pozycja;
        for(int i=3;i<wielkosc;i++)
        {
            for(int j=3;j<wielkosc-1;j++)
            {
                if(pomocnicza.get(j).moment_przybycia>pomocnicza.get(j+1).moment_przybycia)
                {
                    x= pomocnicza.get(j);
                    pomocnicza.set(j,pomocnicza.get(j+1));
                    pomocnicza.set(j+1,x);
                }
            }
        }

        for(int i=0;i<wielkosc;i++)
        {
            System.out.println("Moment przybycia :"+pomocnicza.get(i).moment_przybycia+"  Pozycja :"+pomocnicza.get(i).pozycja);
        }

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
