package darkprado.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author s.melekhin
 * @since 10 янв. 2022 г.
 */
@Component
@Aspect
@Order(1)
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* darkprado.aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {

    }

    @Pointcut("execution(* darkprado.aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {

    }

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodsFromUniLibrary() {

    }

    @Pointcut("execution(* darkprado.aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {

    }

    @Pointcut("execution(public void darkprado.aop.UniLibrary.addBook())")
    public void addBookMethod() {

    }

    @Pointcut("allMethodsFromUniLibrary() && !addBookMethod()")
    private void allExpectAdd() {

    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing log #2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
    }

    @Before("allExpectAdd()")
    public void allExpectAddAdvice() {
        System.out.println("allExpectAddAdvice: writing log #4");
    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {}
//
////    @Before("execution(public void getBook())")
////    @Before("execution(public void darkprado.aop.UniLibrary.getBook())")
////    @Before("execution(public void get*(String))")
////    @Before("execution(public void *(..))")
////    @Before("execution(public void *(*))")
////    @Before("execution(public void getBook(darkprado.aop.Book))")
//    @Before("allGetMethods()")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }
//
//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: проверка прав");
//    }

}
