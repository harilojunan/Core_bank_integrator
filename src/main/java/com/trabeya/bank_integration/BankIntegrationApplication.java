package com.trabeya.bank_integration;

import com.trabeya.bank_integration.accounts.Account;
import com.trabeya.bank_integration.accounts.GetAccountRequest;
import com.trabeya.bank_integration.integrator.BankIntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BankIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankIntegrationApplication.class, args);
    }

}
