package com.boiz.chesstd.rest.v1;

import com.boiz.chesstd.api.PlayerScores;
import com.boiz.chesstd.api.model.PlayerScore;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ScoreV1Controller {

    private PlayerScores playerScores;

    @GetMapping(value = "/scores", produces = "application/json")
    public @ResponseBody List<PlayerScore> getHighScores() {
        return playerScores.getHighScores();
    }
}
