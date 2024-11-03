package com.codingTest.demo.FXSpot.respository.impl;

import com.codingTest.demo.FXSpot.FXSpot;
import com.codingTest.demo.FXSpot.respository.FxSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class FxSpotRepositoryImpl implements FxSpotRepository {
    private List<FXSpot> fxSpots = new ArrayList<>();

    @Override
    public void add(FXSpot fxSpot) {
        fxSpots.add(fxSpot);
    }

    @Override
    public List<FXSpot> getByCurrencyPair(String currency1, String currency2) {
        List<FXSpot> result = new ArrayList<>();
        for (FXSpot fxSpot : fxSpots) {
            if (fxSpot.getCurrency1().equals(currency1) && fxSpot.getCurrency2().equals(currency2)) {
                result.add(fxSpot);
            }
        }
        return result;
    }
}
