package project1.p1.Service;

import project1.p1.Item.Book;
import project1.p1.Repository.itemRepository;
import project1.p1.Repository.itemRepository2;

import java.util.List;

public class itemService implements service{


    private final itemRepository repository = new itemRepository();
    @Override
    public Book join(Book book) {
        return repository.save(book);
    }

    @Override
    public Book findOne(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Book update(Book book, String title, int price) {
        return repository.update(book, title, price);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}
