package com.boiz.chesstd.rest.v1;

import com.boiz.chesstd.api.PlayerScores;
import com.boiz.chesstd.app.PlayerScoresApplication;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfiguration {

    @Bean
    public PlayerScores playerScores() {
        return new PlayerScoresApplication();
    }
}
