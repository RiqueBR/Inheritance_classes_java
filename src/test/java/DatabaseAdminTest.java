import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin dbStaff;

    @Before
    public void setUp() {
        dbStaff = new DatabaseAdmin("Database Bob", 6573, 1500);
    }

    @Test
    public void hasName() {
        assertEquals("Database Bob", dbStaff.getName());
    }

    @Test
    public void hasNInumber() {
        assertEquals(6573, dbStaff.getNationalInsurance());
    }

    @Test
    public void hasSalary() {
        assertEquals(1500, dbStaff.getSalary(), 0);
    }


    @Test
    public void hasRaisedSalary() {
        dbStaff.setSalary(dbStaff.raiseSalary(0.05));
        assertEquals(1575, dbStaff.getSalary(), 0);
    }

    @Test
    public void hasBonusAddedToSalary() {
        dbStaff.setSalary(dbStaff.payBonus());
        assertEquals(1515, dbStaff.getSalary(),0);
    }
}
