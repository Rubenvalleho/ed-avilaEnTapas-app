package com.rubenvj.avilaEnTapas.features.tapas.domain;

import com.rubenvj.avilaEnTapas.features.tapas.data.TapaDataRepository;

public class SaveTapaUseCase {
    private final TapaRepository tapaRepository;

    public SaveTapaUseCase (TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    public void execute (Tapa tapa) {
        this.tapaRepository.saveTapa(tapa);
    }

}
