package uconverter;

public class PoundUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value * 0.45359237;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue / 0.45359237;
    }

    @Override
    public String getName() {
        return "Pound";
    }

}
