package pe.upc.edu.dao;

public abstract class DaoFactory {

    public AutoDao getAutoDao(String tipo){
        AutoDao dao = null;
        if(tipo.equals("xml") || tipo.equals("csv")){
            dao = new DaoFileFactory().getAutoDao(tipo);
        }else{
            dao = new DaoRdbFactory().getAutoDao(tipo);
        }

        return dao;
    }



}
