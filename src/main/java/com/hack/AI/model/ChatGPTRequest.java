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
public class ChatGPTRequest {

    private String model;
    private List<Message> messages;
    private Integer max_tokens;

    public void setModel(String s) {
        this.model = s;
    }

    public void setMessages(List<Message> user) {
        this.messages = user;
    }

    public void setMax_tokens(int i) {
        this.max_tokens = i;
    }
}

