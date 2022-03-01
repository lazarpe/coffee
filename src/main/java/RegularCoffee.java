/**
 * Created by lazar on 3/1/2022.
 * Project name: coffee
 **/
public class RegularCoffee extends Beverage {
    public static final String NAME = "Regular Coffee";
    public static final double PRICE = 0.15;

    public RegularCoffee() {
        description = NAME;
    }

    @Override
    public double cost() {
        return super.cost() + PRICE;
    }
}
