package xyz.bigFanQi.smallFanQi.clubgo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xyz.bigFanQi.smallFanQi.clubgo.mapper")
public class ClubGoApplication {

    void main(String[] args) {
        SpringApplication.run(ClubGoApplication.class, args);
    }

}
