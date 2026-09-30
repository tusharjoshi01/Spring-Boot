package com.example.boot;

public class Notification {
    private  MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public Notification(){

    }

    public Notification(MessageService messageService){
        this.messageService=messageService;
    }

    private void notifyUser(){
        System.out.println(messageService.getMessage());
    }


}
