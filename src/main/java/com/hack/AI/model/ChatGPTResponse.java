package com.hack.AI.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChatGPTResponse {

    public String id;
    public String object;
    public int created;
    public List<Choice> choices;
    public Usage usage;

    // Constructors, Getters and Setters
}
