package DAO.hbm;

import hbm.Manufacture;
import org.apache.commons.validator.routines.IntegerValidator;
import org.hibernate.SessionFactory;

import java.util.Collection;

public class ManufactureDao  extends BaseDao<Manufacture,Integer>{

    private IntegerValidator Int32= IntegerValidator.getInstance();
    public  ManufactureDao(SessionFactory factory){super(factory, Manufacture.class);}

    @Override
    public Collection<Manufacture> find(String filter) {
        return null;
    }
}
