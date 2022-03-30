package SO_1;

import java.util.ArrayList;
import java.util.Random;

public class MAin {

    public static void main(String[] args) {
        Random generator = new Random();
        int x;
        ArrayList<proces> procesy=new ArrayList<>();

        ArrayList<Double> pomocnicza= new ArrayList<>();

        // Zakladamy ze moment zgloszenia pierwszego procesu wynosi 0 i trwa 10

        procesy.add(new proces(1,1,2.1));
        procesy.add(new proces(2,1,8.8));
        procesy.add(new proces(3,2,5.5));
        procesy.add(new proces(4,2,6.0));
        procesy.add(new proces(5,3,4.8));
        procesy.add(new proces(6,3,7.5));
        procesy.add(new proces(7,4,3.3));
        procesy.add(new proces(8,4,8.9));
        procesy.add(new proces(9,5,2.4));
        procesy.add(new proces(10,5,9.1));
        procesy.add(new proces(11,6,1.5));
        procesy.add(new proces(12,6,10.0));
        procesy.add(new proces(13,7,5.3));
        procesy.add(new proces(14,7,5.7));
        procesy.add(new proces(15,8,6.6));
        procesy.add(new proces(16,8,4.2));
        procesy.add(new proces(17,9,1.6));
        procesy.add(new proces(18,9,9.8));
        procesy.add(new proces(19,10,7.0));
        procesy.add(new proces(20,10,5.9));
        procesy.add(new proces(21,11,3.4));
        procesy.add(new proces(22,11,8.0));
        procesy.add(new proces(23,12,6.7));
        procesy.add(new proces(24,12,4.9));
        procesy.add(new proces(25,13,2.7));
        procesy.add(new proces(26,13,0.7));
        procesy.add(new proces(27,14,8.1));
        procesy.add(new proces(28,14,8.2));
        procesy.add(new proces(29,15,1.4));
        procesy.add(new proces(30,15,2.9));
        procesy.add(new proces(31,16,3.6));
        procesy.add(new proces(32,16,5.1));
        procesy.add(new proces(33,17,0.9));
        procesy.add(new proces(34,17,1.3));
        procesy.add(new proces(35,18,9.4));
        procesy.add(new proces(36,18,4.4));
        procesy.add(new proces(37,19,5.4));
        procesy.add(new proces(38,19,7.4));
        procesy.add(new proces(39,20,2.5));
        procesy.add(new proces(40,20,6.3));



        for(int i=0;i<50;i++)
        {
            for(int j=0;j<5;j++)
            {   x= generator.nextInt(40);
                pomocnicza.add(procesy.get(x).moment_zgloszenia);
                pomocnicza.add(procesy.get(x).dlugosc_procesu);
            }
            FCFS fcfs=new FCFS(pomocnicza);
            SJF_bez sjf_bez= new SJF_bez(pomocnicza);
            SJF_z sjf_z=new SJF_z(pomocnicza);
            rotacyjny rotacyjnyy=new rotacyjny(pomocnicza);
            System.out.println("Sredni czas dla  FCFS :"+fcfs.oblicz()+"\t"+"rotacyjny: "+rotacyjnyy.oblicz()+"\t"+"SJF_bez: "+sjf_bez.oblicz()+"\t"+"SJF_z: "+sjf_z.oblicz());//+"\t"+"rotacyjny: "+fcfs.oblicz());
            pomocnicza.clear();
        }

    }

}
