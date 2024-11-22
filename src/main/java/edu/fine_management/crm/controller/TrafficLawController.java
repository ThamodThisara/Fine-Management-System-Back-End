package edu.fine_management.crm.controller;

import edu.fine_management.crm.model.Fine;
import edu.fine_management.crm.model.TrafficLaw;
import edu.fine_management.crm.service.TrafficLawService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/trafficLaw")
public class TrafficLawController {
    final TrafficLawService trafficLawService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody TrafficLaw trafficLaw){
        trafficLawService.add(trafficLaw);
    }

    @GetMapping("view-all")
    public List<TrafficLaw> getAll(){
        return trafficLawService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable Integer id){
        trafficLawService.delete(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update(@RequestBody TrafficLaw trafficLaw){
        trafficLawService.add(trafficLaw);
    }

    @GetMapping("/get-by-id/{id}")
    public TrafficLaw getById(@PathVariable Integer id){
        return trafficLawService.getById(id);
    }

    @GetMapping("/get-traffic-law-count")
    public Integer getTrafficLawCount() {
        return trafficLawService.getTrafficLawCount();
    }
}
