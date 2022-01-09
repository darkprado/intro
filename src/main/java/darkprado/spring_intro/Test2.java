package darkprado.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author s.melekhin
 * @since 09 янв. 2022 г.
 */
public class Test2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();
    }
}
