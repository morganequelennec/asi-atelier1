package com.cpe.cardgame;

import fr.dtoin.CardIn;
import fr.dtoin.StoreOrderIn;
import fr.dtoin.StoreTransactionIn;
import fr.dtoin.UserIn;
import fr.dtoout.CardOut;
import fr.dtoout.StoreOrderOut;
import fr.dtoout.StoreTransactionOut;
import fr.dtoout.UserOut;
import fr.model.StoreOrder;
import fr.model.StoreTransaction;
import fr.viewmodel.CardForm;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ModelMapper {
    ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);
    StoreTransactionIn convertToIn(StoreTransaction user);
    StoreTransactionOut convertToOut(StoreTransaction user);

    StoreTransaction convert(StoreTransactionIn user);
    StoreTransaction convert(StoreTransactionOut user);


    StoreOrderIn convertToIn(StoreOrder user);
    StoreOrderOut convertToOut(StoreOrder user);

    StoreOrder convert(StoreOrderIn user);
    StoreOrder convert(StoreOrderOut user);

}