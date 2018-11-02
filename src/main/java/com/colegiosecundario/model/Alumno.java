package com.colegiosecundario.model;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
	private int dni;
	private String nombre;
	private String apellido;
	private int edad;
	private List<String> alumnos; //propiedad agragada por mi. No figura en el modelo de clases
	
	public Alumno(int dni, String nombre, String apellido, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.alumnos = new ArrayList<String>();
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public List<String> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<String> alumnos) {
		this.alumnos = alumnos;
	}
	
	
}
