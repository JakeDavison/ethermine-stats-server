package com.boiz.chesstd.api.model;

public class PlayerScore {

    private String playerId;
    private String score;


    public PlayerScore(String playerId, String score) {
        this.playerId = playerId;
        this.score = score;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
