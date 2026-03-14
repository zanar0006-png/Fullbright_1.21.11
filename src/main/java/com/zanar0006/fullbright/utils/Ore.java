public class Ore {
    private String name;

    public Ore(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Ore iron = new Ore("Iron");
        Ore gold = new Ore("Gold");
        Ore diamond = new Ore("Diamond");
        Ore copper = new Ore("Copper");
        Ore lapis = new Ore("Lapis");
        Ore emerald = new Ore("Emerald");
        Ore redstone = new Ore("Redstone");

        // Testing output
        System.out.println(iron.getName());
        System.out.println(gold.getName());
        System.out.println(diamond.getName());
        System.out.println(copper.getName());
        System.out.println(lapis.getName());
        System.out.println(emerald.getName());
        System.out.println(redstone.getName());
    }
}