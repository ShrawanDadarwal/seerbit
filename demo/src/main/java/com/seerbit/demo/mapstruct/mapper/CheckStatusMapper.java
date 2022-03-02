package com.seerbit.demo.mapstruct.mapper;

import org.mapstruct.Mapper;

import com.seerbit.demo.models.AccountPayout;
import com.seerbit.demo.payload.response.CheckStatusResponse;

@Mapper(componentModel = "spring")
public interface CheckStatusMapper extends EntityMapper<CheckStatusResponse,AccountPayout>{

}
