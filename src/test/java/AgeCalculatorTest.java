import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgeCalculatorTest {

    AgeCalculator ageCalculator;

    @Before
    public void setup(){

        ageCalculator = new AgeCalculator(37);
    }

    @Test
    public void getEarthAge(){
    assertEquals(37, ageCalculator.getEarthAge(), 0.01);
    }

    @Test
    public void getMercuryAge(){
        assertEquals(8.9113279, ageCalculator.mercuryAge(), 0.01);
    }

    @Test
    public void getVenusAge() {
        assertEquals(22.76229862, ageCalculator.venusAge(), 0.01);
    }

    @Test
    public void nameMarsAge() {
        assertEquals(69.5901846, ageCalculator.marsAge(), 0.01);
    }

    @Test
    public void getJupiterAge() {
        assertEquals(438.916755, ageCalculator.jupiterAge(), 0.01);
    }

    @Test
    public void getSaturnAge() {
        assertEquals(1089.557426, ageCalculator.saturnAge(), 0.01);
    }

    @Test
    public void getUranusAge(){
        assertEquals(3108.623302, ageCalculator.uranusAge(), 0.01);

    }

    @Test
    public void getNeptuneAge() {
        assertEquals(6097.27884, ageCalculator.neptuneAge(), 0.01);
    }

    @Test
    public void getPlutoAge() {
        assertEquals(9176, ageCalculator.plutoAge(), 0.01);
    }
}

