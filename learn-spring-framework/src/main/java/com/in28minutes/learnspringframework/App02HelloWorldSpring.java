package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1: Launch a Spring Context -
        ApplicationContext context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: configure the things that we want Spring to manage - @Configuration
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("person5Qualifier"));

        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean(Address.class));

//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(System.out::println);
    }
}
