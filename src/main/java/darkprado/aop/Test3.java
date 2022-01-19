package darkprado.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author s.melekhin
 * @since 19 янв. 2022 г.
 */
public class Test3 {

    public static void main(String[] args) {
        System.out.println("main start");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = library.returnBook();
        System.out.println("returning book " + bookName);
        context.close();
        System.out.println("main ends");
    }

}
