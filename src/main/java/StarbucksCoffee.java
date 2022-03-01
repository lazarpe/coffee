public class StarbucksCoffee {
    public static void main(String[] args) {
        OutputUtils.ASCIIArt("Starbucks Coffee","#");
        System.out.println("\n");

        Beverage vanillaSurprise = new VanillaSurprise();
        vanillaSurprise = new WhipCream(vanillaSurprise);
        vanillaSurprise.printInfos();

        Beverage regularCoffee = new RegularCoffee();
        regularCoffee = new WhipCream(regularCoffee);
        regularCoffee = new Caramel(regularCoffee);
        regularCoffee.printInfos();
    }
}
