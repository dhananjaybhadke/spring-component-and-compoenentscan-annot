package com.springcore;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{
    @Override
    public void teaching() {
        System.out.println("ScienceTeacher is teaching...");
    }
}
