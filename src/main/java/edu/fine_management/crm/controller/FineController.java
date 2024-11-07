package edu.fine_management.crm.controller;

import edu.fine_management.crm.model.Fine;
import edu.fine_management.crm.model.Officer;
import edu.fine_management.crm.service.FineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/fine")
public class FineController {
    final FineService fineService;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Fine fine) {
        fineService.add(fine);
    }

    @GetMapping("view-all")
    public List<Fine> getAll(){
        return fineService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable Integer id){
        fineService.delete(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update(@RequestBody Fine fine){
        fineService.add(fine);
    }

    @GetMapping("/get-by-id/{id}")
    public Fine getById(@PathVariable Integer id){
        return fineService.getById(id);
    }

    @GetMapping("/get-by-date/{date}")
    public List<Fine> getByDate(@PathVariable LocalDate date) {
        return fineService.getByDate(date);
    }
}
