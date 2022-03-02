package com.seerbit.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.seerbit.demo.models.AccountPayout;

@Repository
public interface PayoutRepository extends MongoRepository<AccountPayout, String>{
	
	
	@Query(value = "{'transaction.reference' : ?0}", fields = "{'transaction' : 0}")
	AccountPayout findByTransactionReference(String referenceNo);

}
