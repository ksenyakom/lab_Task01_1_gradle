package by.oznobishina.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    public void isPositiveNumber() {
        String number = "123";
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPositiveNumber(number));
    }
}