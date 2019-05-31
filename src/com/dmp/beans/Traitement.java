package com.dmp.beans;

public class Traitement {

  public Traitement() {
		super();
	}

public Traitement(int idTraitement, String nomsMedicament, String posologie, String voieAdministration,
			String conditionAdministration, String observation) {
		super();
		this.idTraitement = idTraitement;
		this.nomsMedicament = nomsMedicament;
		this.posologie = posologie;
		this.voieAdministration = voieAdministration;
		this.conditionAdministration = conditionAdministration;
		this.observation = observation;
	}

private int idTraitement;

  private String nomsMedicament;

  private String posologie;

  private String voieAdministration;

  private String conditionAdministration;

  private String observation;

public int getIdTraitement() {
	return idTraitement;
}

public void setIdTraitement(int idTraitement) {
	this.idTraitement = idTraitement;
}

public String getNomsMedicament() {
	return nomsMedicament;
}

public void setNomsMedicament(String nomsMedicament) {
	this.nomsMedicament = nomsMedicament;
}

public String getPosologie() {
	return posologie;
}

public void setPosologie(String posologie) {
	this.posologie = posologie;
}

public String getVoieAdministration() {
	return voieAdministration;
}

public void setVoieAdministration(String voieAdministration) {
	this.voieAdministration = voieAdministration;
}

public String getConditionAdministration() {
	return conditionAdministration;
}

public void setConditionAdministration(String conditionAdministration) {
	this.conditionAdministration = conditionAdministration;
}

public String getObservation() {
	return observation;
}

public void setObservation(String observation) {
	this.observation = observation;
}

}