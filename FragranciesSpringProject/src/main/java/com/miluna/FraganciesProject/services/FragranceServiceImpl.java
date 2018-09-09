package com.miluna.FraganciesProject.services;

import com.miluna.FraganciesProject.dto.Fragrance;
import com.miluna.FraganciesProject.repositories.FragranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FragranceServiceImpl implements FragranceService {


    @Autowired
    FragranceRepository repository;

    @Override
    public List<Fragrance> getAll() {

        return repository.findAll();
    }

    @Override
    public Fragrance getById(String id) {

        return repository.getById(id);
    }

    @Override
    public List<Fragrance> getByNumber(long number) {
        Sort sort = new Sort(Sort.Direction.ASC, "number");
        return repository.getAllByNumber(number, sort);
    }

    @Override
    public List<Fragrance> getByName(String name) {
        Sort sort = new Sort(Sort.Direction.ASC, "number");
        return repository.getAllByNameIsContaining(name, sort);
    }

    @Override
    public Fragrance addFragrance(Fragrance fragrance) {

        return repository.save(fragrance);
    }
}
