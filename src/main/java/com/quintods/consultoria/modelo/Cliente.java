package com.quintods.consultoria.modelo;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter

@View(name = "vistaSimple", members = "nombre, apellido")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int id;
	
	@Column(length = 20)
	private String nombre;
	
	@Column(length = 20)
	private String apellido;
	
	@Email
	private String email;
	
	@Embedded
	private Direccion direccion;
}
