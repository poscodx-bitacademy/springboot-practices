package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 1. Bootstraping class: 스프링 애플리케이션의 부트스트래핑 역할
 * 2. 설정 클래스 역할: Configuration Class 
 */
@SpringBootApplication
public class HelloWorldApplication {
	public static void main(String[] args) {
		/**
		 * SpringApplication.run(...) 안에서 일어 나는 일
		 * 
		 * 1. 애플리케이션 컨텍스트(Application Context, Spring Contianer) 생성
		 * 2. 어노테이션 스캐닝(Componet Scaning) + Configuration Class 를 통한
		 *    빈 생성, 등록, 와이어링 작업   
		 * 3. 만약, 웹애플리케이션 이라면 웹애플리케이션 타입을 결정(Spring MVC, Reactive)
		 * 4. 만약 웹애플리케이션이고 타입이 SpringMVC 이면
		 * 	  - 내장(embeded) 서버(TomcatEmbededServiceServletContainer) 인스턴스 생성
		 *    - 서버 인스턴스 웹 애플리케이션 배포(mvc, aop, security, jpa, ... auto Configuration)
		 *    - 서버 인스턴스 스타트
		 * 5. ApplicationRunner 인터페이스를 구현한 빈을 Application Context 찾아서 실행      
		 */
//		ConfigurableApplicationContext ac = null;
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch(Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			if(ac != null) {
//				ac.close();
//			}
//		}
		
		// try ~ with ~ resources 구문
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)){}
	
		// wep application인 경우
		// SpringApplication.run(HelloWorldApplication.class, args);
		
		System.out.println("some code....");
		System.out.println("some code....");
		System.out.println("some code....");
		System.out.println("some code....");
	}
}
