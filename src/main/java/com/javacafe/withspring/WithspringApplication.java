package com.javacafe.withspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class WithspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WithspringApplication.class, args);
	}

	@PostConstruct
	public void hello(){
		//프로젝트 생성 확인 및 내장톰캣 구동 확인
		System.out.println("스프링 부트 시작 : 환영합니다.");
	}
}
