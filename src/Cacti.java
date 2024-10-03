public class Cacti extends Plants implements AmountOfFluid {

    public Cacti(String name, double size) {
        super(name, size);
    }

    @Override
    public String toString() {
        return "Kaktusen " + super.getName() + " behöver: " + getAmountOfFluid()
                + " cl " + getTypeOfFluid() + " varje dag";
    }

    @Override
    public TypeOfFluid getTypeOfFluid() {
        return TypeOfFluid.Mineralvatten;
    }

    @Override
    public double getAmountOfFluid() {
        return 2;
    }
}
