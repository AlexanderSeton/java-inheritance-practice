import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before() {
        director = new Director("Jon", 123456789, 10.00, "PSD", 1000.0);
    }

    @Test
    public void canGetName() {
        assertEquals("Jon", director.getName());
    }

    @Test
    public void canGetInsuranceNumber(){
        assertEquals(123456789, director.getInsuranceNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(10.00, director.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.0);
        assertEquals(11.00,director.getSalary(),0.0);
    }

    @Test
    public void canGetBonus() {
        double bonus = director.payBonus();
        assertEquals(0.200, bonus, 0.0);
    }

    @Test
    public void canGetDept() {
        assertEquals("PSD", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000.0, director.getBudget(), 0.0);
    }

}
