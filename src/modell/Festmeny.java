package modell;

import java.text.ParseException;

public class Festmeny extends KiallitasiTargy {

    public Festmeny(String keszito, String cim) throws ParseException{
        super(keszito, cim);
    }
    
    public Festmeny(String keszito, String cim, String datum) throws ParseException {
        super(keszito, cim, datum);
    }

    
}
