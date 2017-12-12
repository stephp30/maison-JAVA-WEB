package co.simplon.maison.resa;


public class MaisonResa {

	private String nom;
	private String prenom;
	private String telephone;
	private String mail;
	private String date;
	private String nbNuitee;	
	private String nbPersonne;	
	private String region;
	private String animal;
	private String parking;
	private String fumeur;
	private String sejour;
	
	
	
	public MaisonResa(String nom, String prenom, String telephone, String mail, String date, String nbNuitee,
			String nbPersonne, String region, String animal, String parking, String fumeur, String sejour) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.mail = mail;
		this.date = date;
		this.nbNuitee = nbNuitee;
		this.nbPersonne = nbPersonne;
		this.region = region;
		this.animal = animal;
		this.parking = parking;
		this.fumeur = fumeur;
		this.sejour = sejour;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNbNuitee() {
		return nbNuitee;
	}

	public void setNbNuitee(String nbNuitee) {
		this.nbNuitee = nbNuitee;
	}

	public String getNbPersonne() {
		return nbPersonne;
	}

	public void setNbPersonne(String nbPersonne) {
		this.nbPersonne = nbPersonne;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getFumeur() {
		return fumeur;
	}

	public void setFumeur(String fumeur) {
		this.fumeur = fumeur;
	}

	public String getSejour() {
		return sejour;
	}

	public void setSejour(String sejour) {
		this.sejour = sejour;
	}

	

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}



