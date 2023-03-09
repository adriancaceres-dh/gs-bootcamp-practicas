package com.digitalhouse.obtenerdiploma.dto;

import java.util.List;

public class ValidationDTO {
    List<String> messages;

    public ValidationDTO() {
    }

    public ValidationDTO(List<String> messages) {
        this.messages = messages;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}


