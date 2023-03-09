package com.digitalhouse.obtenerdiploma.dto;

import java.util.List;

public class ErrorDTO {
    String explanition;
    List<String> messages;

    public ErrorDTO() {
    }

    public ErrorDTO(String explanition, List<String> messages) {
        this.explanition = explanition;
        this.messages = messages;
    }

    public ErrorDTO(List<String> messages) {
        this.messages = messages;
    }

    public String getExplanition() {
        return explanition;
    }

    public void setExplanition(String explanition) {
        this.explanition = explanition;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}


