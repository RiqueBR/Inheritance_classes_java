import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp()  {
        manager = new Manager("Rique", 2987, 2000, "IT");
    }

    @Test
    public void hasName() {
        assertEquals("Rique", manager.getName());
    }

    @Test
    public void hasNInumber() {
        assertEquals(2987, manager.getNationalInsurance());
    }

    @Test
    public void hasSalary() {
        assertEquals(2000, manager.getSalary(), 0);
    }

    @Test
    public void hasDeptName() {
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void hasRaisedSalary() {
    manager.setSalary(manager.raiseSalary(0.05));
    assertEquals(2100, manager.getSalary(), 0);
    }

    @Test
    public void hasBonusAddedToSalary() {
    manager.setSalary(manager.payBonus());
    assertEquals(2020, manager.getSalary(),0);
    }
}
