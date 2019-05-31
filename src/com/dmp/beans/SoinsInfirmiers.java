package com.dmp.beans;

import java.util.Date;

public class SoinsInfirmiers {

  private int idSoinsInfirmiers;

  private Date dateSoinsInfirmiers;

  private String problemes;

  private String soinsAdministrer;

  private String observations;

public SoinsInfirmiers() {
	super();
}

public SoinsInfirmiers(int idSoinsInfirmiers, Date dateSoinsInfirmiers, String problemes, String soinsAdministrer,
		String observations) {
	super();
	this.idSoinsInfirmiers = idSoinsInfirmiers;
	this.dateSoinsInfirmiers = dateSoinsInfirmiers;
	this.problemes = problemes;
	this.soinsAdministrer = soinsAdministrer;
	this.observations = observations;
}

public int getIdSoinsInfirmiers() {
	return idSoinsInfirmiers;
}

public void setIdSoinsInfirmiers(int idSoinsInfirmiers) {
	this.idSoinsInfirmiers = idSoinsInfirmiers;
}

public Date getDateSoinsInfirmiers() {
	return dateSoinsInfirmiers;
}

public void setDateSoinsInfirmiers(Date dateSoinsInfirmiers) {
	this.dateSoinsInfirmiers = dateSoinsInfirmiers;
}

public String getProblemes() {
	return problemes;
}

public void setProblemes(String problemes) {
	this.problemes = problemes;
}

public String getSoinsAdministrer() {
	return soinsAdministrer;
}

public void setSoinsAdministrer(String soinsAdministrer) {
	this.soinsAdministrer = soinsAdministrer;
}

public String getObservations() {
	return observations;
}

public void setObservations(String observations) {
	this.observations = observations;
}


}