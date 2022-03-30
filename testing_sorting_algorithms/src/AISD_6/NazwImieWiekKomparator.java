package AISD_6;

import java.util.Comparator;

public class NazwImieWiekKomparator implements Comparator<Osoba> {


    @Override
    public int compare(Osoba o1, Osoba o2) {
        int result=o1.getNazwisko().compareTo(o2.getNazwisko());
        if(result==0){
            result=o1.getImie().compareTo(o2.getImie());
            if(result==0)
            {
                return (o1.getWiek()-o2.getWiek());
            }
        }
        return result;
    }

}