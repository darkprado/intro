package darkprado.aop;

import org.springframework.stereotype.Component;

/**
 * @author s.melekhin
 * @since 10 янв. 2022 г.
 */
@Component
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из school library");
    }
}
