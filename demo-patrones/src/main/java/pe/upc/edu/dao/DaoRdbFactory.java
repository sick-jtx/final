package pe.upc.edu.dao;

public class DaoRdbFactory extends DaoFactory {

    public AutoDao getAutoDao(String tipo){
        switch (tipo){
            case "oracle": return new DaoOracleFactory().getAutoDao();
            case "mysql": return new DaoMysqlFactory().getAutoDao();
            default: return null;
        }
    }

}
