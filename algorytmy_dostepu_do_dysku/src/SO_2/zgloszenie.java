package SO_2;

public class zgloszenie {
    int numer_procesu;
    int pozycja; //maks 200
    int moment_przybycia;

    public zgloszenie(int numer_procesu, int pozycja, int moment_przybycia) {
        this.numer_procesu = numer_procesu;
        this.pozycja = pozycja;
        this.moment_przybycia = moment_przybycia;
    }

    public int getNumer_procesu() {
        return numer_procesu;
    }

    public void setNumer_procesu(int numer_procesu) {
        this.numer_procesu = numer_procesu;
    }

    public int getPozycja() {
        return pozycja;
    }

    public void setPozycja(int pozycja) {
        this.pozycja = pozycja;
    }

    public int getMoment_przybycia() {
        return moment_przybycia;
    }

    public void setMoment_przybycia(int moment_przybycia) {
        this.moment_przybycia = moment_przybycia;
    }
}
