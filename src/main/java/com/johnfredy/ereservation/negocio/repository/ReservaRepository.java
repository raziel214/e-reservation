/**
 * 
 */
package com.johnfredy.ereservation.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnfredy.ereservation.model.Reserva;

/**
 * 
 * @author Raziel214
 *
 */
public interface ReservaRepository extends JpaRepository<Reserva, String> {

}
