package com.stackroute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Actor getActor()
    {
        Actor actor = new Actor();
        actor.setName("De niro");
        actor.setGender("Male");
        actor.setAge(70);
        return actor;
    }

    @Bean
    public Movie getMovie()
    {
        Movie movie = new Movie();

        return movie;
    }

}
