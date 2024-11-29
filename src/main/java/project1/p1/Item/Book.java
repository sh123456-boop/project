package project1.p1.Item;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    public Book(Long id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    private Long id;
    private String title;
    private int price;

}
