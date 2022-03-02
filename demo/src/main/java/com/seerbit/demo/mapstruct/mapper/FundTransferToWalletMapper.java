package com.seerbit.demo.mapstruct.mapper;

import org.mapstruct.Mapper;

import com.seerbit.demo.models.FundTransferToWallet;
import com.seerbit.demo.payload.request.FundTransferToWalletPOJO;

@Mapper(componentModel = "spring")
public interface FundTransferToWalletMapper extends EntityMapper<FundTransferToWalletPOJO, FundTransferToWallet>{

}
