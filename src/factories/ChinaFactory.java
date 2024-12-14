package factories;
import China.ChinaLargeTShirt;
import China.ChinaMediumTShirt;
import China.ChinaSmallTShirt;
import abstracts.TShirt;

public class ChinaFactory extends TShirtFactory {
    public static TShirt getTShirt(String size) {
        return switch (size.toLowerCase()) {
            case "small" -> new ChinaSmallTShirt();
            case "medium" -> new ChinaMediumTShirt();
            case "large" -> new ChinaLargeTShirt();
            default -> throw new IllegalArgumentException("No T-shirt for given size");
        };
    }

    public static TShirt getTShirt(String region, String size) {
        if(region.compareToIgnoreCase("China") != 0)
            throw new IllegalArgumentException("This is a China factory, and can't create " + region + "T-Shirts");

        return getTShirt(size);
    }
}
