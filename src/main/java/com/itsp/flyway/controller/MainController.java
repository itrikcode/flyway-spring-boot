package com.itsp.flyway.controller;

import com.itsp.flyway.beanpassword.Password;
import com.itsp.flyway.servic.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    PasswordService service;
    @RequestMapping(value = "/password",method = RequestMethod.POST,consumes = "application/json")
    public String save(@RequestBody Password password){
        return service.add(password);
    }
}
