package com.eqipped.productService.repository;

import com.eqipped.productService.entities.Tier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TierRepository extends MongoRepository<Tier,String> {

}
