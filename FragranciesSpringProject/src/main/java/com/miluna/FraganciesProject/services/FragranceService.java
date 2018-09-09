package com.miluna.FraganciesProject.services;

import com.miluna.FraganciesProject.dto.Fragrance;

import java.util.List;

public interface FragranceService {

    List<Fragrance> getAll();

    Fragrance getById(String id);

    List<Fragrance> getByNumber(long number);

    List<Fragrance> getByName(String name);

    Fragrance addFragrance(Fragrance fragrance);

}
