package com.rubenvj.avilaEnTapas.features;

import com.rubenvj.avilaEnTapas.features.tapas.domain.Tapa;
import com.rubenvj.avilaEnTapas.features.tapas.presentation.MainTapa;

public class Main {
    public static void main(String[] args) {
        MainTapa.printTapas();
        MainTapa.saveTapa(new Tapa("002", "Hot-dog", "La selva", "950", "4,20", "33", "220", "-Pan  -Salchicha"));
    }
}