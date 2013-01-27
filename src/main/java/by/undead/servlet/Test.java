package by.undead.servlet;

import by.undead.BookContextListener;
import by.undead.entity.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 27.01.13
 * Time: 16:18
 * To change this template use File | Settings | File Templates.
 */
public class Test extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Book book = new Book();
        book.setTitle("Золотая рыбка");
        book.setAuthor("Пушкин");
        BookContextListener.getService().createBook(book);

        Long id = 1l;
        book = new Book();
        book = BookContextListener.getService().getBook(id);

        request.setAttribute("book", book);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
