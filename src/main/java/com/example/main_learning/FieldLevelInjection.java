package com.example.main_learning;

import com.example.Learning_API_Spring.ComponentAnnotationUsing;
import com.example.Learning_API_Spring.SecondClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldLevelInjection {

    // this is field level injection
    @Autowired
    private ComponentAnnotationUsing firstclass;

    // this is field level injection
    @Autowired
    private SecondClass secondclass;

   // we removed the constructor here, becuase they won't be required in field level injection


    public void getDemoMethod(){
        firstclass.firstmethod();
        secondclass.SecondCLassMethod();
    }
}
