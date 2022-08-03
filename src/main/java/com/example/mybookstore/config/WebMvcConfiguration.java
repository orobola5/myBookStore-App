package com.example.mybookstore.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration

public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    //    @Value("${spring.datasource.driver-class-name}")
//    private String driver;
//    @Value("${spring.datasource.url}")
//    private String dbURL;
//    @Value("${spring.datasource.username}")
//    private String dbUsername;
//    @Value("${spring.datasource.password}")
//    private String dbPassword;
//    @Value("${connection.pool.initialPoolSize}")
//    private int connPoolInitSize;
//    @Value("${connection.pool.minPoolSize}")
//    private int connPoolMinSize;
//    @Value("${connection.pool.maxPoolSize}")
//    private int connPoolMaxSize;
//    @Value("${connection.pool.maxIdleTime}")
//    private int connPoolMaxIdleTime;
@Bean
public MessageSource messageSource(){
    ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
    messageSource.addBasenames("classpath:messages");
    messageSource.setDefaultEncoding("UTF-8");

    return messageSource;
}

//    @Bean
//    public DataSource securityDataSource(){
//
//      ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
//        messageSource.addBasenames("classpath:messages");
//        messageSource.setDefaultEncoding("UTF-8");
//        return (DataSource) messageSource;
//    }
//
//    @Bean
//    public DataSource securityDataSources(){
//        ComboPooledDataSource securityDataSource = new ComboPooledDataSource();
//        try {
//            securityDataSource.setDriverClass(driver);
//        } catch (PropertyVetoException e) {
//            throw new RuntimeException(e);
//        }
//        securityDataSource.setJdbcUrl(dbURL);
//        securityDataSource.setUser(dbUsername);
//        securityDataSource.setPassword(dbPassword);
//
//        return securityDataSource;
//    }




}
