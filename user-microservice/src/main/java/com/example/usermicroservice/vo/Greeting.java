package com.example.usermicroservice.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Greeting {
    @Value("${greeting.message}")
    private String message;
}

@Entity
class Dummies{
    @Id
    private Long id;
}