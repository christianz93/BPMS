package mx.com.bmt.bpms.dao;

import mx.com.bmt.bpms.entity.Pais;

import java.util.List;

/**
 * Created by BMTHP01 on 6/3/2015.
 */
public interface PaisDao {

    /*
      * CREATE and UPDATE
      */
    public void savePais(Pais Pais); // create and update

    /*
     * READ
     */
    public List<Pais> listPaiss();

    public Pais getPais(Long id);

    /*
     * DELETE
     */
    public void deletePais(Long id);
}
