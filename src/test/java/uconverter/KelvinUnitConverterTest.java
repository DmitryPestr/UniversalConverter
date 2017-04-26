package uconverter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by JavaCourses on 26.04.2017..
 */

@RunWith(Parameterized.class)
public class KelvinUnitConverterTest {
    KelvinUnitConverter converter = new KelvinUnitConverter();

    @Parameterized.Parameters
    public Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {10.0, 10.0},
                {100.0, 100.0},
                {150.0, 150.0}
        });
    }

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