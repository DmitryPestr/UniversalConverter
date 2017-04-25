package uconverter;

public class FahrenheitUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return (value - 32) * 5.0 / 9.0 + 273.15;
    }

    @Override
    public double fromSI(double siValue) {
        return (siValue - 273.15) * 9.0 / 5.0 + 32;
    }

    @Override
    public String getName() {
        return "Fahrenheit";
    }

}
