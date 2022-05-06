package com.example.yejin.demo.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String id;
    private String password;
    private String email;
    private String name;
    private String repeat;

    public String getId(){
        return id;
    }

    public String getPwd(){
        return password;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
    
    public String getRepeat(){
        return repeat;
    }
}
