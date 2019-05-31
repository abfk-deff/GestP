package com.dmp.beans;


public class ExamenParaclinique {

  private int idExamen;

  private String natureExamen;

  private String conditionExamen;

  private String observation;

public ExamenParaclinique() {
	super();
	
}

public ExamenParaclinique(int idExamen, String natureExamen,
		String conditionExamen, String observation) {
	super();
	this.idExamen = idExamen;
	this.natureExamen = natureExamen;
	this.conditionExamen = conditionExamen;
	this.observation = observation;
}

public int getIdExamen() {
	return idExamen;
}

public void setIdExamen(int idExamen) {
	this.idExamen = idExamen;
}

public String getNatureExamen() {
	return natureExamen;
}

public void setNatureExamen(String natureExamen) {
	this.natureExamen = natureExamen;
}

public String getConditionExamen() {
	return conditionExamen;
}

public void setConditionExamen(String conditionExamen) {
	this.conditionExamen = conditionExamen;
}

public String getObservation() {
	return observation;
}

public void setObservation(String observation) {
	this.observation = observation;
}

}