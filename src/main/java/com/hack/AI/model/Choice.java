package com.hack.AI.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Choice {

    public int index;
    public Message message;
    public String finish_reason;

    // Constructors, Getters and Setters
}
