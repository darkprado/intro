package darkprado.spring_intro;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author s.melekhin
 * @since 09 янв. 2022 г.
 */
@Configuration
@ComponentScan("darkprado")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

}
