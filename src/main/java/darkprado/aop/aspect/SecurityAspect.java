package darkprado.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import darkprado.aop.Book;

/**
 * @author s.melekhin
 * @since 19 янв. 2022 г.
 */
@Component
@Aspect
@Order(2)
public class SecurityAspect {

//        @Before("darkprado.aop.aspect.MyPointcuts.allGetMethods()")
//        public void beforeGetSecurityAdvice() {
//            System.out.println("beforeGetSecurityAdvice: проверка прав");
//        }

    @Before("darkprado.aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
        if (methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object obj : args) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Инфа о книге: название книги - " + myBook.getName() + ", автор - " + myBook.getAuthor() +
                    ", год выпуска - " + myBook.getYearOfPublic());
                } else if (obj instanceof String) {
                    System.out.println("Книгу добавляет " + obj);
                }
            }
        }
        System.out.println("beforeAddSecurityAdvice: проверка прав");
        System.out.println("----------------------------------------------");
    }

}
