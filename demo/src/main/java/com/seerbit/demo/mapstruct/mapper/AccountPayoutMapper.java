package com.seerbit.demo.mapstruct.mapper;

import org.mapstruct.Mapper;


import com.seerbit.demo.models.AccountPayout;
import com.seerbit.demo.payload.request.AccountPayoutPOJO;

@Mapper(componentModel = "spring")
public interface AccountPayoutMapper extends EntityMapper<AccountPayoutPOJO, AccountPayout>{}
