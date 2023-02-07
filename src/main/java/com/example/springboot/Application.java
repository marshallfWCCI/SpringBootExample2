package com.example.springboot;

import com.example.springboot.logic.CaptionsAndRows;
import com.example.springboot.logic.TriangleData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CaptionsAndRows<String, Integer> getLogic() {
        return new TriangleData();
    }
}
