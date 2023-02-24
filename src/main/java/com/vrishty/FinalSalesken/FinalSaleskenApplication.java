package com.vrishty.FinalSalesken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.vrishty.FinalSalesken.Repository")
@ComponentScan(basePackages = {"com.vrishty.FinalSalesken"})
public class FinalSaleskenApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalSaleskenApplication.class, args);
	}

}
