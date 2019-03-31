/**
 * 
 */
package com.johnfredy.ereservation.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Clase representa tabala cliente
 * @author Raziel214
 *
 */
@Data
@Entity
@Table(name = "cliente")
@NamedQuery(name="Cliente.findByIdentificacionCli",query="select c fom Cliente c where c.identificacionCli=?1")
public class Cliente {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idCli;
	private String nombreCli;
	private String apellidoCLi;
	private String identificacionCli;
	private String direcionCli;
	private String telefonoCLi;
	private String emailCLi;
	@OneToMany(mappedBy="cliente")
	private Set<Reserva> reservas;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	
	


}
