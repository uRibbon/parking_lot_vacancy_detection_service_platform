package com.example.yejin.demo;

import com.example.yejin.demo.user.User;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    
    @CrossOrigin("*")
    @PostMapping("/join")
    public String test(@RequestParam String id, @RequestParam String password, @RequestParam String email, 
    @RequestParam String name, @RequestParam String repeat){
        return "아이디= " + id +"비밀번호= "+ password + "비밀번호 확인= " 
        + repeat + "이름 = " + name + " 이메일= " + email  ; 
    }

   

    @GetMapping("/test")
    public String index(){
        System.out.println("왜~~~~");
        return "hi";
    }


}
