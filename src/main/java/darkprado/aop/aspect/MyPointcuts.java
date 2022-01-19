package darkprado.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author s.melekhin
 * @since 19 янв. 2022 г.
 */
public class MyPointcuts {

//        @Pointcut("execution(* get*())")
//        public void allGetMethods() {}

        @Pointcut("execution(* abc*(..))")
        public void allAddMethods() {}

}
