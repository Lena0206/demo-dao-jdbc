package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    //Expõe um metodo que retorna uma interface,
    //mas internamente retorna uma implementação.
    //Uma forma de fazer injeção de independência sem
    //explicitar a implementação.
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
