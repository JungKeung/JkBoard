package com.example.JkBoard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JkBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(JkBoardApplication.class, args);
	}
}
