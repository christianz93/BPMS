package mx.com.bmt.bpms.controller;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

/**
 * Created by BMTHP01 on 6/2/2015.
 */
public abstract class AbstractCatalog<T> implements Serializable {

    private List<T> list;
    private T current;



    @PostConstruct
    protected abstract void init();


    protected abstract void crear();

    protected abstract void editar();

    protected abstract void elimiar();





}
