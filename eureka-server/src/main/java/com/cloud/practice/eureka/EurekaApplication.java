package com.cloud.practice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] argv) {
        SpringApplication.run(EurekaApplication.class, argv);
    }

    //通过实现DiscoveryClient.DiscoveryClientOptionalArgs来实现复杂的安全控制

}
