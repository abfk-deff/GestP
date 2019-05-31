package com.dmp.beans;

public class Personnel {

  private int idPersonnel;

  private String nomPersonnel;

  private String prenomPersonnel;

  public Personnel() {
	super();
}


public Personnel(int idPersonnel, String nomPersonnel, String prenomPersonnel, String telephonePersonnel) {
	super();
	this.idPersonnel = idPersonnel;
	this.nomPersonnel = nomPersonnel;
	this.prenomPersonnel = prenomPersonnel;
	this.telephonePersonnel = telephonePersonnel;
}

private String telephonePersonnel;

public int getIdPersonnel() {
	return idPersonnel;
}

public void setIdPersonnel(int idPersonnel) {
	this.idPersonnel = idPersonnel;
}

public String getNomPersonnel() {
	return nomPersonnel;
}

public void setNomPersonnel(String nomPersonnel) {
	this.nomPersonnel = nomPersonnel;
}

public String getTelephonePersonnel() {
	return telephonePersonnel;
}

public void setTelephonePersonnel(String telephonePersonnel) {
	this.telephonePersonnel = telephonePersonnel;
}

public String getPrenomPersonnel() {
	return prenomPersonnel;
}

public void setPrenomPersonnel(String prenomPersonnel) {
	this.prenomPersonnel = prenomPersonnel;
}


}