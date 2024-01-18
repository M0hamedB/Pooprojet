// TestEmploye.java
package employes.mr;

public class TestEmploye {
    public static void main(String[] args) {
        // Instanciation d'un objet Manager
        Manager manager = new Manager("Mounir Moctar", 40, 1);

        // Ajout de sous-employés au Manager
        Employe employe1 = new Employe("Amadou Sy", 25, 2);
        Employe employe2 = new Employe("Mohamed", 30, 3);
        manager.ajouterEmploye(employe1);
        manager.ajouterEmploye(employe2);

        // Affichage des sous-employés du Manager
        manager.afficherEmployes();

        // Instanciation d'un objet Stagiaire
        Stagiaire stagiaire = new Stagiaire("Evangelyne", 22, 4);

        // Appel de la méthode travailler() pour le Stagiaire
        stagiaire.travailler();

        // Instanciation d'un objet Entreprise
        Entreprise entreprise = new Entreprise();

        // Embauche d'employés dans l'entreprise
        entreprise.embaucherEmploye(employe1);
        entreprise.embaucherEmploye(employe2);
        entreprise.embaucherEmploye(stagiaire);

        // Affichage des détails des employés de l'entreprise
        entreprise.afficherDetailsEmployes();

        // Utilisation du polymorphisme pour faire travailler les employés de l'entreprise
        entreprise.faireTravaillerEmployes();
    }
}
