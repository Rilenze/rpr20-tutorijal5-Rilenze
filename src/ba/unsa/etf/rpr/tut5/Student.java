package ba.unsa.etf.rpr.tut5;

import java.util.ArrayList;

public class Student {
    private String imeStudenta;
    private ArrayList<Predmet> upisaniPredmeti;

    public Student(String imeStudenta) {
        this.imeStudenta = imeStudenta;
        upisaniPredmeti = new ArrayList<>();
    }
    public void dodajUpisaniPredmet(Predmet p) {
        upisaniPredmeti.add(p);
    }
}
