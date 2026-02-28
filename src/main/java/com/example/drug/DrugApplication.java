package com.example.drug;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DrugApplication {

    public static void main(String[] args) {

        SpringApplication.run(DrugApplication.class, args);
        log.info("项目已启动。。。。");
    }

}
