package org.example.IntegrationArchitecturesUebung02.salesman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesmenService {

    private final SalesmenRepository salesmenRepository;

    @Autowired
    public SalesmenService(SalesmenRepository salesmenRepository) {
        this.salesmenRepository = salesmenRepository;
    }

    public List<Salesmen> getSalesmen() {
        return salesmenRepository.findAll();
    }

    public void addNewSalesmen(Salesmen salesmen) {
        Optional<Salesmen> salesmenOptional = salesmenRepository.findSalesmenBySid(salesmen.getSid());
        if(salesmenOptional.isPresent()) {
            throw new IllegalStateException("sid already exists");
        } else {
            salesmenRepository.save(salesmen);
        }
    }

    public void deleteSalesmen(Long salesmenSid) {
        if(!salesmenRepository.findSalesmenBySid(salesmenSid).isPresent()) {
            System.out.println("Sid does not exist");
        } else {
            salesmenRepository.deleteById(salesmenRepository.findSalesmenBySid(salesmenSid).get().getId());
        }
    }

    public void updateSalesmen(Long sid, Salesmen salesmen) {
        if(!salesmenRepository.findSalesmenBySid(sid).isPresent()) {
            System.out.println("Sid does not exist");
        } else {
            String id = salesmenRepository.findSalesmenBySid(sid).get().getId();
            Salesmen salesmen1 = salesmenRepository.findById(id).get();
            salesmen1.setSid(salesmen.getSid());
            salesmen1.setFirstname(salesmen.getFirstname());
            salesmen1.setLastname(salesmen.getLastname());
            salesmenRepository.save(salesmen1);
        }
    }

    public Salesmen getOneSalesmen(Long sid) {
        if(!salesmenRepository.findSalesmenBySid(sid).isPresent()) {
            System.out.println("Sid does not exist");
            return null;
        } else {
            String id = salesmenRepository.findSalesmenBySid(sid).get().getId();
            return salesmenRepository.findById(id).get();
        }
    }
}




