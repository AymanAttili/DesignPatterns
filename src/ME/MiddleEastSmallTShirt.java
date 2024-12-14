package ME;
import abstracts.TShirt;

public class MiddleEastSmallTShirt extends TShirt {
    public MiddleEastSmallTShirt() {
        name = "Middle East small T-Shirt";
        description = "A small T-shirt sized for Middle East market";
    }
    @Override
    public String formSize() {
        return "small";
    }
}
