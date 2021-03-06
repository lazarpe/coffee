/**
 * Created by lazar on 3/1/2022.
 * Project name: coffee
 **/
public abstract class Beverage {
    protected String description;
    protected double price = 1;

    public String getDescription() {
        return this.description;
    }

    public double cost() {
        return this.price;
    }

    public void printInfos() {
        System.out.println(this.getDescription() + " costs " + Color.BLUE_BOLD + "$" + MathUtils.round(this.cost(), 2) + Color.RESET);
    }
}
