package com.amrut.prabhu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/")
    public String getValue() {
        return "Yes! it works. and it is deployed to kubernetes";
    }
}
