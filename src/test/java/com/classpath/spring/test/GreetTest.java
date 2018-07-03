package com.classpath.spring.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.classpath.junit.Greet;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={Greet.class})
public class GreetTest {
    @Autowired
    private Greet greet;
    
    @Test
    public void verifyBeans() {
        assertNotNull(greet);
       String greetMessage = greet.sayHello("Pradeep");
       assertEquals("Hi Pradeep", greetMessage);
    }
    @Test
    public void verifyBeanWithNull() {
        assertNotNull(greet);
       String greetMessage = greet.sayHello(null);
       assertEquals("Hi Stranger", greetMessage);
    }
}
