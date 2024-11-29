package project1.p1.Repository;

import project1.p1.Item.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class itemRepository implements repository{

    Map<Long, Book> repository = new HashMap<>();

    public Book save(Book book) {
        repository.put(book.getId(), book);
        return book;
    }

    public Book findOne(Long id) {
        return repository.get(id);
    }

    public List<Book> findAll() {
        return new ArrayList<>(repository.values());
    }

    public Book update(Book book, String title, int price) {
        book.setTitle(title);
        book.setPrice(price);
        return book;
    }

    public void delete(Long id) {
        repository.remove(id);
    }
}
