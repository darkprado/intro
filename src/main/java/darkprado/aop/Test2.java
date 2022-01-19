package darkprado.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author s.melekhin
 * @since 19 янв. 2022 г.
 */
public class Test2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudents();
        List<Student> students = null;
        try {
            students = university.getStudents();
        } catch (Exception e) {
            System.out.println("Exception in main " + e.getMessage());
        }
        System.out.println(students);
        context.close();
    }

}
