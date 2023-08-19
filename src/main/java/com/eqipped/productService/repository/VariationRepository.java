package com.eqipped.productService.repository;

import com.eqipped.productService.entities.Variation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariationRepository extends MongoRepository<Variation, String> {

}
