package com.example.CrudApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {
    @Autowired
    SalesRepository repo;

    @PostMapping("/sales")
    public Sales create(@RequestBody Sales s){
        return repo.save(s);
    }

    @GetMapping("/sales")
    public List <Sales> getAll(){
        return repo.findAll();
    }

    @DeleteMapping("/sales/{id}") 
        public void delete(@PathVariable Long id){
         repo.deleteById(id);
        }
    
    
}


