package SO_5;

import SO_5.proces;

import java.util.ArrayList;
import java.util.Random;


public class Strategia_3 {
    Random random=new Random();

    int minimalny_prog;
    int prog_obciazenia;
    int liczba_prob;
    int ilosc_zapytan=0;
    int ilosc_migracji=0;
    ArrayList<Integer> obciazenia_procesow=new ArrayList<>();
    ArrayList<proces> procesy=new ArrayList<>();
    ArrayList<Integer> numer_procesora=new ArrayList<>();

    public Strategia_3(int prog_obciazenia,int minimalny_prog, ArrayList<Integer> obciazenia_procesow, ArrayList<proces> procesy, ArrayList<Integer> numer_procesora) {
        this.prog_obciazenia = prog_obciazenia;
        this.minimalny_prog=minimalny_prog;
        this.obciazenia_procesow = obciazenia_procesow;
        this.procesy = procesy;
        this.numer_procesora = numer_procesora;
    }

    public void oblicz()
    {

        for(int i=0;i<obciazenia_procesow.size();i++)
        {
            if(procesy.get(numer_procesora.get(i)).getProcent_zapelnienia()<prog_obciazenia)
            {
                procesy.get(numer_procesora.get(i)).setProcent_zapelnienia(obciazenia_procesow.get(i)+procesy.get(numer_procesora.get(i)).getProcent_zapelnienia());
                 if(procesy.get(numer_procesora.get(i)).getProcent_zapelnienia()<minimalny_prog);
                { ilosc_zapytan++;
                    int z=random.nextInt(procesy.size()-1);
                    if(procesy.get(z).getProcent_zapelnienia()>prog_obciazenia)
                    {   double y=(procesy.get(z).procent_zapelnienia*0.1); //przejmuje 10%
                        procesy.get(numer_procesora.get(i)).setProcent_zapelnienia(y+procesy.get(numer_procesora.get(i)).getProcent_zapelnienia());
                        procesy.get(z).setProcent_zapelnienia(procesy.get(z).procent_zapelnienia-y);
                        ilosc_migracji++;
                    }
                }
            }
            else{
                int x=random.nextInt(procesy.size()-1);

                for(int j=0;j<procesy.size();j++)
                { ilosc_zapytan++;
                    if(procesy.get(x).procent_zapelnienia<prog_obciazenia)
                    {
                        ilosc_migracji++;
                        procesy.get(x).setProcent_zapelnienia(obciazenia_procesow.get(i)+procesy.get(x).getProcent_zapelnienia());
                        break;
                    }
                    else if(j==procesy.size()-1) procesy.get(numer_procesora.get(i)).setProcent_zapelnienia(obciazenia_procesow.get(i)+procesy.get(numer_procesora.get(i)).getProcent_zapelnienia());
                }

            }
        }
        double srednie_obliczenie=0;
        for(int i=0;i<procesy.size();i++) {
            srednie_obliczenie = srednie_obliczenie + procesy.get(i).getProcent_zapelnienia();
        }
        srednie_obliczenie=srednie_obliczenie/procesy.size();
        System.out.println("STRATEGIA 3: ");
        System.out.println("Srednie ociazenie procesow wynosi: "+((double)Math.round(srednie_obliczenie*10))/10);

        double odchylenie=0;
        for(int i=0;i<procesy.size();i++) {
            odchylenie=odchylenie+Math.abs(srednie_obliczenie-procesy.get(i).getProcent_zapelnienia());
        }
        odchylenie=odchylenie/procesy.size();
        System.out.println("Średnie odchylenie od wartosci dredniej wynosi: "+(double) (Math.round(odchylenie*100))/100);
        System.out.println("Liczba zapytan o migracje wynosi: "+ilosc_zapytan);
        System.out.println("Liczba migracji wynosi: "+ilosc_migracji);
        System.out.println();
    }

}