package springboot.basics.springbootin10stepsWITHNOTES;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {
    // we are going to map (/books), so when somebody get request on /books, return set of books.
    // Get is a type of the request, it is typically used to retrieve data
    // NOTE: ( /books ), means in the url, like: (www.blah blah.com/books).
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        /*
        For making the program automatically reload the updates that you do on the items, we should add this dependency in the pom.xml file:
        <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
		</dependency>
        */
        return Arrays.asList(new Book(1l, "Mastering in Spring-Boot", "Mabast Hashm"),
                             new Book(2l, "Intro to Enlglighkdkk", "Ali A"));
    }
}
