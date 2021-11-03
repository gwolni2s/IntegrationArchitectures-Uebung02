package org.example.IntegrationArchitecturesUebung02.evaluationRecords;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/evaluationRecords")
public class EvaluationRecordsController {

    private final EvaluationRecordsService evaluationRecordsService;

    @Autowired
    public EvaluationRecordsController(EvaluationRecordsService evaluationRecordsService) {
        this.evaluationRecordsService = evaluationRecordsService;
    }

    @GetMapping(path = "/all")
    public List<EvaluationRecords> getEvaluationRecords() {
        return evaluationRecordsService.getEvaluationRecords();
    }

    @GetMapping(path = "/{id}")
    public EvaluationRecords getOneEvaluationRecord(@PathVariable(required = true) Long id) {
        return evaluationRecordsService.getOneEvaluationRecord(id);
    }

    @PostMapping
    public void registerNewEvaluationRecord(@RequestBody EvaluationRecords evaluationRecords) {
        evaluationRecordsService.addNewEvaluationRecord(evaluationRecords);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteEvaluationRecord(@PathVariable(required = true) Long id) {
        evaluationRecordsService.deleteEvaluationRecord(id);
    }

    @PutMapping(path = "/{id}")
    public void updateEvaluationRecord(@PathVariable(required = true) Long id, @RequestBody(required = true) EvaluationRecords evaluationRecords) {
        evaluationRecordsService.updateEvaluationRecord(id, evaluationRecords);
    }
}

