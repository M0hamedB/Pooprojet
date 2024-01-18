// Stagiaire.java
package employes.mr;

public class Stagiaire extends Employe {
	public Stagiaire(String nom, int age, int idEmploye) {
		super(nom, age, idEmploye);
	}

	@Override
	public void travailler() {
		System.out.println("Le stagiaire " + nom + " travaille.");
	}
}
