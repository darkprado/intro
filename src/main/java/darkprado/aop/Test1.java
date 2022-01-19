package darkprado.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author s.melekhin
 * @since 10 янв. 2022 г.
 */
public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("book", Book.class);

        UniLibrary uniLib = context.getBean("uniLibrary", UniLibrary.class);
//        uniLib.getBook();
//        uniLib.returnMagazine();
        uniLib.addBook("Stanislav", book);
        uniLib.addMagazine();
//        uniLib.returnBook();

//        SchoolLibrary schoolLib = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLib.getBook();

        context.close();
    }

}
