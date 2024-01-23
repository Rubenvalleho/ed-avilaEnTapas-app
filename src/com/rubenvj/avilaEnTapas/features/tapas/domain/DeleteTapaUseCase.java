package com.rubenvj.avilaEnTapas.features.tapas.domain;

public class DeleteTapaUseCase {
    private final TapaRepository tapaRepository;
    public DeleteTapaUseCase (TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }
    public void execute (String idTapa) {
        this.tapaRepository.deleteTapa(idTapa);
    }
}
