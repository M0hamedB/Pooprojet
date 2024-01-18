// Manager.java
package employes.mr;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employe {
    private List<Employe> sousEmployes;

    public Manager(String nom, int age, int idEmploye) {
        super(nom, age, idEmploye);
        this.sousEmployes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        sousEmployes.add(employe);
    }

    public void afficherEmployes() {
        System.out.println("Sous-employés du manager " + nom + ":");
        for (Employe employe : sousEmployes) {
            System.out.println(employe.toString());
        }
    }
}
