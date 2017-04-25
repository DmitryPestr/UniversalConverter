package uconverter;

public class OunceUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value * 0.02834952;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue / 0.02834952;
    }

    @Override
    public String getName() {
        return "Ounce";
    }

}
