package factories;
import Asia.AsiaLargeTShirt;
import Asia.AsiaMediumTShirt;
import Asia.AsiaSmallTShirt;
import abstracts.TShirt;

public class AsiaFactory extends TShirtFactory {
    public static TShirt getTShirt(String size) {
        return switch (size.toLowerCase()) {
            case "small" -> new AsiaSmallTShirt();
            case "medium" -> new AsiaMediumTShirt();
            case "large" -> new AsiaLargeTShirt();
            default -> throw new IllegalArgumentException("No T-shirt for given size");
        };
    }

    public static TShirt getTShirt(String region, String size) {
        if(region.compareToIgnoreCase("China") != 0)
            throw new IllegalArgumentException("This is a China factory, and can't create " + region + "T-Shirts");

        return getTShirt(size);
    }
}
