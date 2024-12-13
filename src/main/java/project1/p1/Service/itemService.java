package project1.p1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import project1.p1.Item.Book;
import project1.p1.Repository.itemRepository;
import project1.p1.Repository.itemRepository2;
import project1.p1.Repository.repository;

import java.util.List;

@Component
public class itemService implements service{


    private final repository rep;


    @Autowired
    public itemService(repository rep) {
        this.rep = rep;
    }

    @Override
    public Book join(Book book) {
        return rep.save(book);
    }

    @Override
    public Book findOne(Long id) {
        return rep.findOne(id);
    }

    @Override
    public List<Book> findAll() {
        return rep.findAll();
    }

    @Override
    public Book update(Book book, String title, int price) {
        return rep.update(book, title, price);
    }

    @Override
    public void delete(Long id) {
        rep.delete(id);
    }
}
