package code.neoflex_calculator.model;

public class OperationModel {
   private int workMonth;

   private int daysVacation;

   private int workInWeekends;

   private int workDaysInWeek;

   private int sickDays;

   private double salaryInMonth;

   private double bonus;

   private double workExperienceYears;

    public OperationModel() {
    }

    public int getWorkMonth() {
        return workMonth;
    }

    public void setWorkMonth(int workMonth) {
        this.workMonth = workMonth;
    }

    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
        this.daysVacation = daysVacation;
    }

    public int getWorkInWeekends() {
        return workInWeekends;
    }

    public void setWorkInWeekends(int workInWeekends) {
        this.workInWeekends = workInWeekends;
    }

    public int getWorkDaysInWeek() {
        return workDaysInWeek;
    }

    public void setWorkDaysInWeek(int workDaysInWeek) {
        this.workDaysInWeek = workDaysInWeek;
    }

    public int getSickDays() {
        return sickDays;
    }

    public void setSickDays(int sickDays) {
        this.sickDays = sickDays;
    }

    public double getSalaryInMonth() {
        return salaryInMonth;
    }

    public void setSalaryInMonth(double salaryInMonth) {
        this.salaryInMonth = salaryInMonth;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getWorkExperienceYears() {
        return workExperienceYears;
    }

    public void setWorkExperienceYears(double workExperienceYears) {
        this.workExperienceYears = workExperienceYears;
    }

    public OperationModel(int workMonth,
                          int daysVacation,
                          double salaryInMonth,
                          double bonus,
                          int workDaysInWeek,
                          int workInWeekends,
                          int sickDays,
                          double workExperienceYears) {
        this.workMonth = workMonth;
        this.daysVacation = daysVacation;
        this.salaryInMonth = salaryInMonth;
        this.bonus = bonus;
        this.workDaysInWeek = workDaysInWeek;
        this.workInWeekends = workInWeekends;
        this.sickDays = sickDays;
        this.workExperienceYears = workExperienceYears;
    }

}
