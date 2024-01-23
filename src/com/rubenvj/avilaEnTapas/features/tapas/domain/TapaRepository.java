package com.rubenvj.avilaEnTapas.features.tapas.domain;

import java.util.ArrayList;

public interface TapaRepository {
    Tapa obtainTapa(String idTapa);

    public ArrayList<Tapa> obtainTapas();

    void deleteTapa(String idTapa);

    void saveTapa(Tapa tapa);
    void updateTapa (Tapa tapa);

}
