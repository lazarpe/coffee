import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Caramel extends CondimentDecorator {
    public static final String NAME = Color.PURPLE_BOLD + "Caramel" + Color.RESET;
    public static final double PRICE = 0.50;
    private Beverage beverage;

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with " + NAME;
    }

    @Override
    public double cost() {
        return beverage.cost() + PRICE;
    }
}
