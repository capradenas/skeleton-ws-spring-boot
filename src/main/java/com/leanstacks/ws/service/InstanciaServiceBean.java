package com.leanstacks.ws.service;



import java.util.Collection;
import javax.persistence.EntityExistsException;
import javax.persistence.NoResultException;

import io.swagger.annotations.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leanstacks.ws.Application;
import com.leanstacks.ws.model.Instancia;
import com.leanstacks.ws.repository.InstanciaRepository;

@Service
public class InstanciaServiceBean implements InstanciaService {


    /**
     * The Spring Data repository for Greeting entities.
     */
    @Autowired
    private transient InstanciaRepository instanciaRepository;

    @Override
    public Collection<Instancia> findAll() {
        final Collection<Instancia> instancias = instanciaRepository.findAll();
        return instancias;
    }

    @Cacheable(value = Application.CACHE_GREETINGS,
            key = "#nombre")
    @Override
    public Instancia findByName(final String nombre) {
        final Instancia instancia = instanciaRepository.findByNombre(nombre);
        return instancia;
    }


}
