package com.dmp.beans;

import java.util.Date;


public class Consultation {

  private int idConsultation;

  public int getIdConsultation() {
	return idConsultation;
}

public void setIdConsultation(int idConsultation) {
	this.idConsultation = idConsultation;
}

public Date getDateConsultation() {
	return dateConsultation;
}

public void setDateConsultation(Date dateConsultation) {
	this.dateConsultation = dateConsultation;
}

public Double getTemperature() {
	return temperature;
}

public void setTemperature(Double temperature) {
	this.temperature = temperature;
}

public Double getPoids() {
	return poids;
}

public void setPoids(Double poids) {
	this.poids = poids;
}

public String getTension() {
	return tension;
}

public void setTension(String tension) {
	this.tension = tension;
}

public String getAutres() {
	return autres;
}

public void setAutres(String autres) {
	this.autres = autres;
}

public String getMotifDeConsultation() {
	return motifDeConsultation;
}

public void setMotifDeConsultation(String motifDeConsultation) {
	this.motifDeConsultation = motifDeConsultation;
}

public Consultation() {
	super();
}

public Consultation(int idConsultation, Date dateConsultation, Double temperature, Double poids, String tension,
		String autres, String motifDeConsultation) {
	super();
	this.idConsultation = idConsultation;
	this.dateConsultation = dateConsultation;
	this.temperature = temperature;
	this.poids = poids;
	this.tension = tension;
	this.autres = autres;
	this.motifDeConsultation = motifDeConsultation;
}

private Date dateConsultation;

  private Double temperature;

  private Double poids;

  private String tension;

  private String autres;

  private String motifDeConsultation;


}