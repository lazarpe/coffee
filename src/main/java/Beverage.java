/**
 * Created by lazar on 3/1/2022.
 * Project name: coffee
 **/
public abstract class Beverage {
    protected String description;
    protected double price;

    public String getDescription() {
        return this.description;
    }

    public double cost() {
        return this.price;
    }
}
