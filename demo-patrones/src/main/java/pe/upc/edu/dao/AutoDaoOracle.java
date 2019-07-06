package pe.upc.edu.dao;

import pe.upc.edu.entity.Auto;

public class AutoDaoOracle implements AutoDao {
    @Override
    public Auto registrarAuto(Auto auto) {
        System.out.println("GRABANDO EN ORACLE");
        auto.setId(111);
        return auto;
    }
}
