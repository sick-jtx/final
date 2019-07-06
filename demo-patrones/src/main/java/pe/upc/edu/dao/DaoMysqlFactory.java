package pe.upc.edu.dao;

public class DaoMysqlFactory extends DaoRdbFactory {
    AutoDao getAutoDao(){
        return new AutoDaoMysql();
    }

}
