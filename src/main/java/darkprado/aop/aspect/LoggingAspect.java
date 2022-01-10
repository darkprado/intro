package darkprado.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author s.melekhin
 * @since 10 янв. 2022 г.
 */
@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(public void getBook())")
//    @Before("execution(public void darkprado.aop.UniLibrary.getBook())")
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

    @Before("execution(public * returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
    }

}
