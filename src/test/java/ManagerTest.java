import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Jon", 123456789, 10.00, "PSD");
    }

    @Test
    public void canGetName() {
        assertEquals("Jon", manager.getName());
    }

    @Test
    public void canGetInsuranceNumber(){
        assertEquals(123456789, manager.getInsuranceNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(10.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
    manager.raiseSalary(1.0);
    assertEquals(11.00,manager.getSalary(),0.0);
    }

    @Test
    public void canGetBonus() {
        double bonus = manager.payBonus();
        assertEquals(0.100, bonus, 0.0);
    }

}
