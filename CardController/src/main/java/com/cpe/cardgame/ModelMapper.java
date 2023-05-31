package com.cpe.cardgame;

import fr.dtoin.CardIn;
import fr.dtoin.UserIn;
import fr.dtoout.CardOut;
import fr.dtoout.UserOut;
import fr.model.Card;
import fr.viewmodel.CardForm;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ModelMapper {
    ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);
    Card convert(CardIn user);
    Card convert(CardOut user);

    Card convert(CardForm user);
    CardForm convert(Card user);
    UserIn convertToIn(Card user);
    UserOut convertToOut(Card user);
}