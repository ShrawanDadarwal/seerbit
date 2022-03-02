package com.seerbit.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.seerbit.demo.models.CashPickUp;

@Repository
public interface CashPickUpRepository extends MongoRepository<CashPickUp, String>{

	CashPickUp findByTransactionReference(String reference);

}
