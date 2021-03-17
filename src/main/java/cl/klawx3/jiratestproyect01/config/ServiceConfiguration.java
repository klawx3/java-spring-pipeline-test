package cl.klawx3.jiratestproyect01.config;

import cl.klawx3.jiratestproyect01.service.MainService;
import cl.klawx3.jiratestproyect01.service.impl.MainServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ServiceConfiguration {

    @Bean
    @Primary
    public MainService getDefaultServiceImpl(){
        return new MainServiceImpl();
    }
}
