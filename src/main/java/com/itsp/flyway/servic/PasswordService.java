package com.itsp.flyway.servic;

import com.itsp.flyway.beanpassword.Password;
import com.itsp.flyway.repo.PasswordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {

    @Autowired
    PasswordRepo repo;

    public String add(Password password){
       Password savePassword= repo.save(password);
        System.out.println(password.getPassword());
        System.out.println(password.getUsername());
       if(savePassword!=null) {
           return "success";
       }
       else {
           return "failed";
       }
    }
}
