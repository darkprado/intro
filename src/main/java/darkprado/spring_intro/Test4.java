package darkprado.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author s.melekhin
 * @since 09 янв. 2022 г.
 */
public class Test4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");//, "applicationContext.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);

        System.out.println(myDog == yourDog);
        System.out.println(myDog);
        System.out.println(yourDog);

        myDog.setName("Belka");
        yourDog.setName("Strelka");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        context.close();
    }

}
