package com.colegiosecundario.model;

public class Inscripcion {
	private int Curso_idCurso;
	private float nota;
	private int Alumno_dni;
	
	public int getCurso_idCurso() {
		return Curso_idCurso;
	}
	
	public void setCurso_idCurso(int Curso_idCurso) {
		this.Curso_idCurso = Curso_idCurso;
	}
	
	public float getNota() {
		return nota;
	}
	
	public void setNota() {
		this.nota = nota;
	}
	
	public int getAlumno_dni() {
		return Alumno_dni;
	}
	
	public void setAlumno_dni(int Alumno_dni) {
		this.Alumno_dni = Alumno_dni;
	}
}
