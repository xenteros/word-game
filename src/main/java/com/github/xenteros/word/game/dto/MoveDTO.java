package com.github.xenteros.word.game.dto;

import java.time.LocalDate;

/**
 * Created by agurgul on 27.09.2017.
 */
public class MoveDTO {

    private String playedOn;
    private String word;

    public String getPlayedOn() {
        return playedOn;
    }

    public void setPlayedOn(String playedOn) {
        this.playedOn = playedOn;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
