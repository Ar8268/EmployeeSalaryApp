package com.student;

public class SalaryAnalyzer {
    private SalaryService salaryService;

    public SalaryAnalyzer(SalaryService a) {
        this.salaryService = a;
    }

    public double calculateTotalCompensation(String employeeId, double baseSalary) {
        double bonus = salaryService.getBonus(employeeId);
        return baseSalary + bonus;
    }

    public boolean evaluateEmployee(int score) {
        return salaryService.checkPromotion(score);
    }
}