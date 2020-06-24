package com.example.demo;

import lombok.Builder;
import lombok.Data;

@Builder @Data
public class User {
    private String name;
    private String email;
    private String street;
    private int zipCode;
}
