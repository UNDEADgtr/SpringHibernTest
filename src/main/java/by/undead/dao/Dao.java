package by.undead.dao;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 27.01.13
 * Time: 15:32
 * To change this template use File | Settings | File Templates.
 */
public interface Dao<T> {
    T create(T t);

    List<T> readAll();

    T read(Long id);

    T update(T t);

    void delete(T t);

}
