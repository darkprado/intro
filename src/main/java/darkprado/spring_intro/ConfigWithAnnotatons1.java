package darkprado.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author s.melekhin
 * @since 09 янв. 2022 г.
 */
public class ConfigWithAnnotatons1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat cat = context.getBean("cat", Cat.class);
        cat.say();
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        context.close();
    }
}
