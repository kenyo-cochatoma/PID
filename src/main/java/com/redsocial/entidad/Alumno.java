package com.redsocial.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

/*
 * @Table--->Tabla
 * @Id------>Primary key
 * @Column-->Columna
 * GenerationType.IDENTITY-->Base de datos genera la pk
 */

@Entity
@Getter
@Setter
@Table(name = "alumno")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "idalumno")
	private int idAlumno;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "correo")
	private String correo;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fechaNacimiento")
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	private Date fechaNacimiento;


		
	
}
