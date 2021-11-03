package org.example.IntegrationArchitecturesUebung02.evaluationRecords;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EvaluationRecordsRepository extends MongoRepository<EvaluationRecords, String> {

    //Query find evaluationRecord by Sid
    Optional<EvaluationRecords> findEvaluationRecordsBySid(Long sid);
}

