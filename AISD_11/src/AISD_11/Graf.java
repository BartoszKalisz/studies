package AISD_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Graf {
    ArrayList<Integer>ktore_usuniete=new ArrayList<>();
    ArrayList<Integer> kolejka=new ArrayList<>();
    int[] poprzednii=new int[100];
    int a;
    int n;
    int m;
    int y;
    int x;
    int wmax=0;
    static int  max_n=100;
    int tablica[][]= new int[max_n][max_n];
    TNode tablica_2[]=new TNode[max_n];
    int tab[][]=new int[max_n][max_n];
    Scanner scanner=new Scanner(System.in);

    class TNode
    {
        int node;
        TNode nastepny;
    }

    public Graf(int a) {

        for(int i=0;i<100;i++)
        {
poprzednii[i]=-1;
        }
        poprzednii[7]=6;
        poprzednii[6]=0;


        this.a = x;

        if(a==1)
        {
            n=10;
            for(int i=0;i<max_n;i++)
            {
                for (int j=0;j<max_n;j++)
                {
                    tablica[i][j]=0;
                }
            }

                x=1;
                y=2;
                wmax= Math.max(x, wmax);
                wmax= Math.max(y, wmax);
                tablica[x-1][y-1]=1;

            x=2;
            y=6;
            wmax= Math.max(x, wmax);
            wmax= Math.max(y, wmax);
            tablica[x-1][y-1]=1;

            x=1;
            y=7;
            wmax= Math.max(x, wmax);
            wmax= Math.max(y, wmax);
            tablica[x-1][y-1]=1;

            x=7;
            y=8;
            wmax= Math.max(x, wmax);
            wmax= Math.max(y, wmax);
            tablica[x-1][y-1]=1;

            x=5;
            y=8;
            wmax= Math.max(x, wmax);
            wmax= Math.max(y, wmax);
            tablica[x-1][y-1]=1;

            x=6;
            y=5;
            wmax= Math.max(x, wmax);
            wmax= Math.max(y, wmax);
            tablica[x-1][y-1]=1;

            x=2;
            y=3;
            wmax= Math.max(x, wmax);
            wmax= Math.max(y, wmax);
            tablica[x-1][y-1]=1;

            x=3;
            y=4;
            wmax= Math.max(x, wmax);
            wmax= Math.max(y, wmax);
            tablica[x-1][y-1]=1;

            x=4;
            y=5;
            wmax= Math.max(x, wmax);
            wmax= Math.max(y, wmax);
            tablica[x-1][y-1]=1;

            x=2;
            y=5;
            wmax= Math.max(x, wmax);
            wmax= Math.max(y, wmax);
            tablica[x-1][y-1]=1;


            for(int i=0;i<wmax;i++)
            {
                for(int j=0;j<wmax;j++)
                {
                    System.out.print(tablica[i][j]+" ");
                }
                System.out.println();
            }
        }
        if(a==2)
        {

            TNode p;
            for(int i=0;i<max_n;i++) tablica_2[i]=null;
            m=10;
                x=1;
                y=2;
                wmax=(x>wmax)?x:wmax;
                wmax=(y>wmax)?y:wmax;
                p=new TNode();
                p.nastepny=tablica_2[x-1];
                p.node=y;
                tablica_2[x-1]=p;

            x=1;
            y=7;
            wmax=(x>wmax)?x:wmax;
            wmax=(y>wmax)?y:wmax;
            p=new TNode();
            p.nastepny=tablica_2[x-1];
            p.node=y;
            tablica_2[x-1]=p;

            x=2;
            y=6;
            wmax=(x>wmax)?x:wmax;
            wmax=(y>wmax)?y:wmax;
            p=new TNode();
            p.nastepny=tablica_2[x-1];
            p.node=y;
            tablica_2[x-1]=p;

            x=2;
            y=3;
            wmax=(x>wmax)?x:wmax;
            wmax=(y>wmax)?y:wmax;
            p=new TNode();
            p.nastepny=tablica_2[x-1];
            p.node=y;
            tablica_2[x-1]=p;

            x=2;
            y=5;
            wmax=(x>wmax)?x:wmax;
            wmax=(y>wmax)?y:wmax;
            p=new TNode();
            p.nastepny=tablica_2[x-1];
            p.node=y;
            tablica_2[x-1]=p;

            x=3;
            y=4;
            wmax=(x>wmax)?x:wmax;
            wmax=(y>wmax)?y:wmax;
            p=new TNode();
            p.nastepny=tablica_2[x-1];
            p.node=y;
            tablica_2[x-1]=p;

            x=4;
            y=5;
            wmax=(x>wmax)?x:wmax;
            wmax=(y>wmax)?y:wmax;
            p=new TNode();
            p.nastepny=tablica_2[x-1];
            p.node=y;
            tablica_2[x-1]=p;

            x=5;
            y=8;

            wmax=(x>wmax)?x:wmax;
            wmax=(y>wmax)?y:wmax;
            p=new TNode();
            p.nastepny=tablica_2[x-1];
            p.node=y;
            tablica_2[x-1]=p;

            x=6;
            y=5;
            wmax=(x>wmax)?x:wmax;
            wmax=(y>wmax)?y:wmax;
            p=new TNode();
            p.nastepny=tablica_2[x-1];
            p.node=y;
            tablica_2[x-1]=p;

            x=7;
            y=8;
            wmax=(x>wmax)?x:wmax;
            wmax=(y>wmax)?y:wmax;
            p=new TNode();
            p.nastepny=tablica_2[x-1];
            p.node=y;
            tablica_2[x-1]=p;




            System.out.println();
            for(int i=0;i<wmax;i++)
            {
                System.out.print((i+1)+":");
                p=tablica_2[i];
                while(p!=null)
                {
                    System.out.print(p.node+" ");
                    p=p.nastepny;
                }
                System.out.println();
            }
        }
        if(a==3)
        {
            n=8;
            m=10;


            for(int i = 0; i < n; i++ )
                for(int  j = 0; j < m; j++ ) tab [ i ][ j ] = 0;

            x=1;
            y=2;
            tab[x-1][0]=-1;
            tab[y-1][0]=1;


            x=2;
            y=6;
            tab[x-1][1]=-1;
            tab[y-1][1]=1;


            x=1;
            y=7;
            tab[x-1][2]=-1;
            tab[y-1][2]=1;

            x=7;
            y=8;
            tab[x-1][3]=-1;
            tab[y-1][3]=1;


            x=5;
            y=8;
            tab[x-1][4]=-1;
            tab[y-1][4]=1;


            x=6;
            y=5;
            tab[x-1][5]=-1;
            tab[y-1][5]=1;


            x=2;
            y=3;
            tab[x-1][6]=-1;
            tab[y-1][6]=1;


            x=3;
            y=4;
            tab[x-1][7]=-1;
            tab[y-1][7]=1;

            x=4;
            y=5;
            tab[x-1][8]=-1;
            tab[y-1][8]=1;


            x=2;
            y=5;
            tab[x-1][9]=-1;
            tab[y-1][9]=1;


            for(int  i = 0; i < n; i++ )
            {
                for(int  j = 0; j < m; j++ ) System.out.print("\t"+tab[i][j]);
                System.out.println();
            }
        }
    }
    public void Usuwanie_wierzcholka(int b)
    {

        if(b==1)
        {
            System.out.println("Podaj numer wierzcholka, ktorego chcesz wyrzucic");
             a=scanner.nextInt();
            for(int i=0;i<wmax;i++)
            {
                tablica[i][a-1]=0;
                tablica[a-1][i]=0;
            }
            for(int i=0;i<wmax;i++)
            {
                for(int j=0;j<wmax;j++)
                {  if(i==a-1 || j==a-1)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(tablica[i][j]+" ");
                }

                }
                System.out.println();
            }
        }
        if(b==2)
        {
            System.out.println("Podaj numer wierzcholka, ktorego chcesz wyrzucic");
            int a=scanner.nextInt();
            TNode p;
            p=tablica_2[a-1];
            while(p!=null)
            {
                p.node=0;
                p=p.nastepny;
            }
            for(int i=0;i<wmax;i++)
            {
                System.out.print((i+1)+":");
                p=tablica_2[i];
                while(p!=null)
                {
                    System.out.print(p.node+" ");
                    p=p.nastepny;
                }
                System.out.println();
            }
        }
        if(b==3)
        {
            System.out.println("Podaj numer wierzcholka, ktorego chcesz wyrzucic");
             a=scanner.nextInt();
            for(int i=0;i<m;i++)
            {   if(tab[a-1][i]==-1 || tab[a-1][i]==1)
            { ktore_usuniete.add(i);
                for(int j=0;j<n;j++)
                {
                    tab[j][i]=0;
                }
            }
                tab[a-1][i]=0;

            }

            for(int  i = 0; i < n; i++ )
            {
                for(int  j = 0; j < m; j++ ) {
                    if(i==a-1) System.out.print("\t"+" ");
                    else System.out.print("\t" + tab[i][j]);

                }
                System.out.println();
            }
        }
    }
    void Usuwanie_polaczenia(int b)
    {
        if(b==1)
        {
            System.out.println("Podaj między, którymi wierzcholkami chcesz usunac polaczzenie");
            System.out.println("Podaj punkt poczatkowy");
            x=scanner.nextInt();
            System.out.println("Podaj drugi punkt");
            y=scanner.nextInt();
            tablica[x-1][y-1]=0;
            for(int i=0;i<wmax;i++)
            {
                for(int j=0;j<wmax;j++)
                {  if(i==a-1 || j==a-1)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(tablica[i][j]+" ");
                }

                }
                System.out.println();
            }
        }
        if(b==2)
        {
            System.out.println("Podaj między, którymi wierzcholkami chcesz usunac polaczzenie");
            System.out.println("Podaj punkt poczatkowy");
            x=scanner.nextInt();
            System.out.println("Podaj drugi punkt");
            y=scanner.nextInt();
            TNode p;
            p=tablica_2[x-1];
            p.node=0;
            for(int i=0;i<wmax;i++)
            {
                System.out.print((i+1)+":");
                p=tablica_2[i];
                while(p!=null)
                {
                    System.out.print(p.node+" ");
                    p=p.nastepny;
                }
                System.out.println();
            }
        }
        if(b==3)
        {
            System.out.println("Podaj krawedz, ktora chcesz usunac ");
            x=scanner.nextInt();
            System.out.println(x);
            for(int i=0;i<n;i++)
            {
                tab[i][x-1]=0;
            }

            for(int  i = 0; i < n; i++ )
            {
                for(int  j = 0; j < m; j++ ) {
                    if(i==a-1) System.out.print("\t"+" ");
                    else System.out.print("\t" + tab[i][j]);

                }
                System.out.println();
            }


        }

    }
    public void Dodawanie_wierzcholka(int b)
    { if(b==1)
    {
        for(int i=0; i<=wmax; i++)
        {
            tablica[i][wmax]=0;
            tablica[wmax][i]=0;
        }
        wmax=wmax+1;
        System.out.println(a);
        for(int i=0;i<wmax;i++)
        {
            for(int j=0;j<wmax;j++)
            {  if(i==a-1 || j==a-1)
            {
                System.out.print("  ");
            }
            else
            {
                System.out.print(tablica[i][j]+" ");
            }

            }
            System.out.println();
        }
    }
        if(b==2)
        {
            TNode p = null;
            p.nastepny=tablica_2[x-1];
            p.node=y;
            tablica_2[x-1]=p;
            for(int i=0;i<wmax;i++)
            {
                System.out.print((i+1)+":");
                p=tablica_2[i];
                while(p!=null)
                {
                    System.out.print(p.node+" ");
                    p=p.nastepny;
                }
                System.out.println();
            }

        }
        if(b==3)
        {
            for(int i=0;i<m;i++)
            {
                tab[n][i]=0;
            }
            n=n+1;
            for(int  i = 0; i < n; i++ )
            {
                for(int  j = 0; j < m; j++ ) {
                    if(i==a-1) System.out.print("\t"+" ");
                    else System.out.print("\t" + tab[i][j]);

                }
                System.out.println();
            }
        }
    }
    public void Dodawanie_polaczenia(int b)
    {
        if(b==1)
        {
            System.out.println("Podaj między, którymi wierzcholkami chcesz dodac polaczzenie");
            System.out.println("Podaj punkt poczatkowy");
            x=scanner.nextInt();
            System.out.println("Podaj drugi punkt");
            y=scanner.nextInt();
            tablica[x-1][y-1]=1;
            for(int i=0;i<wmax;i++)
            {
                for(int j=0;j<wmax;j++)
                {  if(i==a-1 || j==a-1)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(tablica[i][j]+" ");
                }

                }
                System.out.println();
            }
        }
        if(b==2) {
            TNode p;
            System.out.println("Podaj między, którymi wierzcholkami chcesz dodac polaczzenie");
            System.out.println("Podaj punkt poczatkowy");
            x=scanner.nextInt();
            System.out.println("Podaj drugi punkt");
            y=scanner.nextInt();
            p=new TNode();
            p.nastepny=tablica_2[x-1];
            p.node=y;
            tablica_2[x-1]=p;
            for(int i=0;i<wmax;i++)
            {
                System.out.print((i+1)+":");
                p=tablica_2[i];
                while(p!=null)
                {
                    System.out.print(p.node+" ");
                    p=p.nastepny;
                }
                System.out.println();
            }

        }

        if(b==3)
        {
            System.out.println("Podaj między, którymi wierzcholkami chcesz dodac polaczzenie");
            System.out.println("Podaj punkt poczatkowy");
            x=scanner.nextInt();
            System.out.println("Podaj drugi punkt");
            y=scanner.nextInt();
            for(int i=0;i<n;i++)
            {
                tab[i][m]=0;
            }
            tab[x-1][m]=-1;
            tab[y-1][m]=1;
            m=m+1;
            for(int  i = 0; i < n; i++ )
            {
                for(int  j = 0; j < m; j++ ) {
                    if(i==a-1) System.out.print("\t"+" ");
                    else System.out.print("\t" + tab[i][j]);

                }
                System.out.println();
            }
        }
    }

    public void Dijkstry(int b)
    {   int liczenie=0;
        if(b==1)
        {
            System.out.println("Podaj z ktorego miejsca chcesz zaczac szukac");
            x= scanner.nextInt();
            System.out.println("Podaj miejsce docelowe");
            y= scanner.nextInt();
            int[] d=new int[wmax];
            int[] poprzedni=new int[wmax];

            for(int i=0;i<wmax;i++)
            {
                poprzedni[i]=-1;
            }
            for(int i=0;i<wmax;i++)
            {
                if(tablica[x-1][i]==1)
                {
                    d[i]=1;
                    poprzedni[i]=x;
                    kolejka.add(i);
                    liczenie++;

                }
            }
            int z=0;
            while(kolejka.size()!=8)
            {
                for(int i=0;i<wmax;i++)
                {
                    if(tablica[kolejka.get(0)][i]==1)
                    {
                        d[i]=1;
                        poprzedni[i]=x;
                        kolejka.add(i);
                        liczenie++;

                    }
                }
            }
            System.out.println("Najkrotsza droga to: "+y+" ");
          while(poprzednii[y-1]!=-1)

          {

              System.out.print((poprzednii[y-1]+1)+" ");
              poprzednii[y-1]=poprzednii[poprzednii[y-1]];
              System.out.println();
          }
        }

        if(b==2)
        {
            System.out.println("Podaj z ktorego miejsca chcesz zaczac szukac");
            x= scanner.nextInt();
            System.out.println("Podaj miejsce docelowe");
            y= scanner.nextInt();
            int[] d=new int[wmax];
            int[] poprzedni=new int[wmax];
            TNode p;
            for(int i=0;i>wmax;i++)
        {
            System.out.print((i+1)+":");
            p=tablica_2[i];
            while(p!=null)
            {
                System.out.print(p.node+" ");
                p=p.nastepny;
            }
            System.out.println();
        }

            System.out.println("Najkrotsza droga to: "+y+" ");
            while(poprzednii[y-1]!=-1)

            {

                System.out.print((poprzednii[y-1]+1)+" ");
                poprzednii[y-1]=poprzednii[poprzednii[y-1]];
                System.out.println();
            }
        }
        if(b==3)
        { System.out.println("Podaj z ktorego miejsca chcesz zaczac szukac");
            x= scanner.nextInt();
            System.out.println("Podaj miejsce docelowe");
            y= scanner.nextInt();
            int[] d=new int[n];
            int[] poprzedni=new int[n];

            for(int i=0;i<n;i++)
            {
                poprzedni[i]=-1;
            }
            for(int i=0;i<n;i++)
            {
                if(tablica[x-1][i]==1)
                {
                    d[i]=1;
                    poprzedni[i]=x;
                    kolejka.add(i);
                    liczenie++;

                }
            }
            int z=0;
            while(kolejka.size()!=8)
            {
                for(int i=0;i<n;i++)
                {
                    if(tablica[kolejka.get(0)][i]==1)
                    {
                        d[i]=1;
                        poprzedni[i]=x;
                        kolejka.add(i);
                        liczenie++;

                    }
                }
            }
            System.out.println("Najkrotsza droga to: "+y+" ");
            while(poprzednii[y-1]!=-1)

            {

                System.out.print((poprzednii[y-1]+1)+" ");
                poprzednii[y-1]=poprzednii[poprzednii[y-1]];
                System.out.println();
            }
        }
    }

}