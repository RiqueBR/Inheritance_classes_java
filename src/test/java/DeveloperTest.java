import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer dev;

    @Before
    public void setUp()  {
        dev = new Developer("Developer Dave", 0101, 3000);
    }

    @Test
    public void hasName() {
        assertEquals("Developer Dave", dev.getName());
    }

    @Test
    public void hasNInumber() {
        assertEquals(0101, dev.getNationalInsurance());
    }

    @Test
    public void hasSalary() {
        assertEquals(3000, dev.getSalary(), 0);
    }


    @Test
    public void hasRaisedSalary() {
        dev.setSalary(dev.raiseSalary(0.05));
        assertEquals(3150, dev.getSalary(), 0);
    }

    @Test
    public void hasBonusAddedToSalary() {
        dev.setSalary(dev.payBonus());
        assertEquals(3030, dev.getSalary(),0);
    }
}
