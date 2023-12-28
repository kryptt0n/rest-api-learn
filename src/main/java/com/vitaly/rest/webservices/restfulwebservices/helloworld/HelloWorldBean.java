package com.vitaly.rest.webservices.restfulwebservices.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class HelloWorldBean {
    private String text;

    public HelloWorldBean(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "text='" + text + '\'' +
                '}';
    }
}
