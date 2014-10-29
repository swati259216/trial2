package com.zinteract.agent;

import com.zinteract.agent.repos.*;
import com.zinteract.common.dom.*;
import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.Properties;

/**
 * Created by swati on 20/10/14.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EntityScan("com.zinteract.common.dom")
public class Application {
    public static void main(String[] args) {


        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        DataSourceRepository dataSourceRepository = context.getBean(DataSourceRepository.class);
        PatternMatchRepository patternMatchRepository = context.getBean(PatternMatchRepository.class);
        QueryRepository queryRepository = context.getBean(QueryRepository.class);
        QueryRunRepository queryRunRepository = context.getBean(QueryRunRepository.class);
        QueryScheduleRepository queryScheduleRepository = context.getBean(QueryScheduleRepository.class);





        dataSourceRepository.save(new  ZDataSource(1235, "name", "description", "type", "channel", "url", "login_name", "pwdhash", "drivername", "api_access_token", "secretkey", 85859585, new Date(),
                new Date(), false,"extra_info", "connection_status","auth_type",true));
        Properties prop = new Properties();
        prop.put("message","hi");
        prop.put("date","today");

        PatternMatch patternMatch = new PatternMatch(12122,1515,1212,prop.toString(),new Date(),"Hello");
//        patternMatch.setKeyValue("message","hi");
        patternMatchRepository.save(patternMatch);
        queryRepository.save(new Query());
        queryRunRepository.save(new QueryRun());
        queryScheduleRepository.save(new QuerySchedule());

        Iterable<ZDataSource> customers = dataSourceRepository.findAll();
        Iterable<PatternMatch> patterns = patternMatchRepository.findAll();
        Iterable<Query> query = queryRepository.findAll();
        Iterable<QueryRun> queryRuns = queryRunRepository.findAll();
        Iterable<QuerySchedule> querySchedules = queryScheduleRepository.findAll();




    }
    @Bean
    public ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
        registration.addUrlMappings("/console/*");
        return registration;
    }



}
