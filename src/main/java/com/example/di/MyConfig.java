package com.example.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    
    // Bean 어노테이션을 사용하여 이름 변경 가능, 직접 만들어 호출, 이름을 지정해주지 않으면 메서드명을 따라 bean 이름 지정
    //    @Bean("byeMyBean")
    public MyBean helloMyBean() {
        return new MyBean();
    }

    // 그냥 어노테이션만 쓰면 메서드 이름(여기서는 "myGreatString")을 Bean의 이름으로 사용함
    @Bean
    public String myGreatString() {
        return "Great";
    }

    // 메서드를 이용한 Bean 정의는 객체 생성자 수동 호출, 코드를 이용한 객체 설정 변경 작업이 필요한 경우 유용하게 사용 가능
    @Bean
    public Person myPerson() {
        Person p = new Person("John", 20);
        p.setSomething("important!");
        return p;
    }

}
