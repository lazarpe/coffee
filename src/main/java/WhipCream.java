import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WhipCream extends CondimentDecorator {
    public static final String NAME = "Whip Cream";
    public static final double PRICE = 0.45;
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
