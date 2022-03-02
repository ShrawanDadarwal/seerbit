package com.seerbit.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.seerbit.demo.models.FundTransferToWallet;

@Repository
@Component
public interface FundTransferToWalletRepository extends MongoRepository<FundTransferToWallet, String>{

	FundTransferToWallet findByTransactionReference(String reference);}
