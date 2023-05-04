package code.neoflex_calculator.service;

import code.neoflex_calculator.model.OperationModel;

import java.math.BigDecimal;

public interface OperationsOfSalaryService {
    BigDecimal calculateSalary(OperationModel model);
    double percentOfSalarySickLeave(OperationModel model);
    double workDaysMonth(OperationModel model);
    double vacationDays(OperationModel model);
    double sickLeave(OperationModel model);
}
