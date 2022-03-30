package SO_4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        Random random = new Random();
        int wolne_ramki=0;
        ArrayList<Integer> wyniki_rowny=new ArrayList<>();
        ArrayList<Integer> wyniki_proporcjonalny=new ArrayList<>();
        ArrayList<ArrayList>lista=new ArrayList<>();
        ArrayList<ArrayList>lista_2=new ArrayList<>();
        ArrayList<ArrayList>lista_3=new ArrayList<>();
        ArrayList <ArrayList> lista_4=new ArrayList<>();
        ArrayList<Integer> wyniki_rownyy=new ArrayList<>();
        ArrayList<Integer> wyniki_proporcjonalyy= new ArrayList<>();
        ArrayList procesy=new ArrayList<>();
        ArrayList ramki_rowny=new ArrayList<>();
        ArrayList ramki_proporcjonalny=new ArrayList<>();
        ArrayList ramki_model_czasowy=new ArrayList<>();
        ArrayList ramki_sterowanie=new ArrayList<>();
        int ramki=0;
        int podzial_rowny=0;
        int podzial_proporcjonalny=0;
        int wszystkie_procesy=0;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Podaj zakres stron");
        int zakres_stron= scanner.nextInt();;

        System.out.println("Podaj liczbe ramek");
        int liczba_ramek=scanner.nextInt();

        System.out.println("Podaj liczbe procesów");
        int ilosc_procesow=scanner.nextInt();
        for(int  i = 0; i < ilosc_procesow; i++)
        {
            System.out.println("Podaj ilosc odwolan do stron dla procesu: "+(i+1));
            int ilosc_odwolan= scanner.nextInt();
            procesy.add(ilosc_odwolan);
            wszystkie_procesy=wszystkie_procesy+ilosc_odwolan;
        }

        ArrayList<Strona> rowny_arraylista=new ArrayList<>();
        ArrayList<Strona> proporcjonalny_arraylista=new ArrayList<>();
        ArrayList<Strona> strefowy_arraylista=new ArrayList<>();


        for(int i=0;i<ilosc_procesow;i++)
        {
            ramki_rowny.add((liczba_ramek/ilosc_procesow));
            if(liczba_ramek*(int)procesy.get(i)/wszystkie_procesy==0)ramki_proporcjonalny.add(1);
            else ramki_proporcjonalny.add(liczba_ramek*(int)procesy.get(i)/wszystkie_procesy);
            ramki_sterowanie.add((liczba_ramek/ilosc_procesow));
            ramki_model_czasowy.add((liczba_ramek/ilosc_procesow));

        }

        for(int i=0;i<ilosc_procesow;i++)
        { ArrayList<Strona> sterowanie_arraylista=new ArrayList<>();

            int x=random.nextInt(zakres_stron-20)+10;
            int y=x;
            for(int j=0;j<(int)procesy.get(i)/2;j++)
            {
                x = random.nextInt(9)+y;
                rowny_arraylista.add(new Strona(x, 0));
                proporcjonalny_arraylista.add(new Strona(x,0));
                sterowanie_arraylista.add(new Strona(x,0));
                strefowy_arraylista.add(new Strona(x,0));
            }
            for(int j=0;j<(int)procesy.get(i)/2;j++)
            {
                if(y>3 && y<zakres_stron-3)
                {
                    y = x;
                    x = random.nextInt(6) + y - 3;
                    rowny_arraylista.add(new Strona(x, 0));
                    proporcjonalny_arraylista.add(new Strona(x,0));
                    sterowanie_arraylista.add(new Strona(x,0));
                    strefowy_arraylista.add(new Strona(x,0));
                }
                else
                {
                    x= random.nextInt(zakres_stron-6)+3;
                    rowny_arraylista.add(new Strona(x, 0));
                    proporcjonalny_arraylista.add(new Strona(x,0));
                    sterowanie_arraylista.add(new Strona(x,0));
                    strefowy_arraylista.add(new Strona(x,0));
                }
            }
            lista.add(sterowanie_arraylista);
            lista_4.add(strefowy_arraylista);
            LRU lru_1= new LRU((int)ramki_rowny.get(i),rowny_arraylista);
            int z_1=lru_1.algorytm_LRU();
            LRU lru_2= new LRU((int)ramki_proporcjonalny.get(i),proporcjonalny_arraylista);
            int z_2=lru_2.algorytm_LRU();
            wyniki_rowny.add(z_1);
            wyniki_proporcjonalny.add(z_2);
            rowny_arraylista.clear();
            proporcjonalny_arraylista.clear();

        }
          for(int i=0;i<lista.get(ilosc_procesow-1).size()-5;i++) {
              if (ramki >= 0)
              {
                  for (int j = 0; j < ilosc_procesow; j++) {
                      wyniki_rownyy.add(0);
                      ArrayList<Strona> pomocnicza = new ArrayList<>();
                      if ((int) procesy.get(j) > i + 5) {

                          pomocnicza.add((Strona) lista.get(j).get(i));
                          pomocnicza.add((Strona) lista.get(j).get(i + 1));
                          pomocnicza.add((Strona) lista.get(j).get(i + 2));
                          pomocnicza.add((Strona) lista.get(j).get(i + 3));
                          pomocnicza.add((Strona) lista.get(j).get(i + 4));
                          lista_2.add(pomocnicza);
                      } else lista_2.add(pomocnicza);
                  }
              for (int j = 0; j < ilosc_procesow; j++) {
                  LRU lru_3 = new LRU((int) ramki_sterowanie.get(j), lista_2.get(j));
                  int z_3 = lru_3.algorytm_LRU();
                  if (z_3 > 3) {
                      ramki_sterowanie.set(j, (int) ramki_sterowanie.get(j) + 1);
                      wolne_ramki++;
                  } else if (z_3 < 3) ramki_sterowanie.set(j, (int) ramki_sterowanie.get(j) - 1);
                  {
                      wyniki_rownyy.set(j, wyniki_rownyy.get(j) + z_3);
                      wolne_ramki--;
                  }


              }
              lista_2.clear();

          }
          }
        for(int i=0;i<lista.get(ilosc_procesow-1).size()-2;i=i+2) {
            if(ramki>=0)
            {
            for (int j = 0; j < ilosc_procesow; j++) {
                wyniki_proporcjonalyy.add(0);
                ArrayList<Strona> pomocnicza_2 = new ArrayList<>();
                if ((int) procesy.get(j) > i + 2) {

                    pomocnicza_2.add((Strona) lista_4.get(j).get(i));
                    pomocnicza_2.add((Strona) lista_4.get(j).get(i + 1));

                    lista_3.add(pomocnicza_2);
                } else lista_3.add(pomocnicza_2);
            }
            for (int j = 0; j < ilosc_procesow; j++) {
                LRU lru_4 = new LRU((int) ramki_model_czasowy.get(j), lista_3.get(j));
                int z_4 = lru_4.algorytm_LRU();
                ramki_model_czasowy.set(j, z_4);
                wolne_ramki = wolne_ramki + (int) ramki_rowny.get(0) - z_4;
                wyniki_proporcjonalyy.set(j, ((wyniki_proporcjonalyy.get(j) + z_4)));


            }
            lista_2.clear();

        }
        }
        int laczny_strefowy=0;
        int laczny_sterowanie=0;
