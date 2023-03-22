package ru.netology.Martynova5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class VacationTest {
    @ParameterizedTest
    @CsvSource ({
            "10_000,3_000,20_000,6",
            "100_000,60_000,150_000,2"
    })
    public void testFirst(int income, int expenses, int threshold, int expected) {
        Vacation service = new Vacation();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
