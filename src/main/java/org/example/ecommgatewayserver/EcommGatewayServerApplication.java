package org.example.ecommgatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EcommGatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommGatewayServerApplication.class, args);
    }

}
