package darkprado.aop;

import org.springframework.stereotype.Component;

/**
 * @author s.melekhin
 * @since 10 янв. 2022 г.
 */
@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из uni library");
    }

    public String returnBook() {
        System.out.println("Мы возвращаем книгу из uni library");
        return "book";
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из uni library");
    }

}
