package com.mamata.testing;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Mytest {

    @Test
    public void checkTwoNo(){
        Arithmetic arithmetic = new Arithmetic();
        float expected = 5;
        float actual = arithmetic.add(2,3);
        assertEquals(expected,actual);

    }
}
