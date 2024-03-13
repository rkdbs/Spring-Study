package com.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyCalculatorService {

    // 상수 필드의 경우 생성자에서 대입은 허용하므로 final로 설정
    @Autowired
    private Calculator calculator;
    // 생정자 위에 Autowired 어노테이션 붙이기
// 의존성 주입을 통해 생성자로 Calculator 타입의 Bean 객체가 주입(=전달)됨

//    @Autowired
//    public MyCalculatorService(Calculator calculator) { // 의존성 주입을 생성자에 주입
//        System.out.println("from constructor");
//        System.out.println(calculator);
//        this.calculator = calculator;
//    }

    public int calcAdd(int a, int b) {
        return calculator.add(a, b);
    }

}
