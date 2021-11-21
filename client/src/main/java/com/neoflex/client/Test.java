package com.neoflex.client;

import com.neoflex.password_service.PasswordService;

public class Test {
    public static void main(String[] args) {
        PasswordService passwordService = new PasswordService();
        System.out.println(passwordService.hash("Hello world!"));
    }
}
