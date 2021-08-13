package com.springshop.naverapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableJpaAuditing
@SpringBootApplication
public class NaverapiApplication {


        public static final String APPLICATION_LOCATIONS = "spring.config.location="
                + "classpath:application.yml,"
                + "classpath:application-aws.yml";
    public static void main(String[] args) {

            new SpringApplicationBuilder(NaverapiApplication.class)
                    .properties(APPLICATION_LOCATIONS)
                    .run(args);
//         SpringApplication.run(NaverapiApplication.class, args);
    }

}
