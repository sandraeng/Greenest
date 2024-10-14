public class CarnivorousPlant extends Plants implements AmountOfFluid{

    public CarnivorousPlant(String name, double size) {
        super(name, size);
    }

    @Override
    public String toString() {
        return "Köttätande växten " + super.getName()
                + " behöver: " + getAmountOfFluid() + " liter "
                + getTypeOfFluid() + " varje dag.";
    }

    @Override
    public String getTypeOfFluid() {
        return TypeOfFluid.Proteindricka.toString().toLowerCase();
    }

    @Override
    public double getAmountOfFluid() {
        return 0.1 + (0.2*this.getSize());
    }
}
