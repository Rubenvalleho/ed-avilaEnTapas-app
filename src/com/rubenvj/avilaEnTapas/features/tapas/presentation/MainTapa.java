package com.rubenvj.avilaEnTapas.features.tapas.presentation;

import com.rubenvj.avilaEnTapas.features.tapas.data.TapaDataRepository;
import com.rubenvj.avilaEnTapas.features.tapas.domain.*;

import java.util.ArrayList;

public class MainTapa {

    public static void printTapas() {
        GetTapasUseCase getTapasUseCase = new GetTapasUseCase(TapaDataRepository.newInstance());
        ArrayList<Tapa> tapas = getTapasUseCase.execute();

        System.out.println(tapas.toString());
    }

    public static void printTapa(String idTapa) {
        GetTapaUseCase getTapaUseCase = new GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = getTapaUseCase.execute(idTapa);
    }

    public static void deleteTapa (String idTapa) {
        printTapas();
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository.newInstance());
        deleteTapaUseCase.execute(idTapa);
        printTapas();
    }

    public static void saveTapa(Tapa tapa) {

    }

    public static void updateTapa(Tapa tapa) {

    }


}
