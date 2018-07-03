package com.classpath.spring.di.annotation;


import org.springframework.stereotype.Component;
 
@Component("ferarri")
public class Ferari implements Car{
 
    public void getCarName() {
        System.out.println("This is Ferari");
    }
 
}