package pe.upc.edu.dao;

public class DaoCsvFactory extends DaoFileFactory {
    AutoDao getAutoDao(){
        return new AutoDaoCsv();
    }

}