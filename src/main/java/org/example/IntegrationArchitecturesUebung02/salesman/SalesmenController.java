package org.example.IntegrationArchitecturesUebung02.salesman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/salesmen")
public class SalesmenController {

    private final SalesmenService salesmenService;

    @Autowired
    public SalesmenController(SalesmenService salesmenService) {
        this.salesmenService = salesmenService;
    }

    @GetMapping(path = "/all")
    public List<Salesmen> getSalesmen() {
        return salesmenService.getSalesmen();
    }

    @GetMapping(path = "/{id}")
    public Salesmen getOneSalesmen(@PathVariable(required = true) Long id) {
        return salesmenService.getOneSalesmen(id);
    }

    @PostMapping
    public void registerNewSalesmen(@RequestBody Salesmen salesmen) {
        salesmenService.addNewSalesmen(salesmen);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteSalesmen(@PathVariable(required = true) Long id) {
        salesmenService.deleteSalesmen(id);
    }

    @PutMapping(path = "/{id}")
    public void updateSalesmen(@PathVariable(required = true) Long id, @RequestBody(required = true) Salesmen salesmen) {
        salesmenService.updateSalesmen(id, salesmen);
    }

}

