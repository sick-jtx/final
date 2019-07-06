package pe.upc.edu.dao;

import pe.upc.edu.entity.Auto;

public class AutoDaoCsv implements AutoDao {
    @Override
    public Auto registrarAuto(Auto auto) {
        System.out.println("GRABANDO EN CSV");
        auto.setId(111);
        return auto;
    }
}
