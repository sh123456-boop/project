package project1.p1.Service;

import org.springframework.stereotype.Component;
import project1.p1.Item.Book;

import java.util.List;

@Component
public interface service {
    public Book join(Book book);
    public Book findOne(Long id);

    public List<Book> findAll() ;

    public Book update(Book book, String title, int price);

    public void delete(Long id);
}
