package com.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoBeanApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Coach coach = context.getBean("swimCoach",Coach.class);

        Coach secondCoach = context.getBean("anotherSwimCoach",Coach.class);

        System.out.println("Practice : "+coach.getDailyWorkout());
        System.out.println("Fortune : "+coach.getDailyFortune());

        System.out.println("Practice : "+secondCoach.getDailyWorkout());

        context.close();
    }
}
