package modell;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public abstract class KiallitasiTargy {

    private static CimComparator rendezCim() {
        return new CimComparator();
    }

    private static KeszitoComparator rendezKeszito() {
        return new KeszitoComparator();
    }

    private Date datum;
    private String keszito, cim;
    private SimpleDateFormat formatter;

    public KiallitasiTargy(String keszito, String cim) throws ParseException {
        this(keszito, cim, LocalDate.now().toString());
    }

    public KiallitasiTargy(String keszito, String cim, String datum) throws ParseException {
        this.keszito = keszito;
        this.cim = cim;
        this.formatter = new SimpleDateFormat("yyyy-MM-dd");
        this.datum = formatter.parse(datum);
    }

    public String getKeszito() {
        return keszito;
    }

    public String getCim() {
        return cim;
    }

    public Date getDatum() {
        return datum;
    }

    @Override
    public String toString() {
        return "KiallitasiTargy{" + "keszito=" + keszito + ", cim=" + cim + ", datum= " + datum + "}";
    }

}
