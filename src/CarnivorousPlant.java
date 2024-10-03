public class CarnivorousPlant extends Plants implements AmountOfFluid{

    public CarnivorousPlant(String name, double size) {
        super(name, size);
    }


    public String toString() {
        return "Köttätande växten " + super.getName()
                + " behöver: " + getAmountOfFluid() + " liter "
                + getTypeOfFluid() + " varje dag.";
    }

    @Override
    public TypeOfFluid getTypeOfFluid() {
        return TypeOfFluid.Proteindricka;
    }

    @Override
    public double getAmountOfFluid() {
        return 0.1 + (0.2*this.getSize());
    }
}
