public class Cacti extends Plants implements AmountOfFluid {

    public Cacti(String name, double size) {
        super(name, size);
    }

    // polymorphism
    @Override
    public String toString() {
        return "Kaktusen " + super.getName() + " behöver: " + getAmountOfFluid()
                + " cl " + getTypeOfFluid() + " varje dag";
    }

    @Override
    public String getTypeOfFluid() {
        return TypeOfFluid.Mineralvatten.toString().toLowerCase();
    }

    @Override
    public double getAmountOfFluid() {
        return 2;
    }
}
