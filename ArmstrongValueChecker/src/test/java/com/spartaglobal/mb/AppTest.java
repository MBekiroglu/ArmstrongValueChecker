package com.spartaglobal.mb;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    ArmstrongChecker armstrongChecker = new ArmstrongChecker();

    @Test
    public void shouldAnswerWithTrue() {
        Assertions.assertTrue(armstrongChecker.isArmstrong(153));
    }
    @Test
    public void shouldAnswerWithFalse() {
        Assertions.assertFalse(armstrongChecker.isArmstrong(2));
    }
    @Test
    public void shouldAnswerTrue2() {
        Assertions.assertTrue(armstrongChecker.isArmstrong(370));
    }
    @Test
    public void testLargeValues() {
        Assertions.assertFalse(armstrongChecker.isArmstrong(300032170));
    }
    @Test
    public void testMaxInt() {
        Assertions.assertFalse(armstrongChecker.isArmstrong(Integer.MAX_VALUE));
    }
    @Test
    public void shouldAnswerTrue3() {
        Assertions.assertTrue(armstrongChecker.isArmstrong(407));
    }
    @Test
    public void shouldAnswerFalse() {
        Assertions.assertFalse(armstrongChecker.isArmstrong(-407));
    }
}
