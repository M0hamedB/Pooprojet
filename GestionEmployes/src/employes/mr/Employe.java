// Employe.java
package employes.mr;

public class Employe extends Personne implements Travaillable {
	private int idEmploye;

	public Employe(String nom, int age, int idEmploye) {
		super(nom, age);
		this.idEmploye = idEmploye;
	}

	@Override
	public void travailler() {
		System.out.println("L'employé " + nom + " travaille.");
	}

	@Override
	public String toString() {
		return super.toString() + ", ID Employé: " + idEmploye;
	}
}
