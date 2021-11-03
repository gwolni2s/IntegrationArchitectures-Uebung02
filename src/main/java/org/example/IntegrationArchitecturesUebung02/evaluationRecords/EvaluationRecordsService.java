package org.example.IntegrationArchitecturesUebung02.evaluationRecords;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluationRecordsService {

    private final EvaluationRecordsRepository evaluationRecordsRepository;

    @Autowired
    public EvaluationRecordsService(EvaluationRecordsRepository evaluationRecordsRepository) {
        this.evaluationRecordsRepository = evaluationRecordsRepository;
    }

    public List<EvaluationRecords> getEvaluationRecords() {
        return evaluationRecordsRepository.findAll();
    }

    public EvaluationRecords getOneEvaluationRecord(Long sid) {
        if(!evaluationRecordsRepository.findEvaluationRecordsBySid(sid).isPresent()) {
            System.out.println("Sid does not exist");
            return null;
        } else {
            String id = evaluationRecordsRepository.findEvaluationRecordsBySid(sid).get().getId();
            return evaluationRecordsRepository.findById(id).get();
        }
    }

    public void addNewEvaluationRecord(EvaluationRecords evaluationRecords) {
        Optional<EvaluationRecords> evaluationRecordsOptional = evaluationRecordsRepository.findEvaluationRecordsBySid(evaluationRecords.getSid());
        if(evaluationRecordsOptional.isPresent()) {
            throw new IllegalStateException("Sid already exists");
        } else {
            evaluationRecordsRepository.save(evaluationRecords);
        }
    }

    public void deleteEvaluationRecord(Long id) {
        if(!evaluationRecordsRepository.findEvaluationRecordsBySid(id).isPresent()) {
            System.out.println("Sid does not exist");
        } else {
            evaluationRecordsRepository.deleteById(evaluationRecordsRepository.findEvaluationRecordsBySid(id).get().getId());
        }
    }

    public void updateEvaluationRecord(Long sid, EvaluationRecords evRecord) {
        if(!evaluationRecordsRepository.findEvaluationRecordsBySid(sid).isPresent()) {
            System.out.println("Sid does not exist");
        } else {
            String id = evaluationRecordsRepository.findEvaluationRecordsBySid(sid).get().getId();
            EvaluationRecords record = evaluationRecordsRepository.findById(id).get();
            record.setSid(evRecord.getSid());
            record.setYear(evRecord.getYear());
            record.setNameProduct(evRecord.getNameProduct());
            record.setClient(evRecord.getClient());
            record.setClientRanking(evRecord.getClientRanking());
            record.setSoldItems(evRecord.getSoldItems());
            record.setTargetValue(evRecord.getTargetValue());
            record.setLeadershipCompetence(evRecord.getLeadershipCompetence());
            record.setOpennessToEmployee(evRecord.getOpennessToEmployee());
            record.setSocialBehaviour(evRecord.getSocialBehaviour());
            record.setAttitudeTowardsClient(evRecord.getAttitudeTowardsClient());
            record.setCommunicationSkills(evRecord.getCommunicationSkills());
            record.setIntegrityToCompany(evRecord.getIntegrityToCompany());
            record.setBonusA(evRecord.getBonusA());
            record.setBonusB(evRecord.getBonusB());
            record.setRemark(evRecord.getRemark());
            evaluationRecordsRepository.save(record);
        }
    }
}

