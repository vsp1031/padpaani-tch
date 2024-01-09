package com.hostel.demo.controller;
import com.hostel.demo.entity.Dtls;
import com.hostel.demo.repo.stdrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

public class UserController {

    @Autowired
    private stdrepo repo;

    //FIRST PAGE CHECK THE PRN UNIQUE OR NOT
    @GetMapping("/")
    public  String home(){
        return "welcome";
    }

    @PostMapping("/submit")
    public String form(Dtls d){
        System.out.println(d);
        return "HA";
    }


    //SECOND PAGE FORM AFTER SUBMITTIN RETURN TO FIRST PAGE
    @PostMapping("/register")
//    public  String register(@ModelAttribute Dtls d , HttpSession session){
        public  String register(@ModelAttribute Dtls d){
            System.out.println(d);
            repo.save(d);
            return  "thanks";
    }

    // THIRD - REGISTRATION
    //FOURTH - LOGIN
    //FIFTH - LOGOUT
}
