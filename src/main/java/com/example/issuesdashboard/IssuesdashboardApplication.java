package com.example.issuesdashboard;

import com.example.issuesdashboard.github.GithubProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(GithubProperties.class)
public class IssuesdashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssuesdashboardApplication.class, args);
	}
}
