package DAO.hbm;

import hbm.Type;
import org.apache.commons.validator.routines.IntegerValidator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Collection;

public class TypeDAO extends BaseDao<Type,Integer> {

    private IntegerValidator Int32=IntegerValidator.getInstance();
    public  TypeDAO(SessionFactory factory){super(factory, Type.class);}

    @Override
    public Collection<Type> find(String filter) {
        Session session= factory.openSession();
        return  session
                .createQuery("From Type"+
                        "where id=:id"+
                        "or name like :filter")
                .setParameter("id",Int32.validate(filter))
                .setParameter("filter", String.format("%%%s%%",filter))
                .list();
    }
}
