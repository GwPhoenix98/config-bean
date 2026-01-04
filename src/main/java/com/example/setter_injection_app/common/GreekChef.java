package com.example.setter_injection_app.common;

import org.springframework.stereotype.Component;

@Component
public class GreekChef implements Chef {

    public GreekChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Prepara o reteta greaca";
    }
}
