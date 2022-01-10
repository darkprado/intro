package darkprado.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author s.melekhin
 * @since 10 янв. 2022 г.
 */
@Configuration
@ComponentScan("darkprado.aop")
@EnableAspectJAutoProxy
public class MyConfig {

}
