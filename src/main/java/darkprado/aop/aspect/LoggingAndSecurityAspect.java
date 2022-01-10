package darkprado.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author s.melekhin
 * @since 10 янв. 2022 г.
 */
@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods() {}

//    @Before("execution(public void getBook())")
//    @Before("execution(public void darkprado.aop.UniLibrary.getBook())")
//    @Before("execution(public void get*(String))")
//    @Before("execution(public void *(..))")
//    @Before("execution(public void *(*))")
//    @Before("execution(public void getBook(darkprado.aop.Book))")
    @Before("allGetMethods()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав");
    }

}
