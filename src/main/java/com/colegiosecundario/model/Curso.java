package com.colegiosecundario.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private int idCurso;
	private int cupo;
	private String nombreCurso;
	private List<Inscripcion> inscripciones;
	
	public Curso(int idCurso, int cupo, String nombreCurso) {
		this.idCurso = idCurso;
		this.cupo = cupo;
		this.nombreCurso = nombreCurso;
		this.inscripciones = new ArrayList<Inscripcion>();
	}

	public List<Inscripcion> getInscripciones() {
		return inscripciones;
	}

	public void setInscripciones(List<Inscripcion> inscripciones) {
		this.inscripciones = inscripciones;
	}

	public int getIdCurso() {
		return idCurso;
	}
	
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	
	public int getCupo() {
		return cupo;
	}
	
	public void setCupo(int cupo) {
		this.cupo = cupo;
	}
	
	public String getNombreCurso() {
		return nombreCurso;
	}
	
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
}
