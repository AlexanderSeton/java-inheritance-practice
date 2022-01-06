import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Jon", 123456789, 10.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Jon", databaseAdmin.getName());
    }

    @Test
    public void canGetInsuranceNumber(){
        assertEquals(123456789, databaseAdmin.getInsuranceNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(10.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1.0);
        assertEquals(11.00,databaseAdmin.getSalary(),0.0);
    }

    @Test
    public void canGetBonus() {
        double bonus = databaseAdmin.payBonus();
        assertEquals(0.100, bonus, 0.0);
    }

}
