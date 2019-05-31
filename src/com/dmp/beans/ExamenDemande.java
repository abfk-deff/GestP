package com.dmp.beans;
import java.util.Date;


public class ExamenDemande {

  private int idExamen;

  private Date horairePrelevement;

  private String natureExamen;

  private String reactionApresPrelevement;

  private String observation;

  private String conditionExamen;

  private String dateExamemen;

public ExamenDemande(int idExamen, Date horairePrelevement, String natureExamen, String reactionApresPrelevement,
		String observation, String conditionExamen, String dateExamemen) {
	super();
	this.idExamen = idExamen;
	this.horairePrelevement = horairePrelevement;
	this.natureExamen = natureExamen;
	this.reactionApresPrelevement = reactionApresPrelevement;
	this.observation = observation;
	this.conditionExamen = conditionExamen;
	this.dateExamemen = dateExamemen;
}

public ExamenDemande() {
	super();
	// TODO Auto-generated constructor stub
}

public int getIdExamen() {
	return idExamen;
}

public void setIdExamen(int idExamen) {
	this.idExamen = idExamen;
}

public Date getHorairePrelevement() {
	return horairePrelevement;
}

public void setHorairePrelevement(Date horairePrelevement) {
	this.horairePrelevement = horairePrelevement;
}

public String getNatureExamen() {
	return natureExamen;
}

public void setNatureExamen(String natureExamen) {
	this.natureExamen = natureExamen;
}

public String getReactionApresPrelevement() {
	return reactionApresPrelevement;
}

public void setReactionApresPrelevement(String reactionApresPrelevement) {
	this.reactionApresPrelevement = reactionApresPrelevement;
}

public String getObservation() {
	return observation;
}

public void setObservation(String observation) {
	this.observation = observation;
}

public String getConditionExamen() {
	return conditionExamen;
}

public void setConditionExamen(String conditionExamen) {
	this.conditionExamen = conditionExamen;
}

public String getDateExamemen() {
	return dateExamemen;
}

public void setDateExamemen(String dateExamemen) {
	this.dateExamemen = dateExamemen;
}


}