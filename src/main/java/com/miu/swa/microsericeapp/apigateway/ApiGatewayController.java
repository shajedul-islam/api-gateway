package com.miu.swa.microsericeapp.apigateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGatewayController {

    @Value("${message}")
    private String message;

    @RequestMapping("/")
    public String greeting() {
        return message;
    }
}
