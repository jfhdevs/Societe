
public class Personne {
	private String prenom;
	private String nom;
	private int age;
	
	public Personne (String nom, String prenom) { this.prenom=prenom; this.nom=nom; this.age=0; }
	public Personne (String nom, String prenom, int age) { this.prenom=prenom; this.nom=nom; this.age=age; }

	@Override
	public String toString() {
		String personne = this.prenom + " " + this.nom;
		if (age > 0) personne = personne + " " + age;
		return personne;
	} // toString
	
	public int getAge () { return this.age; }
	public String getNom () { return this.nom; }
	public String getPrenom () { return this.prenom; }
	
	public void setAge (int age) { this.age = age; }
	public void setNom (String nom) { this.nom = nom; }
	public void setPrenom (String prenom) { this.prenom = prenom; }
}
