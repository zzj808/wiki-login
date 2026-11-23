package com.zijian.wiki_login.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean checkUser(String username, String password) {
        if ("zijian".equals(username) && "123".equals(password)) {
            return true;
        }
        return false;
    }
}
