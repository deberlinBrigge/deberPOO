package com.ug.encuesta.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="subgrupos")

public class Subgrupo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
 private  int requisito_id;
 private int grupo_id;
 private  String literal;
 private String descripcion;
 
 
 
 
 
public int getRequisito_id() {
	return requisito_id;
}
public void setRequisito_id(int requisito_id) {
	this.requisito_id = requisito_id;
}
public int getGrupo_id() {
	return grupo_id;
}
public void setGrupo_id(int grupo_id) {
	this.grupo_id = grupo_id;
}
public String getLiteral() {
	return literal;
}
public void setLiteral(String literal) {
	this.literal = literal;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
 
 
 
}
