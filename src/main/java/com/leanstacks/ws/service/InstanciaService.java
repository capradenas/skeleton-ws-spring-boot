package com.leanstacks.ws.service;

import java.util.Collection;
import com.leanstacks.ws.model.Instancia;

public interface InstanciaService {

    /**
     * Find all Instancia entities.
     *
     * @return A Collection of Greeting objects.
     */
    Collection<Instancia> findAll();

    /**
     * Query for a single Instancia entities by name.
     *
     * @param nombre The name value to query the repository.
     * @return An Instancia or <code>null</code> if none found.
     */
    Instancia findByName(String nombre);


}
