package com.neoflex.password_service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordServiceTest {

    PasswordService passwordService;

    @Before
    public void init() {
        passwordService = new PasswordService();
    }

    @Test
    public void hash() {
        String input = "hello world";
        String expected = "5eb63bbbe01eeed093cb22bb8f5acdc3";
        assertEquals(expected, passwordService.hash(input));
    }
}