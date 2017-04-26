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
public class FahrenheitUnitConverterTest {
    FahrenheitUnitConverter converter = new FahrenheitUnitConverter();

    @Parameterized.Parameter(0)
    public double srcFahrenheit;
    @Parameterized.Parameter(1)
    public double trgFahrenheit;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {10.0, 260.927778},
                {100.0, 310.927778},
                {150.0, 338.705556}
        });
    }

    @Test
    public void toSI() throws Exception {
        assertEquals(trgFahrenheit, converter.toSI(srcFahrenheit), 0.00001);
    }

    @Test
    public void fromSI() throws Exception {
        assertEquals(srcFahrenheit, converter.fromSI(trgFahrenheit), 0.00001);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Fahrenheit", converter.getName());
    }

}