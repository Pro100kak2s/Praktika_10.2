package com.company;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicanChair createMagicanChair();
    FunctionalChair createFunctionalChair();
}
