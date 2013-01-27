package by.undead.dao;


import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 27.01.13
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 */
public class DaoImpl<T> extends HibernateDaoSupport implements Dao<T> {

    private static Logger log = Logger.getLogger(DaoImpl.class);
    private Class<T> type;
    private String typeName;

    public DaoImpl(Class<T> type) {
        this.type = type;
        typeName = type.getSimpleName();
        log.debug("Created dao for " + typeName);
    }

    @Override
    public T create(T t) {
        getHibernateTemplate().save(t);
        log.debug("Object saved!");
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<T> readAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T read(Long id) {
        T obj = (T) getHibernateTemplate().get(type, id);
        log.debug("Object readed!");
        return obj;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T update(T t) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(T t) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
