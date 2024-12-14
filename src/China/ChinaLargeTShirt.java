package China;
import abstracts.TShirt;

public class ChinaLargeTShirt extends TShirt {
    public ChinaLargeTShirt() {
        name = "China Large T-Shirt";
        description = "A large T-shirt sized for China market";
    }
    @Override
    public String formSize() {
        return "large";
    }
}
