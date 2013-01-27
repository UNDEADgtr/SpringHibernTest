package by.undead.service;

import by.undead.dao.Dao;
import by.undead.entity.Book;
import org.hibernate.HibernateException;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 27.01.13
 * Time: 15:53
 * To change this template use File | Settings | File Templates.
 */
public class ServiceImpl implements IService {

    private Dao<Book> bookDao;

    public void setBookDao(Dao<Book> bookDao){
        this.bookDao = bookDao;
    }

    @Override
    public Book createBook(Book book) {
        try {
            bookDao.create(book);
        }   catch (HibernateException ex){

        }
        return book;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Book getBook(Long id) {
        Book instance = null;
        try {
            bookDao.read(id);
        }   catch (HibernateException ex){

        }
        return instance;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Book> getBook() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
