package act7_1;

public abstract class Employee {
    private String name;
    private int age;
    private String idNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public abstract long getMealAllowance();

    public abstract long getSalaryRate();

    public abstract int getWorkingCount();

    public long calculateSalary() {
        return getSalaryRate() * getWorkingCount() + getMealAllowance();
    }
}
