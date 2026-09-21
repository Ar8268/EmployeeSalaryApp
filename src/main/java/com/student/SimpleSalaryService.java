package com.student;

public class SimpleSalaryService implements SalaryService {

    @Override
    public double getBonus(String employeeId) {

        if (employeeId != null && employeeId.startsWith("VIP")) {
            return 2000.0;
        }
        return 500.0;
    }

    @Override
    public boolean checkPromotion(int score) {

        return score >= 80;
    }
}