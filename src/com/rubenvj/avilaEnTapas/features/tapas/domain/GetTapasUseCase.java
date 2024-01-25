package com.rubenvj.avilaEnTapas.features.tapas.domain;

import java.util.ArrayList;

public class GetTapasUseCase {
    private final TapaRepository tapaRepository;
    public GetTapasUseCase (TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }
    public ArrayList<Tapa> execute () {
        return tapaRepository.obtainTapas();
    }
}
