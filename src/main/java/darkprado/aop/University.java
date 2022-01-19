package darkprado.aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author s.melekhin
 * @since 19 янв. 2022 г.
 */
@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Stanislav Melekhin", 5, 7.5);
        Student st2 = new Student("Alexandr Lusik", 4, 6);
        Student st3 = new Student("Elena Melekhina", 3, 5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("start getStudents()");
        System.out.println(students.get(3));
        System.out.println("Info from method getStudents:");
        System.out.println(students);
        return students;
    }

}
