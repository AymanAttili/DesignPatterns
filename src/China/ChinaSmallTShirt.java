package China;
import abstracts.TShirt;

public class ChinaSmallTShirt extends TShirt {
    public ChinaSmallTShirt() {
        name = "China Small T-Shirt";
        description = "A small T-shirt sized for China market";
    }
    @Override
    public String formSize() {
        return "small";
    }
}
