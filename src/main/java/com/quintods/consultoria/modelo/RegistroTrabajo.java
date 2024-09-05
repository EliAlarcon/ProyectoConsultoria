package com.quintods.consultoria.modelo;

import java.time.*;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class RegistroTrabajo {
	
	private LocalDate fechaTrabajo;
	
	private int horas;
	
}
