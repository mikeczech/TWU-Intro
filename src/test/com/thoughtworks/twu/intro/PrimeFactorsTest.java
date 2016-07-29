package com.thoughtworks.twu.intro;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorsTest {

    @Test
    public void testFactorizationWithEmptyResult() {
        List<Integer> factors = PrimeFactors.factorize(1);
        assertTrue(factors.isEmpty());
    }

    @Test
    public void testFactorization() {
        List<Integer> factors = PrimeFactors.factorize(30);
        assertEquals(Arrays.asList(2, 3, 5), factors);
    }

}