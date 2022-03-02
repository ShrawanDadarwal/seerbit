package com.seerbit.demo.mapstruct.mapper;

import org.mapstruct.Mapper;

import com.seerbit.demo.models.FundTransferToWallet;
import com.seerbit.demo.payload.request.CancelCashPickUpTranasctionPOJO;

@Mapper(componentModel = "String")
public interface CancelCashPickUpTransactionMapper extends EntityMapper<CancelCashPickUpTranasctionPOJO, FundTransferToWallet> {

}
