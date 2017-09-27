package com.github.xenteros.word.game.model;

import com.github.xenteros.word.game.enums.Winner;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by agurgul on 26.09.2017.
 */
@Entity
public class Round {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "round", fetch = FetchType.EAGER)
    private Set<Move> moves = new HashSet<>();
    @ManyToOne
    private Game game;
    @Enumerated(EnumType.STRING)
    private Winner winner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Move> getMoves() {
        return moves;
    }

    public void setMoves(Set<Move> moves) {
        this.moves = moves;
    }
}
