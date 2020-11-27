package ba.unsa.etf.rpr.tut5;

import java.util.ArrayList;

public class Predmet {
    private String nazivPredmeta;
    private int ECTS;
    private ArrayList<Student> upisaniStudenti;

    public Predmet(String nazivPredmeta, int ECTS) {
        this.nazivPredmeta = nazivPredmeta;
        this.ECTS = ECTS;
        this.upisaniStudenti = new ArrayList<>();
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
    public int getECTS() {
        return ECTS;
    }
    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }
    public ArrayList<Student> getUpisaniStudenti() {
        return upisaniStudenti;
    }
    public void setUpisaniStudenti(ArrayList<Student> upisaniStudenti) {
        this.upisaniStudenti = upisaniStudenti;
    }
    public void upisiPredmet(Student s) {
        upisaniStudenti.add(s);
        s.dodajUpisaniPredmet(this);
    }

    @Override
    public String toString() {
        return "Predmet{" +
                "nazivPredmeta='" + nazivPredmeta + '\'' +
                ", ECTS=" + ECTS +
                '}';
    }
}
