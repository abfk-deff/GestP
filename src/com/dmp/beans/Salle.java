package com.dmp.beans;


public class Salle {

  private String idSalle;

  private String codeSalle;

public String getIdSalle() {
	return idSalle;
}

public void setIdSalle(String idSalle) {
	this.idSalle = idSalle;
}

public String getCodeSalle() {
	return codeSalle;
}

public void setCodeSalle(String codeSalle) {
	this.codeSalle = codeSalle;
}

public Salle(String idSalle, String codeSalle) {
	super();
	this.idSalle = idSalle;
	this.codeSalle = codeSalle;
}

public Salle() {
	super();
}

}