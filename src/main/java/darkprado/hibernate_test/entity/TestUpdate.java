package darkprado.hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author s.melekhin
 * @since 24 янв. 2022 г.
 */
public class TestUpdate {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            employee.setSalary(1000);
            session.createQuery("update Employee set salary = '900' where salary < 1000").executeUpdate();
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }

}
