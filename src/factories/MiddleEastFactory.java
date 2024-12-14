package factories;
import ME.MiddleEastLargeTShirt;
import ME.MiddleEastMediumTShirt;
import ME.MiddleEastSmallTShirt;
import abstracts.TShirt;

public class MiddleEastFactory extends TShirtFactory {
    public static TShirt getTShirt(String size) {
        return switch (size.toLowerCase()) {
            case "small" -> new MiddleEastSmallTShirt();
            case "medium" -> new MiddleEastMediumTShirt();
            case "large" -> new MiddleEastLargeTShirt();
            default -> throw new IllegalArgumentException("No T-shirt for given size");
        };
    }

    public static TShirt getTShirt(String region, String size) {
        if(region.compareToIgnoreCase("MiddleEast") != 0)
            throw new IllegalArgumentException("This is a ME factory, and can't create " + region + "T-Shirts");

        return getTShirt(size);
    }
}
