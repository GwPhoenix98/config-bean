package com.example.setter_injection_app.config;

import com.example.setter_injection_app.common.Chef;
import com.example.setter_injection_app.common.GreekChef;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestaurantConfig  {

    @Bean("greekRestaurantChef")
    public Chef greekChef() {
        return new GreekChef();
    }

}
