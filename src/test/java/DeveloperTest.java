import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jon", 123456789, 10.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Jon", developer.getName());
    }

    @Test
    public void canGetInsuranceNumber(){
        assertEquals(123456789, developer.getInsuranceNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(10.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1.0);
        assertEquals(11.00,developer.getSalary(),0.0);
    }

    @Test
    public void canGetBonus() {
        double bonus = developer.payBonus();
        assertEquals(0.100, bonus, 0.0);
    }

}
