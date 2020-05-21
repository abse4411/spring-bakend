package fun.xuefeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringBakendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBakendApplication.class, args);
    }

}
