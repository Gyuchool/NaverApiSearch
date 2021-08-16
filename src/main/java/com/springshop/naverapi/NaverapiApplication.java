package com.springshop.naverapi;

import com.springshop.naverapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.HashMap;
import java.util.Map;

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
