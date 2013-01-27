package by.undead.service;

import by.undead.entity.Book;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 27.01.13
 * Time: 15:50
 * To change this template use File | Settings | File Templates.
 */
public interface IService {

    Book createBook(Book book);
    Book getBook(Long id);
    List<Book> getBook();

}
