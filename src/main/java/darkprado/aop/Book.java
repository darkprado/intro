package darkprado.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author s.melekhin
 * @since 10 янв. 2022 г.
 */
@Component
public class Book {

    @Value("book2")
    private String name;

    @Value("author2")
    private String author;

    @Value("1866")
    private String yearOfPublic;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfPublic() {
        return yearOfPublic;
    }
}
