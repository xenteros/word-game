package com.github.xenteros.word.game.mapper;

import com.github.xenteros.word.game.dto.RoundDTO;
import com.github.xenteros.word.game.model.Round;
import org.mapstruct.Mapper;

/**
 * Created by agurgul on 27.09.2017.
 */
@Mapper(componentModel = "spring", uses = {MoveMapper.class})
public interface RoundMapper {

    RoundDTO toRoundDTO(Round round);
}
