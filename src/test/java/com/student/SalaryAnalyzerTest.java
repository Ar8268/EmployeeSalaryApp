package com.student;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SalaryAnalyzerTest {
    
    private SalaryAnalyzer a;

   
    @BeforeEach 
    public void SetUp() {
        SalaryService s = new SimpleSalaryService();
        a = new SalaryAnalyzer(s);
    }

    @Test
    public void TestVipBonus() {
        double t = a.calculateTotalCompensation("VIP1", 5000.0);
        assertEquals(7000.0, t, 0.001);
    }
 @Test
    public void TestRegularBonus() {
        double t = a.calculateTotalCompensation("aaaa1", 5000.0);
        assertEquals(5500.0, t, 0.001);
    }
     @Test
    public void testNull() {
        double t = a.calculateTotalCompensation(null, 5000.0);
        assertEquals(5500.0, t, 0.001);
    }
    

    @Test
    public void testPromotion() {

        boolean r = a.evaluateEmployee(90);
        assertTrue(r);
    }

    @Test
    public void testNoteligibleorpromotion() {

        boolean r = a.evaluateEmployee(70);
        assertFalse(r);
    }

    @Test
    public void testPromotionExactBoundary() {

        boolean r = a.evaluateEmployee(80);
        assertTrue(r);
    }
}