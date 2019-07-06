package pe.upc.edu.dao;

import pe.upc.edu.entity.Auto;

public class AutoDaoMysql implements AutoDao {
    @Override
    public Auto registrarAuto(Auto auto) {
        System.out.println("GRABANDO EN MYSQL");
        auto.setId(111);
        return auto;
    }
}
