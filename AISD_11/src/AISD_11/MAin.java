package AISD_11;


import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.Scanner;

public class MAin {
    public static void Menu()
    {
        System.out.println("1: Przechowywanie przez macierz sasiedztwa");
        System.out.println("2: Przechowywanie przez liste sasiedztwa");
        System.out.println("3: Przechowywanie przez macierz incydencji");
    }
    public static void Opcje()
    {
        System.out.println("1: Usuwanie wierzcholka ");
        System.out.println("2: Usuwanie polaczenia");
        System.out.println("3: Dodawanie wierzcholka");
        System.out.println("4: Dodawanie polaczenia");
        System.out.println("5: Dijkstry");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Wybierz sposob przechowywania grafu");
        Menu();
        int x=scanner.nextInt();
        Graf graf=new Graf(x);

        int Opcja;
        Opcje();
        while (scanner.hasNext()) {
            Opcja = scanner.nextInt();
            scanner.nextLine();

            switch (Opcja) {
                case 1: {
                    graf.Usuwanie_wierzcholka(x);
                }
                break;
                case 2: {
                    graf.Usuwanie_polaczenia(x);
                }
                break;
                case 3: {
                    graf.Dodawanie_wierzcholka(x);
                }
                break;
                case 4: {
                    graf.Dodawanie_polaczenia(x);
                }
                break;
                case 5: {
                    graf.Dijkstry(x);
                }
                break;

                default:

            }
            Opcje();
        }
    }
}
