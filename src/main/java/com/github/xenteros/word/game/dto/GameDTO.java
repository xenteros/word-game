package com.github.xenteros.word.game.dto;

import com.github.xenteros.word.game.model.Game;

import static java.util.Objects.nonNull;

/**
 * Created by agurgul on 27.09.2017.
 */
public class GameDTO {

    private String white;
    private String black;
    private Boolean completed;

    public static GameDTO fromGame(Game game) {
        if (game == null) {
            return null;
        }
        GameDTO result = new GameDTO();
        if (nonNull(game.getWhite())) {
            result.setWhite(game.getWhite().getLogin());
        }
        if (nonNull(game.getBlack())) {
            result.setBlack(game.getBlack().getLogin());
        }
        result.setCompleted(game.getCompleted());
        return result;
    }

    public String getWhite() {
        return white;
    }

    public void setWhite(String white) {
        this.white = white;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
