package org.Web.soap;

import DAO.hbm.DAO;
import hbm.Type;

import javax.jws.WebService;
import java.util.Collection;
import java.util.List;

@WebService(
        endpointInterface = "org.Web.soap.ServiceSocks2",
        serviceName = "ServiceSocks2"
)

public class SocksServiseImpl2 implements ServiceSocks2 {

    DAO<Type,Integer>dao;

    public SocksServiseImpl2(DAO<Type,Integer> dao){
        this.dao=dao;
    }

    @Override
    public boolean checkDB(String connectionString) {
        return false;
    }

    @Override
    public void save(List<Type> types) {
    dao.save(types);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public Type read(int id) {
        return dao.read(id);
    }

    @Override
    public Collection<Type> readAll() {
        return dao.readAll();
    }
}
