package com.example.userservice.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public record Greeting(@Value("${greeting.message}") String message){

}
