package com.aalegz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myGolfCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
