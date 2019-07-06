package pe.upc.edu.dao;

public class DaoFileFactory extends DaoFactory {

    @Override
    public DaoFactory getDaoFactory(String tipo) {
        switch (tipo){
            case "csv": return new DaoCsvFactory();
            default: return null;
        }
    }
}
