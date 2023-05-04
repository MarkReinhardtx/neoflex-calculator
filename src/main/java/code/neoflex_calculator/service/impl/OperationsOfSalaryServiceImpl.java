package code.neoflex_calculator.service.impl;

import code.neoflex_calculator.model.OperationModel;
import code.neoflex_calculator.service.OperationsOfSalaryService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class OperationsOfSalaryServiceImpl implements OperationsOfSalaryService {

    @Override
    public BigDecimal calculateSalary(OperationModel model) {

        double percentOfSalary = percentOfSalarySickLeave(model);
        double workDaysMonth = workDaysMonth(model);
        double dayOfVacation = vacationDays(model);
        double dayOfSickLeave = sickLeave(model);

        double result;

        result = (model.getWorkMonth() - (dayOfVacation
                + dayOfSickLeave))
                * (model.getSalaryInMonth() + model.getBonus())
                + (model.getDaysVacation() * (model.getSalaryInMonth() / workDaysMonth))
                + (model.getWorkInWeekends() * ((model.getSalaryInMonth() / workDaysMonth) * 2))
                + (((model.getSickDays() * (model.getSalaryInMonth() / workDaysMonth)) * percentOfSalary));

        BigDecimal calculate = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);

        return calculate;

    }
    @Override
    public double percentOfSalarySickLeave(OperationModel model) {
        double percentOfSalaryForSick;

        if (model.getWorkExperienceYears() < 5) {
            percentOfSalaryForSick = 0.6;
        } else if (model.getWorkExperienceYears() >= 5 && model.getWorkExperienceYears() < 8) {
            percentOfSalaryForSick = 0.8;
        } else percentOfSalaryForSick = 1;

        return percentOfSalaryForSick;
    }
    @Override
    public double workDaysMonth(OperationModel model) {

        double workDaysInMonth;

        if (model.getWorkDaysInWeek() == 5) {
            workDaysInMonth = 20.67;
        } else workDaysInMonth = 25;


        return workDaysInMonth;
    }
    @Override
    public double vacationDays(OperationModel model) {

        double workDays = workDaysMonth(model);

        double vacation;

        if (model.getDaysVacation() > 0) {
            vacation = model.getDaysVacation() / workDays;
        } else vacation = 0;

        return vacation;
    }
    @Override
    public double sickLeave(OperationModel model) {

        double workDays = workDaysMonth(model);

        double sickLeaveDays;

        if (model.getSickDays() > 0) {
            sickLeaveDays = model.getSickDays() / workDays;
        } else sickLeaveDays = 0;

        return sickLeaveDays;
    }
}
