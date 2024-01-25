package com.rubenvj.avilaEnTapas.features.tapas.data;

import com.rubenvj.avilaEnTapas.features.tapas.domain.Tapa;
import com.rubenvj.avilaEnTapas.features.tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {

    private static TapaDataRepository instance = null;
    private final ArrayList<Tapa> localTapas = new ArrayList<>();
    private TapaDataRepository() {
        initData();
    }

    @Override
    public ArrayList<Tapa> obtainTapas() {
        return localTapas;
    }

    @Override
    public Tapa obtainTapa (String idTapa) {
        for (Tapa tapa : localTapas) {
            if (tapa.getIdTapa().equals(idTapa)) {
                return tapa;
            }
        }
        return null;
    }

    @Override
    public void updateTapa(Tapa tapa) {
        for (int i = 0; i < localTapas.size(); i++) {
            if (localTapas.get(i).getIdTapa().equals(tapa.getIdTapa())) {
                localTapas.add(i, tapa);
            }
        }
    }

    public void saveTapa(Tapa tapa) {
        localTapas.add(tapa);
    }

    public void deleteTapa(String idTapa) {
        for (int i = 0; i < localTapas.size(); i++) {
            if (localTapas.get(i).getIdTapa().equals(idTapa)) {
                localTapas.remove(i);
            }
        }
    }

    private void initData() {
        localTapas.add(new Tapa("001", "Chorizo al vino", "D`vinos", "970", "4,31", "33", "243", "- Chorizo  -Vino blanco  -Pan"));
        localTapas.add(new Tapa("002", "Hot-dog", "La selva", "950", "4,20", "33", "220", "-Pan  -Salchicha"));
    }

    public static TapaDataRepository newInstance() {
        if (instance==null) {
            instance = new TapaDataRepository();
        }
        return instance;
    }
}
