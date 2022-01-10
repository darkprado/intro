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

    public String getName() {
        return name;
    }
}
