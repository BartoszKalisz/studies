package SO_4;

public class Strona {
    public int numer_strony;
    public int bit_odwołania;


    public Strona(int numer_strony, int bit_odwołania) {
        this.numer_strony = numer_strony;
        this.bit_odwołania = bit_odwołania;
    }

    public int getBit_odwołania() {
        return bit_odwołania;
    }

    public void setBit_odwołania(int bit_odwołania) {
        this.bit_odwołania = bit_odwołania;
    }

    public int getNumer_strony() {
        return numer_strony;
    }

    public void setNumer_strony(int numer_strony) {
        this.numer_strony = numer_strony;
    }
}
