package com.trabeya.bank_integration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
//*
//Author: Harilojunan.N
//Date	: 13/January/2022
//*
@Configuration
public class WebConfig {

    //Initializing Marshaller Bean
    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.trabeya.bank_integration.accounts");
        return marshaller;
    }
}
