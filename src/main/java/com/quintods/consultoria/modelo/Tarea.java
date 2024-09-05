package com.quintods.consultoria.modelo;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter

@View(members = "proyecto;"+"titulo;"+"fechaVencimiento, prioridad, estado;"+"descripcion;"+"horasTrabajadas")
public class Tarea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int id;
	
	@ManyToOne
	(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimple")
	private Proyecto proyecto;
	
	@Column(length = 45)
	private String titulo;
	
	@TextArea
	private String descripcion;
	
	private LocalDate fechaVencimiento;
	
	private int prioridad;
	
	@Column(length = 10)
	private String estado;
	
	@ElementCollection
	@ListProperties("fechaTrabajo, horas")
	Collection<RegistroTrabajo> horasTrabajadas;
}
