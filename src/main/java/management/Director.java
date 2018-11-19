package management;

public class Director extends Manager{

    private double budget;

    public Director(String name, int nationalInsurance, double salary, String deptName, double budget) {
        super(name, nationalInsurance, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
