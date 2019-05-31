package com.dmp.beans;

import java.util.Date;

public class Patient {

  private int idPatient;

  private String nomPatient;

  private String prenomPatient;

  private Date dateNaissance;

  private String sexe;

  private String profession;

  private String religion;

  private String village;

  private String adresse;

  private String statutMatrimoniale;
  
  private String ethnie;
  
  
    public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int idPatient, String nomPatient, String prenomPatient, Date dateNaissance, String sexe,
			String profession, String religion, String village, String adresse, String statutMatrimoniale,
			String ethnie) {
		super();
		this.idPatient = idPatient;
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.profession = profession;
		this.religion = religion;
		this.village = village;
		this.adresse = adresse;
		this.statutMatrimoniale = statutMatrimoniale;
		this.ethnie = ethnie;	
	}
	
	
	
	public int getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}
	public String getNomPatient() {
		return nomPatient;
	}
	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}
	public String getPrenomPatient() {
		return prenomPatient;
	}
	public void setPrenomPatient(String prenomPatient) {
		this.prenomPatient = prenomPatient;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getStatutMatrimoniale() {
		return statutMatrimoniale;
	}
	public void setStatutMatrimoniale(String statutMatrimoniale) {
		this.statutMatrimoniale = statutMatrimoniale;
	}
	public String getEthnie() {
		return ethnie;
	}
	public void setEthnie(String ethnie) {
		this.ethnie = ethnie;
	}
	

}