package mx.com.bmt.bpms.service.impl;

import mx.com.bmt.bpms.dao.PaisDao;
import mx.com.bmt.bpms.entity.Pais;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import mx.com.bmt.bpms.service.PaisService;

/**
 * Created by BMTHP01 on 6/3/2015.
 */
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisDao paisDao;


    @Override
    public List<Pais> getAll() {
        return paisDao.listPaiss();
    }

    public PaisDao getPaisDao() {
        return paisDao;
    }

    public void setPaisDao(PaisDao paisDao) {
        this.paisDao = paisDao;
    }
}
