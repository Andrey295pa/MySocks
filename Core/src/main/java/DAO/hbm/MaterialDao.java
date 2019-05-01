package DAO.hbm;

import hbm.Material;
import org.apache.commons.validator.routines.IntegerValidator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Collection;

public class MaterialDao extends BaseDao<Material,Integer> {

    private IntegerValidator Int32= IntegerValidator.getInstance();
    public  MaterialDao(SessionFactory factory){super(factory, Material.class);}

    @Override
    public Collection<Material> find(String filter) {
        Session session= factory.openSession();
        return  session
                .createQuery("From Material"+
                        "where id=:id"+
                        "or name like :filter")
                .setParameter("id",Int32.validate(filter))
                .setParameter("filter", String.format("%%%s%%",filter))
                .list();
    }
}
