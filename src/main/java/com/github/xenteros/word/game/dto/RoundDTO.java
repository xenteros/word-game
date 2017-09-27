package com.github.xenteros.word.game.dto;

import java.util.Set;

/**
 * Created by agurgul on 27.09.2017.
 */
public class RoundDTO {

    private Set<MoveDTO> moves;
    private String winner;

    public Set<MoveDTO> getMoves() {
        return moves;
    }

    public void setMoves(Set<MoveDTO> moves) {
        this.moves = moves;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
