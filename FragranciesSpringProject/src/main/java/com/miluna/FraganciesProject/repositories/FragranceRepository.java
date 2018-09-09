package com.miluna.FraganciesProject.repositories;

import com.miluna.FraganciesProject.dto.Fragrance;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FragranceRepository extends MongoRepository<Fragrance, String> {

    Fragrance getById(String id);

    List<Fragrance> getAllByNumber(long number, Sort sort);

    List<Fragrance> getAllByNameIsContaining(String name, Sort sort);

}
