package project1.p1.Repository;

import org.springframework.stereotype.Component;
import project1.p1.Item.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class itemRepository2 implements repository {

    Map<Long, Book> map = new HashMap<>();

    @Override
    public Book save(Book book) {
        map.put(book.getId(), book);
        return book;
    }

    @Override
    public Book findOne(Long id) {
        return map.get(id);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Book update(Book book, String title, int price) {
        book.setTitle(title);
        book.setPrice(price);
        return book;
    }

    @Override
    public void delete(Long id) {
        map.remove(id);
    }
}
