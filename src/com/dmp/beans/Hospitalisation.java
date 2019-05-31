package com.dmp.beans;

import java.util.Date;

public class Hospitalisation {

  public Hospitalisation() {
		super();
	}

public Hospitalisation(String idHospitalisation, Date dateEntree, Date dateSortie) {
		super();
		this.idHospitalisation = idHospitalisation;
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
	}

private String idHospitalisation;

  private Date dateEntree;

  private Date dateSortie;

public String getIdHospitalisation() {
	return idHospitalisation;
}

public void setIdHospitalisation(String idHospitalisation) {
	this.idHospitalisation = idHospitalisation;
}

public Date getDateEntree() {
	return dateEntree;
}

public void setDateEntree(Date dateEntree) {
	this.dateEntree = dateEntree;
}

public Date getDateSortie() {
	return dateSortie;
}

public void setDateSortie(Date dateSortie) {
	this.dateSortie = dateSortie;
}

}