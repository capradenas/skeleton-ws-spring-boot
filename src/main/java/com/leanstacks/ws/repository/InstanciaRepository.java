package com.leanstacks.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leanstacks.ws.model.Instancia;

/**
 * The InstanciaRepository interface is a Spring Data JPA data repository for
 * Greeting entities. The GreetingRepository provides all the data access
 * behaviors exposed by <code>JpaRepository</code> and additional custom
 * behaviors may be defined in this interface.
 *
 * @author Carlos Pradenas
 */
@Repository
public interface InstanciaRepository extends JpaRepository<Instancia, String>{

    /**
     * Query for a single Instancia entities by name.
     *
     * @param nombre The name value to query the repository.
     * @return An Instancia or <code>null</code> if none found.
     */
    Instancia findByNombre(String nombre);
}
