package SO_5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MAin {

    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner= new Scanner(System.in);
        ArrayList<proces> procesy=new ArrayList<>();
        ArrayList<proces> procesy_2=new ArrayList<>();
        ArrayList<proces> procesy_3=new ArrayList<>();
        ArrayList<Integer> obciazenia_procesow=new ArrayList<>();
        ArrayList<Integer> numer_procesora=new ArrayList<>();

        System.out.println("Podaj liczbe procesorow");
        int liczba_procesorow=scanner.nextInt();

        System.out.println("Podaj w procentach maksymalny prog obciazenia pojedynczego procesora");
        int prog_obciazenia= scanner.nextInt();

        System.out.println("Podaj liczbe prob przekazania procesu w Strategi I");
        int liczba_prob= scanner.nextInt();

        System.out.println("Podaj minimalny prog dla Strategi III");
        int minimalny_prog= scanner.nextInt();


        System.out.println("Podaj dlugosc serii zadan do wykonania");
        int dlugosc_serii= scanner.nextInt();

        for(int i=0;i<liczba_procesorow;i++)
        {
            procesy.add(new proces(0));
            procesy_2.add(new proces(0));
            procesy_3.add(new proces(0));
        }

        for(int i=0;i<dlugosc_serii;i++)
        {
            int x= random.nextInt(4)+1;  //procentowe obciazenie pojedynczego procesu
            obciazenia_procesow.add(x);
            int y=random.nextInt(liczba_procesorow-1); //numer procesora na ktorym pojawia sie zadanie
            numer_procesora.add(y);
        }
        Strategia_1 strategia_1= new Strategia_1(prog_obciazenia,liczba_prob,obciazenia_procesow,procesy,numer_procesora);
        strategia_1.oblicz();
        Strategia_2 strategia_2=new Strategia_2(prog_obciazenia,obciazenia_procesow,procesy_2,numer_procesora);
        strategia_2.oblicz();
        Strategia_3 strategia_3=new Strategia_3(prog_obciazenia,minimalny_prog,obciazenia_procesow,procesy_3,numer_procesora);
        strategia_3.oblicz();


    }
}
