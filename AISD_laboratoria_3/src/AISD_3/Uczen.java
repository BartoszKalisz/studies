package AISD_3;

public class Uczen {
    private int wiek;
    private String imie;
    private String nazwisko;
    private int numer_indeksu;
    private int pesel;
    private String plec;

    public Uczen(int wiek, String imie, String nazwisko, int numer_indeksu, int pesel, String plec) {
        this.wiek = wiek;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_indeksu = numer_indeksu;
        this.pesel = pesel;
        this.plec = plec;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNumer_indeksu() {
        return numer_indeksu;
    }

    public void setNumer_indeksu(int numer_indeksu) {
        this.numer_indeksu = numer_indeksu;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    @Override
    public String toString() {

        return "Uczen{" +
                "wiek=" + wiek +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numer_indeksu=" + numer_indeksu +
                ", pesel=" + pesel +
                ", plec='" + plec + '\'' +
                '}'+'\t';

    }
    public boolean equals(Uczen uczen) {
        return numer_indeksu == uczen.numer_indeksu;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return equals((Uczen) obj);
    }
}