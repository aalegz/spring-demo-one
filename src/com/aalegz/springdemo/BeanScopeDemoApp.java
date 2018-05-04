package com.aalegz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        //load spring configuration file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //check if they are the same beans

        boolean results = (theCoach == alphaCoach);
        System.out.println("\nPointing to the same obj: " + results);

        System.out.println("\nMemory location theCoach: " + theCoach);

        System.out.println("\nMemory location theCoach: " + alphaCoach);

        context.close();
    }
}
