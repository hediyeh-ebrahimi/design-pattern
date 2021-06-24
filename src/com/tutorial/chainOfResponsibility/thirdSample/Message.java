package com.tutorial.chainOfResponsibility.thirdSample;


import java.util.EnumMap;
import java.util.Map;

public class Message {
    private String value;
    private Map<Destination, String> map;

    public Message() {
    }

    public Message(String value, Map<Destination, String> map) {
        this.value = value;
        this.map = map;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Map<Destination, String> getMap() {
        return map;
    }

    public void setMap(Map<Destination, String> map) {
        this.map = map;
    }

    public enum Destination {
        FAX, EMAIL, SMS
    }


    public static MessageBuilder getBuilder() {
        return new MessageBuilder();
    }

    public static class MessageBuilder {
        private String value;
        private Map<Destination, String> map = new EnumMap<>(Destination.class);

        public MessageBuilder setValue(String value) {
            this.value = value;
            return this;
        }

        public MessageBuilder addDestination(Destination destination , String value){
            map.put(destination,value);
            return this;
        }


        public Message createMessage() {
            return new Message(value, map);
        }
    }
}
