package act7_1;

public class ParttimeEmployee extends Employee {
    private int totalWorkingShift = 10 + (int)(Math.random()*11); // random between 10 - 20 shifts
    private long baseSalary = 100000 + (int)(Math.random()* 2) * 100000; //random between 100.000 - 200.000 a shift
    final static int MEAL_ALLOWANCE = 0;

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingShift;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    public ParttimeEmployee() {
        super();
    }

    public ParttimeEmployee(String name, int age, String id) {
        super(name, age, id);
    }

    public void setTotalWorkingShift(int totalWorkingShift) {
        this.totalWorkingShift = totalWorkingShift;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }
}
