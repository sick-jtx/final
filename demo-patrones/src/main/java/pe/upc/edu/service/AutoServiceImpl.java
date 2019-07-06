package pe.upc.edu.service;

import pe.upc.edu.dao.AutoDao;
import pe.upc.edu.entity.Auto;

public class AutoServiceImpl implements AutoService {

    AutoDao autoDao;

    public Auto registrarAuto(Auto auto) {
        return autoDao.registrarAuto(auto);
    }
}
