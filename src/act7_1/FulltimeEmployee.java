package act7_1;

public class FulltimeEmployee extends Employee {
    private int totalWorkingdays = 20 + (int)(Math.random()*11); // random between 20 - 30 days
    private long daySalary = 500000 + (int)(Math.random()*6) * 100000; // random between 500.000 - 1.000.000
    final static long MEAL_ALLOWANCE = 2000000; // full-time subsidy

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingdays;
    }

    @Override
    public long getSalaryRate() {
        return daySalary;
    }

    public FulltimeEmployee() {

    }

    public FulltimeEmployee(String name, int age, String id) {
        setAge(age);
        setName(name);
        setIdNumber(id);
    }

    public void setTotalWorkingdays(int totalWorkingdays) {
        this.totalWorkingdays = totalWorkingdays;
    }

    public void setDaySalary(long daySalary) {
        this.daySalary = daySalary;
    }


}
