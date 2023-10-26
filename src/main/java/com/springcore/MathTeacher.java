package com.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher{
    @Override
    public void teaching() {
        System.out.println("MathTeacher is teaching..");
    }
}
