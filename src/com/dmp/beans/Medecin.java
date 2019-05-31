package com.dmp.beans;

public class Medecin extends Personnel {

  private String specialiteMedecin;
  
  private String gradeMedecin;

  public Medecin() {
	super();
}

public Medecin(String specialiteMedecin, String gradeMedecin) {
	super();
	this.specialiteMedecin = specialiteMedecin;
	this.gradeMedecin = gradeMedecin;
}

public String getSpecialiteMedecin() {
	return specialiteMedecin;
}

public void setSpecialiteMedecin(String specialiteMedecin) {
	this.specialiteMedecin = specialiteMedecin;
}

public String getGradeMedecin() {
	return gradeMedecin;
}

public void setGradeMedecin(String gradeMedecin) {
	this.gradeMedecin = gradeMedecin;
}
  
  

}