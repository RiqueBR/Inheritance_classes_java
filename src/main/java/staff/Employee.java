package staff;

public abstract class Employee {

    private String name;
    private int nationalInsurance;
    private double salary;

    public Employee(String name, int nationalInsurance, double salary) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNationalInsurance() {
        return nationalInsurance;
    }

    public void setNationalInsurance(int nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double raiseSalary(double salaryIncrementor);

    public double payBonus(){
        double addedBonus = salary * 0.01;
        return addedBonus + salary;
    }

}
