package SO_5;

import java.util.ArrayList;
import java.util.Random;


public class Strategia_1 {
    Random random=new Random();

    int prog_obciazenia;
    int liczba_prob;
    int ilosc_zapytan=0;
    int ilosc_migracji=0;
    ArrayList<Integer> obciazenia_procesow=new ArrayList<>();
    ArrayList<proces> procesy=new ArrayList<>();
    ArrayList<Integer> numer_procesora=new ArrayList<>();

    public Strategia_1(int prog_obciazenia, int liczba_prob, ArrayList<Integer> obciazenia_procesow, ArrayList<proces> procesy, ArrayList<Integer> numer_procesora) {
        this.prog_obciazenia = prog_obciazenia;
        this.liczba_prob = liczba_prob;
        this.obciazenia_procesow = obciazenia_procesow;
        this.procesy = procesy;
        this.numer_procesora = numer_procesora;
    }

    public void oblicz()
    {
        for(int i=0;i<obciazenia_procesow.size();i++)
        {
            for(int j=0;j<liczba_prob;j++)
            {  ilosc_zapytan++;
                int x=random.nextInt(procesy.size()-1);
                if(procesy.get(x).procent_zapelnienia<prog_obciazenia)
                {
                    ilosc_migracji++;
                    procesy.get(x).setProcent_zapelnienia(obciazenia_procesow.get(i)+procesy.get(x).getProcent_zapelnienia());
                    break;
                }
                if(j==liczba_prob-1)
                {
                    procesy.get(numer_procesora.get(i)).setProcent_zapelnienia(obciazenia_procesow.get(i)+procesy.get(numer_procesora.get(i)).getProcent_zapelnienia());
                }
            }
        }
        double srednie_obliczenie=0;
        for(int i=0;i<procesy.size();i++) {
            srednie_obliczenie = srednie_obliczenie + procesy.get(i).getProcent_zapelnienia();
        }
        srednie_obliczenie=srednie_obliczenie/procesy.size();
        System.out.println("STRATEGIA 1: ");
        System.out.println("Srednie obciazenie procesow wynosi: "+(double)(Math.round(10*srednie_obliczenie))/10);

        double odchylenie=0;
        for(int i=0;i<procesy.size();i++) {
            odchylenie=odchylenie+Math.abs(srednie_obliczenie-procesy.get(i).getProcent_zapelnienia());
        }
        odchylenie=odchylenie/procesy.size();
        System.out.println("Średnie odchylenie od wartosci dredniej wynosi: "+(double)(Math.round(100*odchylenie))/100);
        System.out.println("Liczba zapytan o migracje wynosi: "+ilosc_zapytan);
        System.out.println("Liczba migracji wynosi: "+ilosc_migracji);
        System.out.println();
    }

}
