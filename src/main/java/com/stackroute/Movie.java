package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    @Autowired
    Actor actor;

    public com.stackroute.Actor getActor() {
        return actor;
    }

    public void setActor(com.stackroute.Actor actor) {
        this.actor = actor;
    }
}
