package factories;
import abstracts.TShirt;

public abstract class TShirtFactory {

    public static TShirt getTShirt(String region, String size) {
        if (region.equalsIgnoreCase("MiddleEast")) {
            return MiddleEastFactory.getTShirt(size);
        } else if (region.equalsIgnoreCase("China")) {
            return ChinaFactory.getTShirt(size);
        } else if (region.equalsIgnoreCase("Asia")) {
            return AsiaFactory.getTShirt(size);
        }
        throw new IllegalArgumentException("No T-shirt for given region");
    }
}