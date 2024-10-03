public class Palm extends Plants implements AmountOfFluid{

    public Palm(String name, double size) {
        super(name, size);
    }

    @Override
    public String toString() {
        return "Palmen " + super.getName()
                + " behöver: " + getAmountOfFluid() + " liter "
                + getTypeOfFluid() + " varje dag.";
    }

    @Override
    public TypeOfFluid getTypeOfFluid() {
        return TypeOfFluid.Kranvatten;
    }

    @Override
    public double getAmountOfFluid() {
        return 0.5 * this.getSize();
    }
}
