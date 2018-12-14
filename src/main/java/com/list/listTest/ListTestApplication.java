package com.list.listTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //模型基类配置时间戳注解
public class ListTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListTestApplication.class, args);
	}
}
