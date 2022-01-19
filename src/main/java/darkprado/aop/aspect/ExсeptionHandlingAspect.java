package darkprado.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author s.melekhin
 * @since 19 янв. 2022 г.
 */
@Component
@Aspect
@Order(3)
public class ExсeptionHandlingAspect {

//    @Before("darkprado.aop.aspect.MyPointcuts.allGetMethods()")
//    public void beforeGetExceptionHandlingAdvice() {
//        System.out.println("beforeGetExceptionHandlingAdvice: исключение поймали");
//    }

    @Before("darkprado.aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(JoinPoint joinPoint) {
        System.out.println("beforeAddExceptionHandlingAdvice: исключение поймали");
        System.out.println("----------------------------------------------");
    }

}
