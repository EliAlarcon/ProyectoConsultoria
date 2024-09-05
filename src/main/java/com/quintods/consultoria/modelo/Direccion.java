package com.quintods.consultoria.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class Direccion {

	private String ciudad;
	
	private String sector;
	
	private String dirección;
}
