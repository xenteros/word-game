package com.github.xenteros.word.game.mapper;

import com.github.xenteros.word.game.dto.MoveDTO;
import com.github.xenteros.word.game.model.Move;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Set;

/**
 * Created by agurgul on 27.09.2017.
 */
@Mapper(componentModel = "spring")
public interface MoveMapper {

    @Mappings({
            @Mapping(source = "value", target = "word")
    })
    MoveDTO toMoveDTO(Move move);
    Set<MoveDTO> toMoveDTO(Set<Move> moves);
}
