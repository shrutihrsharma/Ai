package com.hack.AI.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChatBotInputRequest {

    private String message;

    public String getMessage() {
        return this.message;
    }
}
