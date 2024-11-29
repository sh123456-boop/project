package project1.p1.Repository;

import org.springframework.stereotype.Component;
import project1.p1.Item.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public interface repository {
    public Book save(Book book) ;


    public Book findOne(Long id);

    public List<Book> findAll() ;

    public Book update(Book book, String title, int price);

    public void delete(Long id);
}
