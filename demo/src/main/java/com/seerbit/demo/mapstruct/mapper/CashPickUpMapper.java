package com.seerbit.demo.mapstruct.mapper;

import org.mapstruct.Mapper;

import com.seerbit.demo.models.CashPickUp;
import com.seerbit.demo.payload.request.CashPickUpPOJO;

@Mapper(componentModel = "spring")
public interface CashPickUpMapper extends EntityMapper<CashPickUpPOJO,CashPickUp>{

}
