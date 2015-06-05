package mx.com.bmt.bpms.controller;

import mx.com.bmt.bpms.service.PaisService;

import javax.annotation.PostConstruct;
import java.io.Serializable;

/**
 * Created by BMTHP01 on 6/2/2015.
 */
public class PruebaController implements Serializable {

    private Prueba prueba;
    private PaisService paisService;

    @PostConstruct
    private void init() {

    }

    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    public PaisService getPaisService() {
        return paisService;
    }

    public void setPaisService(PaisService paisService) {
        this.paisService = paisService;
    }

    
}