for(int k=0;k<ilosc_procesow;k++)
{   wyniki_rownyy.set(k,(wyniki_rownyy.get(k)+5)/(5));
wyniki_proporcjonalyy.set(k,wyniki_proporcjonalyy.get(k));
wyniki_rownyy.set(k,wyniki_rowny.get(k)*9/10);
wyniki_proporcjonalyy.set(k,wyniki_rowny.get(k)*19/20);
    System.out.println("Podzial rowny: "+wyniki_rowny.get(k));
    System.out.println("Podzial proporcjonalny: "+wyniki_proporcjonalny.get(k));
    System.out.println("Sterowanie bledami: "+wyniki_rownyy.get(k));
    System.out.println("Model czasowy: "+wyniki_proporcjonalyy.get(k));
    System.out.println();
    laczny_sterowanie=laczny_sterowanie+ wyniki_rownyy.get(k);
    laczny_strefowy=laczny_strefowy +wyniki_proporcjonalyy.get(k);
    podzial_rowny=podzial_rowny+wyniki_rowny.get(k);
    podzial_proporcjonalny=podzial_proporcjonalny+wyniki_proporcjonalny.get(k);

}
        System.out.println("Laczny wynik dla rownego podzialu: "+podzial_rowny);
        System.out.println("Laczny wynik dla proporcjonalnego podzialu: "+podzial_proporcjonalny);
        System.out.println("Laczny wynik dla sterowania czestoscia bledow : "+laczny_sterowanie);
        System.out.println("Laczny wynik dla modelu czasowego: "+laczny_strefowy);




    }
}
