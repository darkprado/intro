package darkprado.spring_intro;

import org.springframework.stereotype.Component;

/**
 * @author s.melekhin
 * @since 09 янв. 2022 г.
 */
@Component
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
