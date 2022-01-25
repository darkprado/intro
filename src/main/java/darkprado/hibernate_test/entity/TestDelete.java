package darkprado.hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author s.melekhin
 * @since 24 янв. 2022 г.
 */
public class TestDelete {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 2);
//            session.delete(emp);
            session.createQuery("delete Employee where name = 'Alex'").executeUpdate();
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }

}
