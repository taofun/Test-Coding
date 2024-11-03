package com.codingTest.demo.FXSpot.Service;

import com.codingTest.demo.FXSpot.FXSpot;
import com.codingTest.demo.FXSpot.respository.FxSpotRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class FxSpotService {
    private FxSpotRepository repository;

    public FxSpotService(FxSpotRepository repository) {
        this.repository = repository;
    }

    public List<BigDecimal> doubleFxSpotRates(String currency1, String currency2) {
        List<FXSpot> fxSpots = repository.getByCurrencyPair(currency1, currency2);
        return fxSpots.stream()
                .map(fxSpot -> fxSpot.getFxRateValue().multiply(BigDecimal.valueOf(2)))
                .collect(Collectors.toList());
    }
}
