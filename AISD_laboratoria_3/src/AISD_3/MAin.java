package AISD_3;


import java.util.Iterator;
import java.util.ListIterator;

import java.util.ArrayList;
import java.util.Scanner;
public class MAin{



    public static void main(String[] args)  {
        TwoWayCycledList<Uczen> lista=new TwoWayCycledList<>();
        lista.add(new Uczen(20,"Adam","Kowalski",123456,123456789,"mezczyzna"));
        lista.add(new Uczen(21,"Pawel","Nowak",654321,987654321,"mezczyzna"));
        lista.add(new Uczen(22,"Piotr","Kowalczyk",735653,102030405,"mezczyzna"));
        lista.add(new Uczen(23,"Natalia","Lewandowska",121212,555555555,"kobieta"));
        lista.add(new Uczen(24,"Ewelina","Filipiak",999999,546372819,"kobieta"));
        lista.add(new Uczen(25,"Patrycja","Kubica",501994,471349382,"kobieta"));

        ListIterator<Uczen> iter=lista.listIterator();

        Scanner sc = new Scanner(System.in);
        int Opcja;
        WidokMenu();
        while(sc.hasNext())
        {
            if(lista.size()==0) System.out.println("Tablica jest 0-elementowa!");
            Opcja = sc.nextInt();
            sc.nextLine();
            if (Opcja != 0)
            {

                switch(Opcja)
                {
                    case 1:
                    {
                        for(int i=0;i< lista.size();i++)
                        {
                            System.out.println(lista.get(i));
                        }
                    }
                    break;

                    case 2:
                    {
                        System.out.println("Podaj wiek");
                        int wiek=sc.nextInt();
                        System.out.println("Podaj imie");
                        sc.nextLine();
                        String imie=sc.nextLine();
                        System.out.println("Podaj nazwisko");
                        String nazwisko=sc.nextLine();
                        System.out.println("Podaj nr_indeksu");
                        int nr_indeksu=sc.nextInt();
                        System.out.println("Podaj pesel");
                        int pesel=sc.nextInt();
                        System.out.println("Podaj plec");
                        sc.nextLine();
                        String plec=sc.nextLine();


                        lista.add(new Uczen(wiek,imie,nazwisko,nr_indeksu,pesel,plec));
                    }
                    break;
                    case 3:
                    {
                        System.out.println("Podaj indeks na który chcesz wstawić element");
                        int indeks=sc.nextInt();
                        System.out.println("Podaj wiek");
                        int wiek=sc.nextInt();
                        System.out.println("Podaj imie");
                        sc.nextLine();
                        String imie=sc.nextLine();
                        System.out.println("Podaj nazwisko");
                        String nazwisko=sc.nextLine();
                        System.out.println("Podaj nr_indeksu");
                        int nr_indeksu=sc.nextInt();
                        System.out.println("Podaj pesel");
                        int pesel=sc.nextInt();
                        System.out.println("Podaj plec");
                        sc.nextLine();
                        String plec=sc.nextLine();


                        lista.add(indeks,new Uczen(wiek,imie,nazwisko,nr_indeksu,pesel,plec));
                    }
                    break;
                    case 4:
                    {
                        System.out.println("Podaj indeks elementu, który chcesz usunąć");
                        int indeks=sc.nextInt();
                         lista.remove(indeks);
                    }
                    break;
                    case 5:
                    {
                        System.out.println("Podaj indeks na który chcesz wstawić element");
                        int indeks=sc.nextInt();
                        System.out.println("Podaj wiek");
                        int wiek=sc.nextInt();
                        System.out.println("Podaj imie");
                        sc.nextLine();
                        String imie=sc.nextLine();
                        System.out.println("Podaj nazwisko");
                        String nazwisko=sc.nextLine();
                        System.out.println("Podaj nr_indeksu");
                        int nr_indeksu=sc.nextInt();
                        System.out.println("Podaj pesel");
                        int pesel=sc.nextInt();
                        System.out.println("Podaj plec");
                        sc.nextLine();
                        String plec=sc.nextLine();


                        lista.set(indeks,new Uczen(wiek,imie,nazwisko,nr_indeksu,pesel,plec));
                    }
                    break;

                    case 6:
                    {
                        iter.next();
                    }
                    break;
                    case 7:
                    {
                        iter.previous();
                    }
                    break;
                    case 8:
                    {
                        iter.remove();
                    }
                    break;
                    case 9:
                    {
                        System.out.println("Podaj wiek");
                        int wiek=sc.nextInt();
                        System.out.println("Podaj imie");
                        sc.nextLine();
                        String imie=sc.nextLine();
                        System.out.println("Podaj nazwisko");
                        String nazwisko=sc.nextLine();
                        System.out.println("Podaj nr_indeksu");
                        int nr_indeksu=sc.nextInt();
                        System.out.println("Podaj pesel");
                        int pesel=sc.nextInt();
                        System.out.println("Podaj plec");
                        sc.nextLine();
                        String plec=sc.nextLine();


                        iter.add(new Uczen(wiek,imie,nazwisko,nr_indeksu,pesel,plec));
                    }
                    break;
                    case 10:
                {
                    lista.clear();
                }
                break;
                    case 11:
                    {
                        if (hasCycle(lista)== true)
                        {
                            System.out.println("Lista jest cykliczna");
                        }
                        else
                        {
                            System.out.println("Lista nie jest cykliczna");
                        }
                    }
                    break;
                    default:
                    {
                        System.out.println("Brak wyboru");
                        break;
                    }

                }
                WidokMenu();
            }
            else
                break;
        }

    }

    public static void WidokMenu()
    {
        System.out.println("Menu : ");
        System.out.println("1 : Wyświetlanie listy");
        System.out.println("2 : Dodawanie elementu na koniec listy");
        System.out.println("3 : Dodawanie elementu na podany indeks");
        System.out.println("4 : Usuniecie elementu po indeksie");
        System.out.println("5 : Ustawianie wartości po indeksie");
        System.out.println("6 : Przejście do przodu do kolejnego elementu tablicy");
        System.out.println("7 : Przejście do poprzedniego elementu tablicy");
        System.out.println("8 : Usuniecie elementu na którym stoi iterator");
        System.out.println("9 : Dodanie elementu na ktorym stoi iterator");
        System.out.println("10: Wyczyszczenie listy");
        System.out.println("11: Sprawdzanie czy lista jest cykliczna");
        System.out.println("0 : Wyjście");
    }

    public static boolean hasCycle(TwoWayCycledList<Uczen> lista)
    { ListIterator<Uczen> iter=lista.listIterator();
        Object x=iter.next();
        for(int i=0;i< lista.size();i++)
        {
            iter.next();
        }
        if(x == iter.next()) return true;
        return false;
    }
}
