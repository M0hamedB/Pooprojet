// Personne.java
package employes.mr;

public class Personne {
	protected String nom;
	protected int age;

	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Nom: " + nom + ", Age: " + age;
	}
}
