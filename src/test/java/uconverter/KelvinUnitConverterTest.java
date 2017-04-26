package uconverter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JavaCourses on 26.04.2017..
 */
public class KelvinUnitConverterTest {
    KelvinUnitConverter converter = new KelvinUnitConverter();

    @Test
    public void toSI() throws Exception {
        assertEquals(10, converter.toSI(10), 0.00001);
    }

    @Test
    public void fromSI() throws Exception {
        assertEquals(10, converter.fromSI(10), 0.00001);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Kelvin", converter.getName());
    }

}