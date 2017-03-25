package com.winstar;

import com.oembedler.moon.graphql.boot.EnableGraphQLServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * application
 *
 * @author gradle
 */
@EnableGraphQLServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
