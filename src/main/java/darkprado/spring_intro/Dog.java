package darkprado.spring_intro;

import org.springframework.stereotype.Component;

/**
 * @author s.melekhin
 * @since 09 янв. 2022 г.
 */
@Component
public class Dog implements Pet {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("Init dog");
    }

    public void destroy() {
        System.out.println("Destroy dog");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Gav-gav");
    }
}
