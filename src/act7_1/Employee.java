package act7_1;

public abstract class Employee {
    protected String name;
    protected int age;
    protected String idNumber;

    protected Employee() {

    }

    protected Employee(String name, int age, String idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

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
