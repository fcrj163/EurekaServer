package com.yygood.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaserverApplication.class, args);
        System.out.println("增加MA功能");

        System.out.println("增加了AI功能，优惠券推荐");
        System.out.println("增加了AI功能，优惠券推荐");
    }

}
