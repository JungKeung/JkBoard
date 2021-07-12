package com.example.JkBoard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JkBoardApplication {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(JkBoardApplication.class, args);
	}


	public void run(String... args) throws Exception{
		String sql = "INSERT INTO users (id, Name) VALUES (?, ?)";

		jdbcTemplate.update( sql, 2,"hi" );
	}

}
