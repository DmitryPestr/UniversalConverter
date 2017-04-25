package uconverter;

public class FootUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value * 0.3048;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue / 0.3048;
    }

    @Override
    public String getName() {
        return "Foot";
    }

}
