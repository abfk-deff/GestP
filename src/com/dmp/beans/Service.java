package com.dmp.beans;


public class Service {

  private int idService;

  private String nomService;

  private String codeService;

public int getIdService() {
	return idService;
}

public Service() {
	super();
}

public Service(int idService, String nomService, String codeService) {
	super();
	this.idService = idService;
	this.nomService = nomService;
	this.codeService = codeService;
}

public void setIdService(int idService) {
	this.idService = idService;
}

public String getNomService() {
	return nomService;
}

public void setNomService(String nomService) {
	this.nomService = nomService;
}

public String getCodeService() {
	return codeService;
}

public void setCodeService(String codeService) {
	this.codeService = codeService;
}


}