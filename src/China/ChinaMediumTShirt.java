package China;
import abstracts.TShirt;

public class ChinaMediumTShirt extends TShirt {
    public ChinaMediumTShirt() {
        name = "China Medium T-Shirt";
        description = "A medium T-shirt sized for China market";
    }
    @Override
    public String formSize() {
        return "medium";
    }
}
