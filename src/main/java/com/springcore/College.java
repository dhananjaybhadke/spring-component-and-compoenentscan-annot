package com.springcore;


//Component does the same work as <bean> in beans.xml
//we can create the object using @Component annotation no need to add configuration in beans.xml
// If we dont mentioned the name of the bean in the @Component annotation by default it takes the class name in small letters

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Value("${college.name}")
    private String collegeName;
    @Autowired
    private Principal principal;
    @Autowired
    @Qualifier("mathTeacher")
    private Teacher teacher;



    public void testing(){
        principal.principalInfo();
        teacher.teaching();
        System.out.println("College name is "+collegeName);
        System.out.println("Testing @Bean annotation");
    }


}
