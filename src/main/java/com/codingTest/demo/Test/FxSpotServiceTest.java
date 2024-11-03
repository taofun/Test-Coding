package com.codingTest.demo.Test;

import com.codingTest.demo.FXSpot.FXSpot;
import com.codingTest.demo.FXSpot.Service.FxSpotService;
import com.codingTest.demo.FXSpot.respository.FxSpotRepository;
import com.codingTest.demo.FXSpot.respository.impl.FxSpotRepositoryImpl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FxSpotServiceTest {
    @Test
    void testDoubleFxSpotRates() {
        FxSpotRepository repository = new FxSpotRepositoryImpl();
        FXSpot fxSpot1 = new FXSpot("USD", "CNY", BigDecimal.valueOf(100.32), LocalDateTime.now(), List.of("latest"));
        repository.add(fxSpot1);

        FxSpotService service = new FxSpotService(repository);

        List<BigDecimal> expected = List.of(BigDecimal.valueOf(200.64));
        List<BigDecimal> actual = service.doubleFxSpotRates("USD", "CNY");

        assertEquals(expected, actual);
    }
}
