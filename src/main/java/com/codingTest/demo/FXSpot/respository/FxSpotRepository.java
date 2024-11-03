package com.codingTest.demo.FXSpot.respository;

import com.codingTest.demo.FXSpot.FXSpot;

import java.util.List;

public interface FxSpotRepository {
    void add(FXSpot fxSpot);

    List<FXSpot> getByCurrencyPair(String currency1, String currency2);
}
