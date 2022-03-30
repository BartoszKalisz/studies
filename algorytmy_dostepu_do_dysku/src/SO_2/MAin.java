package SO_2;
import java.util.ArrayList;
import java.util.Random;
public class MAin {

    public static void main(String[] args) {

        int pozycja,moment_przybycia,x;
        ArrayList<zgloszenie> pomocnicza=new ArrayList<>();
        ArrayList<zgloszenie> pomocnicza_2=new ArrayList<>();
        ArrayList<zgloszenie> pomocnicza_3=new ArrayList<>();
        ArrayList<Integer> wynikowa=new ArrayList<>();
        ArrayList<Integer> wynikowa_2=new ArrayList<>();
        ArrayList<Integer> wynikowa_3=new ArrayList<>();
        Random generator = new Random();

        x = generator.nextInt(170)+30;
        pomocnicza.add(new zgloszenie(0, x, 0));


        for(int i=1;i<10;i++)
        {
            pozycja = generator.nextInt(200); //maksymalna wielkosc
            moment_przybycia  = generator.nextInt(x);
            pomocnicza.add(new zgloszenie(i, pozycja, moment_przybycia));

        }

        System.out.println("FCFS dla 10 zlecen: ");
        FCFS fcfs=new FCFS(pomocnicza,wynikowa,10);
        fcfs.oblicz();
        System.out.println("SSTF dla 10 zlecen: ");
        SSTF sstf= new SSTF(pomocnicza,wynikowa,10);
        sstf.oblicz();
        System.out.println("SCAN dla 10 zlecen: ");
        SCAN scan=new SCAN(pomocnicza,wynikowa,10);
        scan.oblicz();
        System.out.println("C_SCAN dla 10 zlecen: ");
        C_SCAN c_scan=new C_SCAN(pomocnicza,wynikowa,10);
        c_scan.oblicz();
        System.out.println("EDF dla 10 zlecen: ");
        EDF edf=new EDF(pomocnicza,wynikowa,10);
        edf.oblicz();
        System.out.println("FD_SCAN dla 10 zlecen: ");
        FD_SCAN fd_scan= new FD_SCAN(pomocnicza,wynikowa,10);
        fd_scan.oblicz();

        System.out.println();
        System.out.println();
        for(int i=0;i<wynikowa.size();i=i+2)
        {  if(i==0) System.out.println("FCFS dla 10 zlecen: ");
        else if (i==2) System.out.println("SSTF dla 10 zlecen: ");
        else if(i==4) System.out.println("SCAN dla 10 zlecen: ");
        else if (i==6) System.out.println("C_SCAN dla 10 zlecen: ");
        else if (i==8) System.out.println("EDF dla 10 zlecen: ");
        else System.out.println("FD_SCAN dla 10 zlecen: ");
            System.out.println("Laczne przemieszczenie glowicy: "+ wynikowa.get(i)+ " Sredni czas czekania: "+wynikowa.get(i+1));
        }
        System.out.println();
        System.out.println();
        x = generator.nextInt(170)+30;
        pomocnicza_2.add(new zgloszenie(0, x, 0));


        for(int i=1;i<5;i++)
        {
            pozycja = generator.nextInt(200); //maksymalna wielkosc
            moment_przybycia  = generator.nextInt(x);
            pomocnicza_2.add(new zgloszenie(i, pozycja, moment_przybycia));

        }

        System.out.println("FCFS dla 5 zlecen: ");
        FCFS fcfs_2=new FCFS(pomocnicza_2,wynikowa_2,5);
        fcfs_2.oblicz();
        System.out.println("SSTF dla 5 zlecen: ");
        SSTF sstf_2= new SSTF(pomocnicza_2,wynikowa_2,5);
        sstf_2.oblicz();
        System.out.println("SCAN dla 5 zlecen: ");
        SCAN scan_2=new SCAN(pomocnicza_2,wynikowa_2,5);
        scan_2.oblicz();
        System.out.println("C_SCAN dla 5 zlecen: ");
        C_SCAN c_scan_2=new C_SCAN(pomocnicza_2,wynikowa_2,5);
        c_scan_2.oblicz();
        System.out.println("EDF dla 5 zlecen: ");
        EDF edf_2=new EDF(pomocnicza_2,wynikowa_2,5);
        edf_2.oblicz();
        System.out.println("FD_SCAN dla 5 zlecen: ");
        FD_SCAN fd_scan_2= new FD_SCAN(pomocnicza_2,wynikowa_2,5);
        fd_scan_2.oblicz();

        System.out.println();
        System.out.println();
        for(int i=0;i<wynikowa.size();i=i+2)
        {  if(i==0) System.out.println("FCFS dla 5 zlecen: ");
        else if (i==2) System.out.println("SSTF dla 5 zlecen: ");
        else if(i==4) System.out.println("SCAN dla 5 zlecen: ");
        else if (i==6) System.out.println("C_SCAN dla 5 zlecen: ");
        else if (i==8) System.out.println("EDF dla 5 zlecen: ");
        else System.out.println("FD_SCAN dla 5 zlecen: ");
            System.out.println("Laczne przemieszczenie glowicy: "+ wynikowa_2.get(i)+ " Sredni czas czekania: "+wynikowa_2.get(i+1));
        }
        System.out.println();
        System.out.println();
        x = generator.nextInt(170)+30;
        pomocnicza_3.add(new zgloszenie(0, x, 0));


        for(int i=1;i<20;i++)
        {
            pozycja = generator.nextInt(200); //maksymalna wielkosc
            moment_przybycia  = generator.nextInt(x);
            pomocnicza_3.add(new zgloszenie(i, pozycja, moment_przybycia));

        }

        System.out.println("FCFS dla 20 zlecen: ");
        FCFS fcfs_3=new FCFS(pomocnicza_3,wynikowa_3,20);
        fcfs_3.oblicz();
        System.out.println("SSTF dla 20 zlecen: ");
        SSTF sstf_3= new SSTF(pomocnicza_3,wynikowa_3,20);
        sstf_3.oblicz();
        System.out.println("SCAN dla 20 zlecen: ");
        SCAN scan_3=new SCAN(pomocnicza_3,wynikowa_3,20);
        scan_3.oblicz();
        System.out.println("C_SCAN dla 20 zlecen: ");
        C_SCAN c_scan_3=new C_SCAN(pomocnicza_3,wynikowa_3,20);
        c_scan_3.oblicz();
        System.out.println("EDF dla 20 zlecen: ");
        EDF edf_3=new EDF(pomocnicza_3,wynikowa_3,10);
        edf_3.oblicz();
        System.out.println("FD_SCAN dla 20 zlecen: ");
        FD_SCAN fd_scan_3= new FD_SCAN(pomocnicza_3,wynikowa_3,20);
        fd_scan_3.oblicz();

        System.out.println();
        System.out.println();
        for(int i=0;i<wynikowa.size();i=i+2)
        {  if(i==0) System.out.println("FCFS dla 20 zlecen: ");
        else if (i==2) System.out.println("SSTF dla 20 zlecen: ");
        else if(i==4) System.out.println("SCAN dla 20 zlecen: ");
        else if (i==6) System.out.println("C_SCAN dla 20 zlecen: ");
        else if (i==8) System.out.println("EDF dla 20 zlecen: ");
        else System.out.println("FD_SCAN dla 20 zlecen: ");
            System.out.println("Laczne przemieszczenie glowicy: "+ wynikowa_3.get(i)+ " Sredni czas czekania: "+wynikowa_3.get(i+1));
        }
    }

}
