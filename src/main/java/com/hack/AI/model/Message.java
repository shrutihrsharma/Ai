package com.hack.AI.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Message {
    public String role;
    public String content;

    public Message(String user, String prompt) {
        this.role = user;
        this.content = prompt;
    }

    // Constructors, Getters and Setters
}
