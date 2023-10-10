package ex05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *	Application Context가 빈 생성/와이어링을 마친 이 후,
 *  실행할 코드(Application Context 환경에 의존적인 경우)가 있는 경우
 *  ApplicationRunner 인테페이스의 구현 클래스 빈(HelloWorldRunner) 사용하기
 *     
 */
@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(MyApplication.class, args);
		
//		MyComponent myComponent = ac.getBean(MyComponent.class);
//		myComponent.printHelloWorld();
	}
}
