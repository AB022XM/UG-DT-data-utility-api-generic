package ug.co.absa.api.data.utility.config;

import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import tech.jhipster.config.JHipsterConstants;
import ug.co.absa.api.data.utility.aop.logging.LoggingAspect;

@Configuration
@EnableAspectJAutoProxy
public class LoggingAspectConfiguration {

    @Bean
    @Profile(JHipsterConstants.SPRING_PROFILE_DEVELOPMENT)
    public LoggingAspect loggingAspect(Environment env) {
        return new LoggingAspect(env);
    }
}