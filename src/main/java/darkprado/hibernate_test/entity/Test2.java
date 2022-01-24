package darkprado.hibernate_test.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author s.melekhin
 * @since 24 янв. 2022 г.
 */
public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            List<Employee> emps = session.createQuery("from Employee").getResultList();
            List<Employee> emps = session.createQuery("from Employee where name = 'Stanislav' and salary > 200").getResultList();
            for (Employee e : emps) {
                System.out.println(e);
            }
            session.getTransaction().commit();
//            System.out.println(employee);
        } finally {
            factory.close();
        }
    }

}
