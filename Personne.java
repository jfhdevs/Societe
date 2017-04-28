
public class Personne {
	public String prenom;
	public String nom;
	public int age;
	
	public Personne (String nom, String prenom) { this.prenom=prenom; this.nom=nom; this.age=0; }
	public Personne (String nom, String prenom, int age) { this.prenom=prenom; this.nom=nom; this.age=age; }

	@Override
	public String toString() {
		String personne = this.prenom + " " + this.nom;
		if (age > 0) personne = personne + " " + age;
		return personne;
	} // toString
}
