package com.spring.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class HappyFortuneService implements FortuneService{

    @Override
    public String getDailyFortune() {
        return "Today is my lucky day!!";
    }
}
