package co.simplon.maison.resa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class MaisonResa {

	private String nom;
	private String prenom;
	private String telephone;
	private String mail;
	private String date;
	private int nbNuitee;	
	private int nbPersonne;	
	private String region;
	private boolean animal;
	private boolean parking;
	private boolean fumeur;
	private String sejour;
	
	
	
	public MaisonResa(String nom, String prenom, String telephone, String mail, String date, int nbNuitee,
			int nbPersonne, String region, boolean animal, boolean parking, boolean fumeur, String sejour) {
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

	public int getNbNuitee() {
		return nbNuitee;
	}

	public void setNbNuitee(int nbNuitee) {
		this.nbNuitee = nbNuitee;
	}

	public int getNbPersonne() {
		return nbPersonne;
	}

	public void setNbPersonne(int nbPersonne) {
		this.nbPersonne = nbPersonne;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public boolean getAnimal() {
		return animal;
	}
	
	public String getAnimalStr() {
		String animalStr;
		if (this.animal == true){
			animalStr = "oui";
		}
		else animalStr = "non";
		return animalStr;
	}

	public void setAnimal(boolean animal) {
		this.animal = animal;
	}

	public boolean getParking() {
		return parking;
	}
	
	public String getParkingStr() {
		String parkingStr;
		if (this.parking == true){
			parkingStr = "oui";
		}
		else parkingStr = "non";
		return parkingStr;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean getFumeur() {
		return fumeur;
	}
	
	public String getFumeurStr() {
		String fumeurStr;
		if (this.fumeur == true){
			fumeurStr = "oui";
		}
		else fumeurStr = "non";
		return fumeurStr;
	}

	public void setFumeur(boolean fumeur) {
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
	
	
	public Date getDateTime() throws ParseException {
		DateFormat format = new SimpleDateFormat("d/mm/yyyy", Locale.FRANCE);
		Date dateTime = format.parse(this.date);
		return dateTime;
	}
	
	
	
}



