package project1.p1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import project1.p1.Item.Book;
import project1.p1.Repository.itemRepository;
import project1.p1.Repository.itemRepository2;
import project1.p1.Repository.repository;

import java.util.List;

@Component
public class itemService2 implements service {

    private final repository rep;

    @Autowired
    public itemService2(repository rep) {
        this.rep = rep;
    }

    @Override
    public Book join(Book book) {
        rep.save(book);
        return book;
    }

    @Override
    public Book findOne(Long id) {
        Book one = rep.findOne(id);
        return one;
    }

    @Override
    public List<Book> findAll() {
        List<Book> all = rep.findAll();
        return all;
    }

    @Override
    public Book update(Book book, String title, int price) {
        Book update = rep.update(book, title, price);
        return update;
    }

    @Override
    public void delete(Long id) {
        rep.delete(id);
    }
}
