package uconverter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JavaCourses on 26.04.2017..
 */
public class CelsiusUnitConverterTest {
    CelsiusUnitConverter converter = new CelsiusUnitConverter();

    @Test
    public void toSI() throws Exception {
        assertEquals(283.15, converter.toSI(10), 0.00001);
    }

    @Test
    public void fromSI() throws Exception {
        assertEquals(-263.15, converter.fromSI(10), 0.00001);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Celsius", converter.getName());
    }

}