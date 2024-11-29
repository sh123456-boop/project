package project1.p1.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project1.p1.Item.Book;
import project1.p1.Service.itemService;

import java.util.List;

@RestController
@Slf4j
public class itemController {

    private final itemService itemService = new itemService();

    Book book1 = new Book(1L, "노인과바다", 10000);
    Book book2 = new Book(2L, "소년과 바다", 15000);

    @GetMapping("/join")
    public String join() {

        itemService.join(book1);
        itemService.join(book2);


        return "join 완료";

    }

    @GetMapping("/find")
    public List<Book> find() {

        List<Book> all = itemService.findAll();

        return all;
    }

    @GetMapping("/update")
    public String update() {
        itemService.update(book1, "죽은 시인의 사회", 20000);
        itemService.update(book2, "금쪽같은 내새끼", 30000);

        return "update 완료";
    }

    @GetMapping("/delete")
    public String delete() {
        itemService.delete(1L);
        itemService.delete(2L);

        return "delete 완료";
    }
}
