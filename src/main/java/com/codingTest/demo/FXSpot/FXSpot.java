package com.codingTest.demo.FXSpot;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class FXSpot {
    private String currency1;
    private String currency2;
    private BigDecimal fxRateValue;
    private LocalDateTime dateTime;
    private List<String> labels;

    public FXSpot(String currency1, String currency2, BigDecimal fxRateValue, LocalDateTime dateTime, List<String> labels) {
        this.currency1 = currency1;
        this.currency2 = currency2;
        this.fxRateValue = fxRateValue;
        this.dateTime = dateTime;
        this.labels = labels;
    }

    public String getCurrency1() {
        return currency1;
    }

    public String getCurrency2() {
        return currency2;
    }

    public BigDecimal getFxRateValue() {
        return fxRateValue;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public List<String> getLabels() {
        return labels;
    }
}