package com.quintods.consultoria.modelo;

import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter

@View(name = "vistaSimple", members = "nombre, fechaInicio, fechaFin")
public class Proyecto {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Hidden
	private String codigo;
	
	@Column(length = 20)
	private String nombre;
	
	@Column(length = 45)
	private String descripcion;
	
	private LocalDate fechaInicio;
	
	private LocalDate fechaFin;
	
	@Column(length = 10)
	private String estado;
	
	@ManyToOne
	(fetch = FetchType.LAZY, optional = true)
	@ReferenceView("vistaSimple")
	private Cliente cliente;
}
