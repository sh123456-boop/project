package project1.p1.Service;

import project1.p1.Item.Book;

import java.util.List;

public interface service {
    public Book join(Book book);
    public Book findOne(Long id);

    public List<Book> findAll() ;

    public Book update(Book book, String title, int price);

    public void delete(Long id);
}
