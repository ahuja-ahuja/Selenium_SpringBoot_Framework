package com.example.Learning_API_Spring;

import com.example.Learning_API_Spring.ComponentAnnotationUsing;
import com.example.Learning_API_Spring.SecondClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SIngleConstructor {

    private ComponentAnnotationUsing firstclass;
    private SecondClass secondclass;


    //by default @autowired will be added
    public SIngleConstructor(ComponentAnnotationUsing firstclass){
    this.firstclass = firstclass;
    }

    //constructor injection
    @Autowired
    public SIngleConstructor(ComponentAnnotationUsing firstclass, SecondClass secondclass ){
        this.firstclass = firstclass;
        this.secondclass = secondclass;
    }

    public void getDemoMethod(){
        firstclass.firstmethod();
        secondclass.SecondCLassMethod();
    }
}
