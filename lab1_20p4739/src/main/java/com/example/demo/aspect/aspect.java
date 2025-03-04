package com.example.demo.aspect;



import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

    @Aspect
    @Component
    public class aspect {
        @Before("execution(* com.example.demo.services.services.*(..))")
        public void beforeServiceMethods() {
            System.out.println("Aspect: Before Service methods");
        }
    }

