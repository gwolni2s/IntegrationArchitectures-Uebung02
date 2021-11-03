package org.example.IntegrationArchitecturesUebung02.salesman;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalesmenRepository extends MongoRepository<Salesmen, String> {

    //Query find salesmen by sid
    Optional<Salesmen> findSalesmenBySid(Long sid);
}
