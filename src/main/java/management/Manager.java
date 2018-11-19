package management;

import staff.Employee;

public class Manager extends Employee {

private String deptName;

    public Manager(String name, int nationalInsurance, double salary, String deptName) {
        super(name, nationalInsurance, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public double raiseSalary(double salaryIncrementor) {
        double newSalary = super.getSalary() * salaryIncrementor;
        return newSalary + super.getSalary();
    }
}
