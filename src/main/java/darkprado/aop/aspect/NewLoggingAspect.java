package darkprado.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author s.melekhin
 * @since 19 янв. 2022 г.
 */
@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(* returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");
        long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: throwing exception " + e);
        }
        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку вернули книгу");
        System.out.println("aroundReturnBookLoggingAdvice: return book done in " + (end - begin) + " millis");
        return targetMethodResult == null ? "Преступление и наказание" : targetMethodResult;
    }

}
