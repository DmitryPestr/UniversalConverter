package uconverter;

import asg.cliche.Command;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class UniversalConverter {
    private List<UnitConverter> converters = Arrays.asList (
            new CelsiusUnitConverter(),      //index 0
            new FahrenheitUnitConverter(),   //index 1
            new KelvinUnitConverter(),        //index 2
            new MetreUnitConverter(),
            new InchUnitConverter(),
            new FootUnitConverter(),
            new KilogramUnitConverter(),
            new PoundUnitConverter(),
            new OunceUnitConverter()
    );

    private UnitConverter sourceConverter;
    private UnitConverter targetConverter;

    @Command
    public void list() {
        for (int i = 0; i < converters.size(); i++) {                    // for (init; term; inc)
            System.out.printf("%d - %s\n", i + 1, converters.get(i));    // %d - podstavit (i+1) %s - podstavit (converters.get(i))
        }                                                                // \n - perehod na novuju stroku
    }

    @Command
    public void source(int idx) {
        sourceConverter = converters.get(idx - 1);
    }

    @Command
    public void target(int idx) {
        targetConverter = converters.get(idx - 1);
    }

    @Command
    public double convert(double value) {
        double siValue = sourceConverter.toSI(value);
        double targetValue = targetConverter.fromSI(siValue);
        return targetValue;
    }
}
