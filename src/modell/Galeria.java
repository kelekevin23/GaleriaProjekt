package modell;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Galeria implements Iterable<KiallitasiTargy> {

    private ArrayList<KiallitasiTargy> targyak;

    public Galeria() {
        targyak = new ArrayList<>();
    }

    public List<KiallitasiTargy> getModosithatatlan() {
        return Collections.unmodifiableList(targyak);
    }

    public void felvesz(Festmeny ujFestmeny) throws GaleriaException {
        if (Integer.parseInt(ujFestmeny.getDatum().toString()) > Integer.parseInt(LocalDate.now().toString())) {
            throw new GaleriaException("Nem lehet későbbi dátum!");
        } else {
            targyak.add(ujFestmeny);
        }

    }

    public void megjelenit(String utvonal) {
        Path path = Paths.get(utvonal);
        if (Files.exists(path)) {
            System.out.println("megjelenítés folyamatban...");
        } else {
            System.out.println("nem lehet megjeleníteni");
        }
    }

    @Override
    public Iterator<KiallitasiTargy> iterator() {
        return getModosithatatlan().iterator();
    }

    @Override
    public String toString() {
        return "Galeria{" + "targyak=" + targyak + '}';
    }

}
