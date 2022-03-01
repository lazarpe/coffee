/**
 * Created by lazar on 3/1/2022.
 * Project name: coffee
 **/
public class VanillaSurprise extends Beverage {

    public static final String NAME = Color.YELLOW_BOLD + "Vanilla Surprise" + Color.RESET;
    public static final double PRICE = 0.45;

    public VanillaSurprise() {
        description = NAME;
    }

    @Override
    public double cost() {
        return super.cost() + PRICE;
    }
}
