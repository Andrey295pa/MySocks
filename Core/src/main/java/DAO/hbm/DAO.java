package DAO.hbm;

import java.util.Collection;

public interface DAO<TEntity,TKey> {
    void save(Collection<TEntity> entity);
    TEntity read(TKey id);
    Collection<TEntity> readAll ();
    Collection<TEntity> find(String filter);
    void delete(TKey id);
}
