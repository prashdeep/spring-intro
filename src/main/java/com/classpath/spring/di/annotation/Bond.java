package com.classpath.spring.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
 
@Component
public class Bond {
 
    @Autowired
    @Qualifier("ferarri")
    private Car car;
     
    public void showCar(){
        car.getCarName();
    }
}