package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class CountTest {

    @ParameterizedTest
    @CsvSource(value = {
            "31,0",
            "26,2",
            "25,2",
            "20,8"})

    public void validCountMore(int money, int expected) {
        int[] prices = {13, 17, 19, 25, 25, 25, 25, 25, 25, 27, 30};
        Assertions.assertEquals(expected, Main.countMore(prices, money));
    }
    @ParameterizedTest
    @CsvSource(value = {
            "44,15",
            "44,2",
            "44,100",
            "44,8"})
    public void invalidCountMore (int money, int expected){
        int[] prices = {13, 17, 19, 25, 25, 25, 25, 25, 25, 27, 30};
        Assertions.assertNotEquals(Main.countMore(prices, money), expected);
    }

}