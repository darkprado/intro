package darkprado.spring_intro;

/**
 * @author s.melekhin
 * @since 09 янв. 2022 г.
 */
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Gav-gav");
    }
}
