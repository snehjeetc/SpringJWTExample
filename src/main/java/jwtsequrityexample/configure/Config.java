package jwtsequrityexample.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jwtsequrityexample.util.JwtUtil;

@Configuration
public class Config {
	@Bean
	public JwtUtil getJwtUtilToken() {
		return new JwtUtil();
	}
}
