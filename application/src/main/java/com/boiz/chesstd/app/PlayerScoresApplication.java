package com.boiz.chesstd.app;

import com.boiz.chesstd.api.PlayerScores;
import com.boiz.chesstd.api.model.PlayerScore;

import java.util.List;

public class PlayerScoresApplication implements PlayerScores {

    @Override
    public List<PlayerScore> getHighScores() {
        return null;
    }
}
