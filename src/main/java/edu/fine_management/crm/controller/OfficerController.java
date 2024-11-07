package edu.fine_management.crm.controller;

import edu.fine_management.crm.model.Officer;
import edu.fine_management.crm.service.OfficerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/officer")
@RequiredArgsConstructor
public class OfficerController {
    final OfficerService officerService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Officer officer){
        officerService.add(officer);
    }

    @GetMapping("view-all")
    public List<Officer> getAll(){
        return officerService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable Integer id){
        officerService.delete(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update(@RequestBody Officer officer){
        officerService.add(officer);
    }

    @GetMapping("/get-by-id/{id}")
    public Officer getById(@PathVariable Integer id){
        return officerService.getById(id);
    }

    @GetMapping("/get-by-officer-id/{id}")
    public Officer getByOfficerId(@PathVariable String id){
        return officerService.getByOfficerId(id);
    }

    @GetMapping("/get-by-nic/{nic}")
    public Officer getByNic(@PathVariable String nic){
        return officerService.getByNic(nic);
    }

    @GetMapping("/get-by-name/{name}")
    public List<Officer> getByName(@PathVariable String name){
        return officerService.getByName(name);
    }

    @GetMapping("/get-by-position/{position}")
    public List<Officer> getByPosition(@PathVariable String position){
        return officerService.getByPosition(position);
    }

}
