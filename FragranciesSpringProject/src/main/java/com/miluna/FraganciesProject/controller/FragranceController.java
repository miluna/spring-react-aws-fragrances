package com.miluna.FraganciesProject.controller;

import com.miluna.FraganciesProject.dto.Fragrance;
import com.miluna.FraganciesProject.services.FragranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class FragranceController {

    @Autowired
    FragranceService service;

    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }

    @GetMapping(value = "/fragrances")
    public ResponseEntity<List> getAllFragrances(){
        List<Fragrance> list = service.getAll();

        return ResponseEntity.ok(list);
    }

    @PostMapping(value = "/fragrances")
    public ResponseEntity<HttpStatus> addFragrance(@RequestBody Fragrance fragrance){
        service.addFragrance(fragrance);

        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @GetMapping(value = "/fragrances/{id}")
    public ResponseEntity<Fragrance> getFragranceById(@PathVariable String id){
        Fragrance search = service.getById(id);

        return ResponseEntity.ok(search);
    }

    @GetMapping(value = "/fragrances/number/{searchNumber}")
    public ResponseEntity<List> getFragranceByNumber(@PathVariable long searchNumber){
        List<Fragrance> list = service.getByNumber(searchNumber);

        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/fragrances/name/{searchName}")
    public ResponseEntity<List> getFragranceByName(@PathVariable String searchName){
        List<Fragrance> list = service.getByName(searchName);

        return ResponseEntity.ok(list);
    }

}
