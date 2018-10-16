package com.example.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringCloudApplication
@EnableEurekaClient
@EnableZuulProxy
public class ApiGatewayApplication {

    public static void main(String[] args) {
        System.out.println("two");
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
