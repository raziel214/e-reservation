/**
 * 
 */
package com.johnfredy.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnfredy.ereservation.model.Cliente;

/**
 * Interface  para definir  las operaciones de bd relacionadas con cliente
 * @author Raziel214
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{
	
	/**
	 * Definicio de metodo para buscar los clientes por su apellido
	 * @param apellidoCLi
	 * @return
	 */
	
	public  List<Cliente> findByApellidoCLi(String apellidoCLi);
	
	public Cliente findByIdentificacionCli(String identificacionCli);

}
