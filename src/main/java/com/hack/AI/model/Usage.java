package com.hack.AI.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usage {

    public int prompt_tokens;
    public int completion_tokens;
    public int total_tokens;

    // Constructors, Getters and Setters
}
