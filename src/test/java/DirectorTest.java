import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp()  {
        director = new Director("Director Doug", 3462, 4000, "Sales", 7000);
    }

    @Test
    public void hasName() {
        assertEquals("Director Doug", director.getName());
    }

    @Test
    public void hasNInumber() {
        assertEquals(3462, director.getNationalInsurance());
    }

    @Test
    public void hasSalary() {
        assertEquals(4000, director.getSalary(), 0);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void hasABudget() {
        assertEquals(7000, director.getBudget(), 0);
    }

    @Test
    public void hasRaisedSalary() {
        director.setSalary(director.raiseSalary(0.05));
        assertEquals(4200, director.getSalary(), 0);
    }

    @Test
    public void hasBonusAddedToSalary() {
        director.setSalary(director.payBonus());
        assertEquals(4040, director.getSalary(),0);
    }
}

