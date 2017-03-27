package com.winstar;

import com.oembedler.moon.graphql.boot.EnableGraphQLServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;

/**
 * application
 *
 * @author gradle
 */
@EnableGraphQLServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.addListeners(new ApplicationPidFileWriter("pid/springboot-graphql-demo.pid"));
        application.run(args);
    }
}
