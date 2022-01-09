package darkprado.spring_intro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author s.melekhin
 * @since 09 янв. 2022 г.
 */
public class Test5 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }

}
