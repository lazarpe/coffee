public class StarbucksCoffee {
    public static void main(String[] args) {
        OutputUtils.ASCIIArt("Starbucks Coffee","#");

        Beverage beverage = new VanillaSurprise();
        beverage = new WhipCream(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
