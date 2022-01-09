package darkprado.spring_intro;

/**
 * @author s.melekhin
 * @since 09 янв. 2022 г.
 */
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
