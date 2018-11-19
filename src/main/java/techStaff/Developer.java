package techStaff;

import staff.Employee;

public class Developer extends Employee {
    public Developer(String name, int nationalInsurance, double salary) {
        super(name, nationalInsurance, salary);
    }

    public double raiseSalary(double salaryIncrementor) {
            double newSalary = super.getSalary() * salaryIncrementor;
            return newSalary + super.getSalary();
    }

}
