package SO_1;

public class proces {
    int numer_procesu;
    double dlugosc_procesu;
    double moment_zgloszenia;

    public proces(int numer_procesu, int dlugosc_procesu, double moment_zgloszenia) {
        this.numer_procesu = numer_procesu;
        this.dlugosc_procesu = dlugosc_procesu;
        this.moment_zgloszenia = moment_zgloszenia;
    }

    public int getNumer_procesu() {
        return numer_procesu;
    }

    public void setNumer_procesu(int numer_procesu) {
        this.numer_procesu = numer_procesu;
    }

    public double getDlugosc_procesu() {
        return dlugosc_procesu;
    }

    public void setDlugosc_procesu(double dlugosc_procesu) {
        this.dlugosc_procesu = dlugosc_procesu;
    }

    public double getMoment_zgloszenia() {
        return moment_zgloszenia;
    }

    public void setMoment_zgloszenia(double moment_zgloszenia) {
        this.moment_zgloszenia = moment_zgloszenia;
    }
}
