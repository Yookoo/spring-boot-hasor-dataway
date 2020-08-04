package cn.com.xcrj.light;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableHasor
@EnableHasorWeb
@SpringBootApplication
@EnableDiscoveryClient
public class LightDatawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LightDatawayApplication.class, args);
    }

}
