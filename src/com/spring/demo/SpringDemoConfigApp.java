package com.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoConfigApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Coach coach = context.getBean("tennisCoach",Coach.class);
        System.out.println("Coaching : "+coach.getDailyWorkout());
        System.out.println("Fortune : "+coach.getDailyFortune());

        context.close();
    }
}
