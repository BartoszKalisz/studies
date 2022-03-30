package AISD_12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj kwote banknotu, ktory chcesz rozmienic");
        int x=scanner.nextInt();
        System.out.println("Podaj ile roznych monet jest do dyspozycji");
        int y=scanner.nextInt();

        int tablica[]= new int[y];
        int macierz[][]=new int[y+1][x+1];

        for(int i=0;i<y;i++)
        {
            System.out.println("Podaj nominal monety numer: "+(i+1));
            int z= scanner.nextInt();
            tablica[i]=z;
        }

        for(int i=0;i<y+1;i++)
        {
            for(int j=0;j<x+1;j++)
            {
                if(j==0 ) macierz[i][j]=1;
                 else macierz[i][j]=0;
            }
        }

       for(int i=1;i<y+1;i++)
       {   for(int j=1;j<tablica[i-1];j++)
           {
               macierz[i][j]=macierz[i-1][j];
           }
           for(int j=tablica[i-1];j<x+1;j++)
           {
               macierz[i][j]=macierz[i-1][j]+macierz[i][j-tablica[i-1]];
           }
       }

        for(int i=1;i<y+1;i++)
        {
            for(int j=1;j<x+1;j++)
            {
                System.out.print(macierz[i][j]+"\t");

            }
            System.out.println();
        }
        System.out.println("Jest "+macierz[y][x]+" możliwosci rozmieniena");
    }
}
