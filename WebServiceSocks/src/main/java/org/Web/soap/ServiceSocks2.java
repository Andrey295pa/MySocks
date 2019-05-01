package org.Web.soap;


import  hbm.Type;

import javax.jws.WebService;
import java.util.Collection;
import java.util.List;

@WebService
public interface ServiceSocks2 {
    boolean checkDB(String connectionString);

    void save(List<Type> material);
    void delete(int id);
    Type read(int id);
    Collection<Type> readAll();
}
