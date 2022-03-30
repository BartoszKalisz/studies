package SO_1;

import java.util.ArrayList;

import static java.lang.Math.round;

public class rotacyjny {
    ArrayList<Double> mieszana;
    double x;
    double pomocnicza_1;
    double pomocnicza_2;
    double czas_zakonczenia=10;
    double laczny_czas_czekania=0;
    public rotacyjny(ArrayList<Double> pomocnicza)
    {
        this.mieszana=pomocnicza;

    }
    public double oblicz()
    {
        for(int i=0;i<mieszana.size();i=i+2)
        {
            for(int j=0;j<mieszana.size()-2;j=j+2)
            {
                if(mieszana.get(j)>mieszana.get(j+2))
                {
                    pomocnicza_1= mieszana.get(j);
                    pomocnicza_2= mieszana.get(j+1);
                    mieszana.set(j, mieszana.get(j+2));
                    mieszana.set(j+2,pomocnicza_1);
                    mieszana.set(j+1, mieszana.get(j+3));
                    mieszana.set(j+3,pomocnicza_2);
                }
            }
        }
        for(int i=0;i<mieszana.size();i=i+2)
        {
            if(mieszana.get(i+1)<=16) {

            czas_zakonczenia = czas_zakonczenia + mieszana.get(i + 1);
            laczny_czas_czekania = laczny_czas_czekania + czas_zakonczenia - mieszana.get(i + 1) - mieszana.get(i);
        }
         else
        {   czas_zakonczenia = czas_zakonczenia + 16;
            mieszana.add(mieszana.get(i));
            mieszana.add(mieszana.get(i+1)-16);
        }
        }
        x=round((2*laczny_czas_czekania/(mieszana.size()+2))*10);

        return x/10;
    }
}