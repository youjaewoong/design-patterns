package me.easytodo.designpatterns._01_creational_patterns._03_abstract_factory._03_java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.easytodo.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;

public class FactoryBeanExample {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//        Ship easytodo = applicationContext.getBean("easytodo", Ship.class);
//        System.out.println(easytodo.getName());

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Ship bean = applicationContext.getBean(Ship.class);
        System.out.println(bean);
    }
}
