// Entreprise.java
package employes.mr;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
    private List<Employe> employes;

    public Entreprise() {
        this.employes = new ArrayList<>();
    }

    public void embaucherEmploye(Employe employe) {
        employes.add(employe);
    }

    public void afficherDetailsEmployes() {
        System.out.println("Détails des employés de l'entreprise:");
        for (Employe employe : employes) {
            System.out.println(employe.toString());
        }
    }

    public void faireTravaillerEmployes() {
        System.out.println("Les employés de l'entreprise sont en train de travailler:");
        for (Employe employe : employes) {
            employe.travailler();
        }
    }
}
