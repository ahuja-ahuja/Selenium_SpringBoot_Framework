package com.example.Learning_API_Spring;

import org.springframework.stereotype.Component;

//by adding this annoation we cn direclty get this bean

@Component
public class ComponentAnnotationUsing {
    public ComponentAnnotationUsing(){
        System.out.println("inside demo constructor");
    }
    public void firstmethod(){
        System.out.println("inside first method");
    }
}
