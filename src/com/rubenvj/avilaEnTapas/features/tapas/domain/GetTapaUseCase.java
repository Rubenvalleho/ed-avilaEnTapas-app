package com.rubenvj.avilaEnTapas.features.tapas.domain;

public class GetTapaUseCase {
    private final TapaRepository tapaRepository;
    public GetTapaUseCase (TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }
    public Tapa execute (String idTapa) {
        return this.tapaRepository.obtainTapa(idTapa);
    }
}
