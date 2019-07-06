package pe.upc.edu.dao;

public class DaoOracleFactory extends DaoRdbFactory {

   AutoDao getAutoDao(){
       return new AutoDaoOracle();
   }
}
