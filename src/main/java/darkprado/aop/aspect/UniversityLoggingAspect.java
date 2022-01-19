package darkprado.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import darkprado.aop.Student;

/**
 * @author s.melekhin
 * @since 19 янв. 2022 г.
 */
@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: logging list students before getStudents()");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(JoinPoint joinPoint, List<Student> students) {
        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);
        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);
        System.out.println("afterReturningGetStudentsLoggingAdvice: logging list students after returning getStudents()");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentLoggingAdvice: logging exception " + exception);
    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: logging finish or throwing");
    }

}
