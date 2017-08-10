package com.leanstacks.ws.web.api;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.leanstacks.ws.service.InstanciaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leanstacks.ws.model.Instancia;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


/**
 * The GreetingController class is a RESTful web service controller. The <code>@RestController</code> annotation informs
 * Spring that each <code>@RequestMapping</code> method returns a <code>@ResponseBody</code>.
 *
 * @author Charly Pra
 */
@RestController
public class InstanciaController {


    /**
     * The Logger for this Class.
     */
    private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);


    /**
     * The GreetingService business service.
     */
    @Autowired
    private transient InstanciaService instanciaService;

    /**
     * Web service endpoint to fetch all Greeting entities. The service returns the collection of Greeting entities as
     * JSON.
     *
     * @return A ResponseEntity containing a Collection of Greeting objects.
     */
    @ApiOperation(value = "${InstanciaController.getInstancias.title}",
            notes = "${InstanciaController.getInstancias.notes}",
            response = Instancia.class,
            responseContainer = "List")
    @ApiImplicitParams(@ApiImplicitParam(name = "Authorization",
            value = "Basic auth_creds",
            required = true,
            dataType = "string",
            paramType = "header"))
    @RequestMapping(value = "/api/instancias",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Instancia>> getInstancias() {
        logger.info("> retornando instancia");

        final Collection<Instancia> resultInstancia = instanciaService.findAll();

        logger.info("< instancia retornada");
        return new ResponseEntity<Collection<Instancia>>(resultInstancia, HttpStatus.OK);
    }

}
