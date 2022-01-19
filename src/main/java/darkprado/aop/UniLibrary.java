package darkprado.aop;

import org.springframework.stereotype.Component;

/**
 * @author s.melekhin
 * @since 10 янв. 2022 г.
 */
@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из uni library");
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в uni library");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в uni library");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из uni library");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в uni library");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в uni library");
    }

}
