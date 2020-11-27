package ba.unsa.etf.rpr.tut5;

import java.util.ArrayList;
import java.util.Scanner;

public class Semestar {
    private ArrayList<ObavezniPredmet> obavezniPredmeti;
    private ArrayList<IzborniPredmet> izborniPredmeti;

    public Semestar() {
        obavezniPredmeti = new ArrayList<>();
        izborniPredmeti = new ArrayList<>();
    }

    public void upisiStudenta(Student s) {
        int sumaECTS = 0;
        for (int i=0; i<obavezniPredmeti.size(); i++) {
            obavezniPredmeti.get(i).upisiPredmet(s);
            sumaECTS += obavezniPredmeti.get(i).getECTS();
        }
        if (sumaECTS < 30) {
            for (int i=0; i<izborniPredmeti.size(); i++) {
                System.out.println(i+1 +  izborniPredmeti.get(i).toString());
            }
        }
        for (int i=0; i<izborniPredmeti.size(); i++) {
            System.out.println("Unesite redni broj izbornog predmeta ili -1 za kraj upisa.");
            int izbor;
            Scanner ulaz = new Scanner(System.in);
            izbor = ulaz.nextInt();
            if (izbor == -1 && sumaECTS < 30) {
                System.out.println("Nemate dovoljno ECTS bodova!");
            }
            if (izbor == -1 && sumaECTS >= 30) {
                System.out.println("Uspjesno ste upisali semestar!");
                break;
            }
            izborniPredmeti.get(izbor-1).upisiPredmet(s);
            s.dodajUpisaniPredmet(izborniPredmeti.get(izbor-1));
            sumaECTS += izborniPredmeti.get(izbor-1).getECTS();
        }
    }
}
